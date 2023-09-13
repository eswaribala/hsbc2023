package com.hsbc.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ClientAsyncApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step 1
		HttpClient httpClient=HttpClient.newBuilder()
	            .version(HttpClient.Version.HTTP_1_1)
	            .connectTimeout(Duration.ofSeconds(10))
	            .build();
		
		//step2
		HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://localhost:7070/customers/v1.0/"))
                // add request header
                .setHeader("User-Agent", "Java 11 HttpClient Bot") 
                .build();
		
		//step3 
		
			CompletableFuture<HttpResponse<String>> response=
					httpClient.sendAsync
					(request, HttpResponse.BodyHandlers.ofString());
			//System.out.println(response.body().toString());
		
		  try {
			String result=response.thenApplyAsync(HttpResponse::body)
					  .get(5,TimeUnit.SECONDS);
			System.out.println(result);
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		
		
		

		
		
	}

}
