import jakarta.xml.ws.Service;
import rpc.RemoteCaller;

import javax.xml.namespace.QName;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws Exception{
        URL serviceURL = new URL("http://localhost:7779/rpc/?wsdl");
        QName qname = new QName("http://rpc/", "ImplementationService");
        QName port_name = new QName("http://rpc/", "ImplementationPort");
        Service service = Service.create(serviceURL, qname);
        RemoteCaller caller = service.getPort(port_name, RemoteCaller.class);
        Terminal.start(caller);
    }


}
