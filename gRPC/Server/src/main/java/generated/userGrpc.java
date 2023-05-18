package generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: sample.proto")
public final class userGrpc {

  private userGrpc() {}

  public static final String SERVICE_NAME = "proto.user";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.Empty,
      generated.Empty> getEmptyReqMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EmptyReq",
      requestType = generated.Empty.class,
      responseType = generated.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Empty,
      generated.Empty> getEmptyReqMethod() {
    io.grpc.MethodDescriptor<generated.Empty, generated.Empty> getEmptyReqMethod;
    if ((getEmptyReqMethod = userGrpc.getEmptyReqMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getEmptyReqMethod = userGrpc.getEmptyReqMethod) == null) {
          userGrpc.getEmptyReqMethod = getEmptyReqMethod = 
              io.grpc.MethodDescriptor.<generated.Empty, generated.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.user", "EmptyReq"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("EmptyReq"))
                  .build();
          }
        }
     }
     return getEmptyReqMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.Solid,
      generated.Volume> getGeometricVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GeometricVolume",
      requestType = generated.Solid.class,
      responseType = generated.Volume.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Solid,
      generated.Volume> getGeometricVolumeMethod() {
    io.grpc.MethodDescriptor<generated.Solid, generated.Volume> getGeometricVolumeMethod;
    if ((getGeometricVolumeMethod = userGrpc.getGeometricVolumeMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getGeometricVolumeMethod = userGrpc.getGeometricVolumeMethod) == null) {
          userGrpc.getGeometricVolumeMethod = getGeometricVolumeMethod = 
              io.grpc.MethodDescriptor.<generated.Solid, generated.Volume>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.user", "GeometricVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Solid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Volume.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("GeometricVolume"))
                  .build();
          }
        }
     }
     return getGeometricVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.Solid,
      generated.Area> getGeometricSurfaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GeometricSurface",
      requestType = generated.Solid.class,
      responseType = generated.Area.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Solid,
      generated.Area> getGeometricSurfaceMethod() {
    io.grpc.MethodDescriptor<generated.Solid, generated.Area> getGeometricSurfaceMethod;
    if ((getGeometricSurfaceMethod = userGrpc.getGeometricSurfaceMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getGeometricSurfaceMethod = userGrpc.getGeometricSurfaceMethod) == null) {
          userGrpc.getGeometricSurfaceMethod = getGeometricSurfaceMethod = 
              io.grpc.MethodDescriptor.<generated.Solid, generated.Area>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.user", "GeometricSurface"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Solid.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Area.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("GeometricSurface"))
                  .build();
          }
        }
     }
     return getGeometricSurfaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.Polynome,
      generated.SecondDegreeRoot> getSecondDegreeSolveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SecondDegreeSolve",
      requestType = generated.Polynome.class,
      responseType = generated.SecondDegreeRoot.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Polynome,
      generated.SecondDegreeRoot> getSecondDegreeSolveMethod() {
    io.grpc.MethodDescriptor<generated.Polynome, generated.SecondDegreeRoot> getSecondDegreeSolveMethod;
    if ((getSecondDegreeSolveMethod = userGrpc.getSecondDegreeSolveMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getSecondDegreeSolveMethod = userGrpc.getSecondDegreeSolveMethod) == null) {
          userGrpc.getSecondDegreeSolveMethod = getSecondDegreeSolveMethod = 
              io.grpc.MethodDescriptor.<generated.Polynome, generated.SecondDegreeRoot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.user", "SecondDegreeSolve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Polynome.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.SecondDegreeRoot.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("SecondDegreeSolve"))
                  .build();
          }
        }
     }
     return getSecondDegreeSolveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.Polynome,
      generated.ThirdDegreeRoot> getThirdDegreeSolveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ThirdDegreeSolve",
      requestType = generated.Polynome.class,
      responseType = generated.ThirdDegreeRoot.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Polynome,
      generated.ThirdDegreeRoot> getThirdDegreeSolveMethod() {
    io.grpc.MethodDescriptor<generated.Polynome, generated.ThirdDegreeRoot> getThirdDegreeSolveMethod;
    if ((getThirdDegreeSolveMethod = userGrpc.getThirdDegreeSolveMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getThirdDegreeSolveMethod = userGrpc.getThirdDegreeSolveMethod) == null) {
          userGrpc.getThirdDegreeSolveMethod = getThirdDegreeSolveMethod = 
              io.grpc.MethodDescriptor.<generated.Polynome, generated.ThirdDegreeRoot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.user", "ThirdDegreeSolve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Polynome.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ThirdDegreeRoot.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("ThirdDegreeSolve"))
                  .build();
          }
        }
     }
     return getThirdDegreeSolveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.Polynome,
      generated.Polynome> getSecondDegreeDerivativeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SecondDegreeDerivative",
      requestType = generated.Polynome.class,
      responseType = generated.Polynome.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Polynome,
      generated.Polynome> getSecondDegreeDerivativeMethod() {
    io.grpc.MethodDescriptor<generated.Polynome, generated.Polynome> getSecondDegreeDerivativeMethod;
    if ((getSecondDegreeDerivativeMethod = userGrpc.getSecondDegreeDerivativeMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getSecondDegreeDerivativeMethod = userGrpc.getSecondDegreeDerivativeMethod) == null) {
          userGrpc.getSecondDegreeDerivativeMethod = getSecondDegreeDerivativeMethod = 
              io.grpc.MethodDescriptor.<generated.Polynome, generated.Polynome>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.user", "SecondDegreeDerivative"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Polynome.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Polynome.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("SecondDegreeDerivative"))
                  .build();
          }
        }
     }
     return getSecondDegreeDerivativeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.Polynome,
      generated.Polynome> getThirdDegreeDerivativeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ThirdDegreeDerivative",
      requestType = generated.Polynome.class,
      responseType = generated.Polynome.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Polynome,
      generated.Polynome> getThirdDegreeDerivativeMethod() {
    io.grpc.MethodDescriptor<generated.Polynome, generated.Polynome> getThirdDegreeDerivativeMethod;
    if ((getThirdDegreeDerivativeMethod = userGrpc.getThirdDegreeDerivativeMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getThirdDegreeDerivativeMethod = userGrpc.getThirdDegreeDerivativeMethod) == null) {
          userGrpc.getThirdDegreeDerivativeMethod = getThirdDegreeDerivativeMethod = 
              io.grpc.MethodDescriptor.<generated.Polynome, generated.Polynome>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.user", "ThirdDegreeDerivative"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Polynome.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Polynome.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("ThirdDegreeDerivative"))
                  .build();
          }
        }
     }
     return getThirdDegreeDerivativeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userStub newStub(io.grpc.Channel channel) {
    return new userStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userFutureStub(channel);
  }

  /**
   */
  public static abstract class userImplBase implements io.grpc.BindableService {

    /**
     */
    public void emptyReq(generated.Empty request,
        io.grpc.stub.StreamObserver<generated.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEmptyReqMethod(), responseObserver);
    }

    /**
     */
    public void geometricVolume(generated.Solid request,
        io.grpc.stub.StreamObserver<generated.Volume> responseObserver) {
      asyncUnimplementedUnaryCall(getGeometricVolumeMethod(), responseObserver);
    }

    /**
     */
    public void geometricSurface(generated.Solid request,
        io.grpc.stub.StreamObserver<generated.Area> responseObserver) {
      asyncUnimplementedUnaryCall(getGeometricSurfaceMethod(), responseObserver);
    }

    /**
     */
    public void secondDegreeSolve(generated.Polynome request,
        io.grpc.stub.StreamObserver<generated.SecondDegreeRoot> responseObserver) {
      asyncUnimplementedUnaryCall(getSecondDegreeSolveMethod(), responseObserver);
    }

    /**
     */
    public void thirdDegreeSolve(generated.Polynome request,
        io.grpc.stub.StreamObserver<generated.ThirdDegreeRoot> responseObserver) {
      asyncUnimplementedUnaryCall(getThirdDegreeSolveMethod(), responseObserver);
    }

    /**
     */
    public void secondDegreeDerivative(generated.Polynome request,
        io.grpc.stub.StreamObserver<generated.Polynome> responseObserver) {
      asyncUnimplementedUnaryCall(getSecondDegreeDerivativeMethod(), responseObserver);
    }

    /**
     */
    public void thirdDegreeDerivative(generated.Polynome request,
        io.grpc.stub.StreamObserver<generated.Polynome> responseObserver) {
      asyncUnimplementedUnaryCall(getThirdDegreeDerivativeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEmptyReqMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Empty,
                generated.Empty>(
                  this, METHODID_EMPTY_REQ)))
          .addMethod(
            getGeometricVolumeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Solid,
                generated.Volume>(
                  this, METHODID_GEOMETRIC_VOLUME)))
          .addMethod(
            getGeometricSurfaceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Solid,
                generated.Area>(
                  this, METHODID_GEOMETRIC_SURFACE)))
          .addMethod(
            getSecondDegreeSolveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Polynome,
                generated.SecondDegreeRoot>(
                  this, METHODID_SECOND_DEGREE_SOLVE)))
          .addMethod(
            getThirdDegreeSolveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Polynome,
                generated.ThirdDegreeRoot>(
                  this, METHODID_THIRD_DEGREE_SOLVE)))
          .addMethod(
            getSecondDegreeDerivativeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Polynome,
                generated.Polynome>(
                  this, METHODID_SECOND_DEGREE_DERIVATIVE)))
          .addMethod(
            getThirdDegreeDerivativeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Polynome,
                generated.Polynome>(
                  this, METHODID_THIRD_DEGREE_DERIVATIVE)))
          .build();
    }
  }

  /**
   */
  public static final class userStub extends io.grpc.stub.AbstractStub<userStub> {
    private userStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userStub(channel, callOptions);
    }

    /**
     */
    public void emptyReq(generated.Empty request,
        io.grpc.stub.StreamObserver<generated.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmptyReqMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void geometricVolume(generated.Solid request,
        io.grpc.stub.StreamObserver<generated.Volume> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGeometricVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void geometricSurface(generated.Solid request,
        io.grpc.stub.StreamObserver<generated.Area> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGeometricSurfaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void secondDegreeSolve(generated.Polynome request,
        io.grpc.stub.StreamObserver<generated.SecondDegreeRoot> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSecondDegreeSolveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void thirdDegreeSolve(generated.Polynome request,
        io.grpc.stub.StreamObserver<generated.ThirdDegreeRoot> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getThirdDegreeSolveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void secondDegreeDerivative(generated.Polynome request,
        io.grpc.stub.StreamObserver<generated.Polynome> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSecondDegreeDerivativeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void thirdDegreeDerivative(generated.Polynome request,
        io.grpc.stub.StreamObserver<generated.Polynome> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getThirdDegreeDerivativeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class userBlockingStub extends io.grpc.stub.AbstractStub<userBlockingStub> {
    private userBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userBlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.Empty emptyReq(generated.Empty request) {
      return blockingUnaryCall(
          getChannel(), getEmptyReqMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.Volume geometricVolume(generated.Solid request) {
      return blockingUnaryCall(
          getChannel(), getGeometricVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.Area geometricSurface(generated.Solid request) {
      return blockingUnaryCall(
          getChannel(), getGeometricSurfaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.SecondDegreeRoot secondDegreeSolve(generated.Polynome request) {
      return blockingUnaryCall(
          getChannel(), getSecondDegreeSolveMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.ThirdDegreeRoot thirdDegreeSolve(generated.Polynome request) {
      return blockingUnaryCall(
          getChannel(), getThirdDegreeSolveMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.Polynome secondDegreeDerivative(generated.Polynome request) {
      return blockingUnaryCall(
          getChannel(), getSecondDegreeDerivativeMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.Polynome thirdDegreeDerivative(generated.Polynome request) {
      return blockingUnaryCall(
          getChannel(), getThirdDegreeDerivativeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class userFutureStub extends io.grpc.stub.AbstractStub<userFutureStub> {
    private userFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Empty> emptyReq(
        generated.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getEmptyReqMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Volume> geometricVolume(
        generated.Solid request) {
      return futureUnaryCall(
          getChannel().newCall(getGeometricVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Area> geometricSurface(
        generated.Solid request) {
      return futureUnaryCall(
          getChannel().newCall(getGeometricSurfaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.SecondDegreeRoot> secondDegreeSolve(
        generated.Polynome request) {
      return futureUnaryCall(
          getChannel().newCall(getSecondDegreeSolveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.ThirdDegreeRoot> thirdDegreeSolve(
        generated.Polynome request) {
      return futureUnaryCall(
          getChannel().newCall(getThirdDegreeSolveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Polynome> secondDegreeDerivative(
        generated.Polynome request) {
      return futureUnaryCall(
          getChannel().newCall(getSecondDegreeDerivativeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Polynome> thirdDegreeDerivative(
        generated.Polynome request) {
      return futureUnaryCall(
          getChannel().newCall(getThirdDegreeDerivativeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EMPTY_REQ = 0;
  private static final int METHODID_GEOMETRIC_VOLUME = 1;
  private static final int METHODID_GEOMETRIC_SURFACE = 2;
  private static final int METHODID_SECOND_DEGREE_SOLVE = 3;
  private static final int METHODID_THIRD_DEGREE_SOLVE = 4;
  private static final int METHODID_SECOND_DEGREE_DERIVATIVE = 5;
  private static final int METHODID_THIRD_DEGREE_DERIVATIVE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EMPTY_REQ:
          serviceImpl.emptyReq((generated.Empty) request,
              (io.grpc.stub.StreamObserver<generated.Empty>) responseObserver);
          break;
        case METHODID_GEOMETRIC_VOLUME:
          serviceImpl.geometricVolume((generated.Solid) request,
              (io.grpc.stub.StreamObserver<generated.Volume>) responseObserver);
          break;
        case METHODID_GEOMETRIC_SURFACE:
          serviceImpl.geometricSurface((generated.Solid) request,
              (io.grpc.stub.StreamObserver<generated.Area>) responseObserver);
          break;
        case METHODID_SECOND_DEGREE_SOLVE:
          serviceImpl.secondDegreeSolve((generated.Polynome) request,
              (io.grpc.stub.StreamObserver<generated.SecondDegreeRoot>) responseObserver);
          break;
        case METHODID_THIRD_DEGREE_SOLVE:
          serviceImpl.thirdDegreeSolve((generated.Polynome) request,
              (io.grpc.stub.StreamObserver<generated.ThirdDegreeRoot>) responseObserver);
          break;
        case METHODID_SECOND_DEGREE_DERIVATIVE:
          serviceImpl.secondDegreeDerivative((generated.Polynome) request,
              (io.grpc.stub.StreamObserver<generated.Polynome>) responseObserver);
          break;
        case METHODID_THIRD_DEGREE_DERIVATIVE:
          serviceImpl.thirdDegreeDerivative((generated.Polynome) request,
              (io.grpc.stub.StreamObserver<generated.Polynome>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.Proto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("user");
    }
  }

  private static final class userFileDescriptorSupplier
      extends userBaseDescriptorSupplier {
    userFileDescriptorSupplier() {}
  }

  private static final class userMethodDescriptorSupplier
      extends userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (userGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userFileDescriptorSupplier())
              .addMethod(getEmptyReqMethod())
              .addMethod(getGeometricVolumeMethod())
              .addMethod(getGeometricSurfaceMethod())
              .addMethod(getSecondDegreeSolveMethod())
              .addMethod(getThirdDegreeSolveMethod())
              .addMethod(getSecondDegreeDerivativeMethod())
              .addMethod(getThirdDegreeDerivativeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
