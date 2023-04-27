package Principal;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import cursojava.screenmath.modelos.ErroDeConversaoDeAnoException;
import cursojava.screenmath.modelos.Titulo;
import cursojava.screenmath.modelos.TituloOmdb;

public class PrincipalComBusca {
        public static void main(String[] args) throws IOException, InterruptedException {
                Scanner leitura = new Scanner(System.in);
                String busca = "";
                List<Titulo> titulos = new ArrayList<>();
                Gson gson = new GsonBuilder()
                                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                                .setPrettyPrinting()
                                .create();

                while (!busca.equalsIgnoreCase("sair")) {
                        System.out.println("Digite o nome filme ou serie que deseja saber as informações: ");
                        busca = leitura.nextLine();
                        

                        if(busca.equalsIgnoreCase("sair")){
                                break;
                        }

                        try {
                                String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+")
                                                + "&apikey=79a53030";

                                HttpClient client = HttpClient.newHttpClient();
                                HttpRequest request = HttpRequest.newBuilder()
                                                .uri(URI.create(endereco))
                                                .build();
                                HttpResponse<String> response = client
                                                .send(request, BodyHandlers.ofString());

                                String json = response.body();

                                
                                // Titulo meuTitulo = gson.fromJson(json, Titulo.class);
                                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);

                                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                                System.out.println(meuTituloOmdb);
                                System.out.println("Titulo já Convertido.");
                                System.out.println(meuTitulo);

                                titulos.add(meuTitulo);
                        } catch (NumberFormatException e) {
                                System.out.println("Erro referente ao formato de Número.");
                                System.out.println(e.getMessage());
                        } catch (IllegalArgumentException e) {
                                System.out.println("Erro referente a Argumento invalido, verifique o endereço.");
                                System.out.println(e.getMessage());
                        } catch (ErroDeConversaoDeAnoException e) {
                                System.out.println(e.getMenssage());
                        }
                        
                }
                System.out.println(titulos);
                FileWriter escrita = new FileWriter("filmes.json");
                escrita.write(gson.toJson(titulos));
                escrita.close();
                System.out.println("Programa Finalizado Corretamente!");
        }
}
