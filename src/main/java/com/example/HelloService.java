package src.main.java.com.example;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.Map;

public class HelloService {
    public static void main(String[] args) throws IOException {
        int port = 8080;
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

        server.createContext("/hello", new HelloHandler());

        server.setExecutor(null); 
        server.start();

        System.out.println("Server is listening on port " + port);
    }

    static class HelloHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if ("GET".equals(exchange.getRequestMethod())) {
                Map<String, String> queryParams = parseQueryParams(exchange.getRequestURI().getQuery());
                String name = queryParams.get("name");
                String[] interests = queryParams.get("interests").split(",");

                String response = generateResponse(name, interests);

                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        }
    }

    public static String generateResponse(String name, String[] interests) {
        if (name == "") {
            return "Please provide a name in the query parameter.";
        }

        String randomInterest = getRandomInterest(interests);
        return String.format("Nice to meet you %s, I also like %s", name, randomInterest);
    }

    public static String getRandomInterest(String[] interests) {
        if (interests == null || interests.length == 0) {
            return "something";
        }

        int randomIndex = (int) (Math.random() * interests.length);
        return interests[randomIndex];
    }

    public static Map<String, String> parseQueryParams(String query) {
        String[] params = query.split("&");
        Map<String, String> paramMap = new java.util.HashMap<>();

        for (String param : params) {
            String[] keyValue = param.split("=");
            if (keyValue.length == 2) {
                paramMap.put(keyValue[0], keyValue[1]);
            }
        }

        return paramMap;
    }
}
