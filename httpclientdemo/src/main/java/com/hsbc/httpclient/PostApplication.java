package com.hsbc.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class PostApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		HttpClient httpClient=HttpClient.newBuilder()
				 .version(HttpClient.Version.HTTP_1_1)
		            .connectTimeout(Duration.ofSeconds(10))
				.build();
		
		// form parameters
        Map<Object, Object> data = new HashMap<>();
        data.put("firstName", "Parameswari");
        data.put("lastName", "Bala");
        data.put("email", "param@gmail.com");
        HttpRequest request = HttpRequest.newBuilder()
                .POST(ofFormData(data))
                .uri(URI.create("http://localhost:4000/customers/v1.0/"))
                .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                .header("Content-Type", "application/x-www-form-urlencoded")
                .build();   
        
        HttpResponse<String> response;
		try {
			response = httpClient.send(request, 
					HttpResponse.BodyHandlers.ofString());
			// print status code
	        System.out.println(response.statusCode());

	        // print response body
	        System.out.println(response.body());
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        
        	
	}
	
	public static HttpRequest.BodyPublisher ofFormData(Map<Object, Object> data) {
        var builder = new StringBuilder();
        for (Map.Entry<Object, Object> entry : data.entrySet()) {
            if (builder.length() > 0) {
                builder.append("&");
            }
            builder.append(URLEncoder.encode(entry.getKey().toString(), StandardCharsets.UTF_8));
            builder.append("=");
            builder.append(URLEncoder.encode(entry.getValue().toString(), StandardCharsets.UTF_8));
        }
        return HttpRequest.BodyPublishers.ofString(builder.toString());
    }

}
