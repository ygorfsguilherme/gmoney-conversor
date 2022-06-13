package com.gmoney.control;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

public class getMoney {

    public static double getMoeda(String moeda) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://economia.awesomeapi.com.br/last/" + moeda + "-BRL"))
                    .timeout(Duration.ofSeconds(10))
                    .build();
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            String body = response.body();
            String value = body.substring(body.indexOf("ask") + 6, body.indexOf("ask") + 10);
            double valueDouble = Double.parseDouble(value);
            return valueDouble;

        } catch (Exception e) {
            return 0;
        }
    }
}
