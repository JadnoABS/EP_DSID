import rpc.Implementation;
//Endpoint publisher
public class Publisher{
    public static void main(String[] args) {
         Endpoint.publish("http://localhost:7779/rpc/", new Implementation());
    }
}