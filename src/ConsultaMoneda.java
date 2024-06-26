import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public Moneda buscaMoneda (String tipoMoneda1, String tipoMoneda2, int cantidad) throws IOException, InterruptedException {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/032d311090a892e96db40c80/pair/"+tipoMoneda1+"/"+tipoMoneda2+"/"+cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();


            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        }

}
