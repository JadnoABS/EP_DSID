package rpc;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;
import java.util.ArrayList;

//rpc.Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface Service{
    @WebMethod public void emptyReq();
    @WebMethod public Double geometricVolume(Double[] solid);
    @WebMethod public Double geometricSurface(Double[] solid);
    @WebMethod public Double[] secondDegreeSolve(String polynome);
    @WebMethod public String[] thirdDegreeSolve(String polynome);
    @WebMethod public String polynomeDerivative(String polynome);
}
