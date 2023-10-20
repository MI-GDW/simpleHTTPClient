import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

fun main(args: Array<String>) {
    val client = HttpClient.newBuilder().build();
    val request = HttpRequest.newBuilder()
        .GET()
        //.POST(HttpRequest.BodyPublishers.noBody())
        .uri(URI.create("http://example.org"))
        .build();
    val response = client.send(request, HttpResponse.BodyHandlers.ofString());
    println(response.body())
}

