load("@rules_jvm_external//:defs.bzl", "artifact")

java_library(
    name = "my-java-lib",
    srcs = glob(["src/main/java/com/example/*.java"]),
    visibility = ["//visibility:public"],
    deps = [
        "@maven//:junit_junit",  
    ],
)

java_binary(
    name = "Hello",
    srcs = ["src/main/java/com/example/HelloService.java"],  
    main_class = "src.main.java.com.example.HelloService",  
    visibility = ["//visibility:public"],
    deps = [
        ":my-java-lib",  
    ],
)

java_test(
    name = "NullNameTest",
    srcs = glob(["src/test/java/com/example/*.java"]),
    test_class = "src.test.java.com.example.NullNameTest",
    deps = [
        ":my-java-lib",  
        "@maven//:junit_junit",  
    ],
)

java_test(
    name = "NullInterestTest",
    srcs = glob(["src/test/java/com/example/*.java"]),  
    test_class = "src.test.java.com.example.NullInterestTest",
    deps = [
        ":my-java-lib",  
        "@maven//:junit_junit",  
    ],
)
java_test(
    name = "GetRandomTest",
    srcs = glob(["src/test/java/com/example/*.java"]), 
    test_class = "src.test.java.com.example.GetRandomTest",
    deps = [
        ":my-java-lib",  
        "@maven//:junit_junit",  
    ]
)

java_test(
    name = "HelloServiceTest",
    srcs = glob(["src/test/java/com/example/*.java"]),  
    test_class = "src.test.java.com.example.HelloServiceTest",
    deps = [
        ":my-java-lib",  
        "@maven//:junit_junit", 
    ],
)