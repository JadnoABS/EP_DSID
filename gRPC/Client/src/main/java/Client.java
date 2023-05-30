import generated.userGrpc;
import generated.userGrpc.userBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import implementation.RequestCaller;
//
public class Client {

    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50052).usePlaintext().build();

        userBlockingStub userStub = userGrpc.newBlockingStub(channel);

        RequestCaller caller = new RequestCaller(userStub);
        caller.start();

    }

}
