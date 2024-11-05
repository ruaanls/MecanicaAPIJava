package br.com.fiap;

import br.com.fiap.filter.CorsFilter;
import org.eclipse.yasson.internal.JsonBinding;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.jsonb.JsonBindingFeature;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

/**
 * Main class.
 *
 */
public class Main {
    public static void main(String[] args) {
        URI baseUri = URI.create("http://localhost:8080/");
        ResourceConfig config = new ResourceConfig().packages("br.com.fiap"); // Substitua pelo seu pacote
        HttpServer server = GrizzlyHttpServerFactory.createHttpServer(baseUri, config);
        config.register(CorsFilter.class);
        System.out.println("Servidor rodando em: " + baseUri);
        try {
            server.start();
            Thread.currentThread().join(); // Mantém o servidor rodando
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

