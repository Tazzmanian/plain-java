package bawp.programming.courseapp;

import bawp.programming.coursedatabase.CourseServer;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    public static void main(String[] args) {
        CourseServer courseServer = new CourseServer();
        courseServer.getCourses().forEach(x -> {
            System.out.println("Course " + x.getCourseName());
        });

        HttpClient httpClient = HttpClient.newHttpClient();
        try {
            HttpRequest httpRequest = (HttpRequest) HttpRequest.newBuilder()
                    .uri(new URI("https://www.facebook.com"))
                    .GET().build();
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
