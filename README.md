Recording Link:  Humanshu Arora https://screenrec.com/share/OveVPy7YHK

Task 1
1. I already had the Java environment on my laptop because I worked with the basics of java in my second year.
2. To install bazel I used the documentation at the official website(https://bazel.build/).

Task 2
1. To create a simple RESTful web service in Java, I utilized the Java HTTP server package to set up an HTTP server that listens for incoming RESTful requests.
2. To run this service, use the following API:
URL: http://localhost:8080/hello
Query Parameters:
Name: Your name
Interests: A comma-separated list of interests, e.g., "Interest1, Interest2”
          For example:http://localhost:8080/hello?name=John&interests=Cooking,Yoga
Task 3
1. To create a unit test for the "hello" function, I employed the JUnit testing framework, a widely used and robust tool for testing Java code.

Task 4
1. To compile the code using Bazel, I utilized the following command:
		 bazel build  //:target_name
In this command, bazel is the build tool, build is the action to build the code, and //:target_name represents the Bazel target you want to build. Bazel uses targets to specify which part of your codebase should be built.

Task 5
1. To run tests using Bazel, I executed the following command:
		bazel test  //:target_name
To run tests using Bazel, I executed the following command: bash Copy code bazel test //:target_name in this command, bazel is the build tool, test is the action to run tests, and //:target_name represents the Bazel target for which you want to execute tests.

Task 6
1. To execute a Bazel target using the bazel, I used the following:
		bazel run //:target_name
With this command, bazel is the build tool, run is the action to execute the target, and //:target_name represents the Bazel target you want to run. This command allows you to launch the specified target, such as a Java binary or any other executable, using Bazel.

Task 7
1. To create the runnable jar first I ran the command: bazel build "target_name_deploy.jar"
2. And then I ran the command: java -jar bazel-bin/target_name_deploy.jar
These commands will start my service via the runnable jar.
