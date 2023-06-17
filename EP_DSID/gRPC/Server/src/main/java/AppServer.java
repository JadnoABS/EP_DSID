import io.grpc.ServerBuilder;
import io.grpc.Server;
import java.util.logging.Logger;
import java.io.IOException;

import service.Implementation;


public class AppServer {
    private static final Logger logger = Logger.getLogger(AppServer.class.getName());

    public static void main(String args[]) throws IOException, InterruptedException {

        try {
            Server server = ServerBuilder.forPort(50052).addService(new Implementation()).build();

            server.start();

            logger.info("Server started on " + server.getPort());

            server.awaitTermination();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } catch (InterruptedException e) {
            System.out.println("Error: " + e);
        }
    }

}
