package implementation;

import generated.userGrpc;
import generated.userGrpc.userBlockingStub;

import generated.Empty;
import generated.Solid;
import generated.Volume;
import generated.Area;
import generated.Polynome;
import generated.SecondDegreeRoot;
import generated.ThirdDegreeRoot;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class RequestCaller {

    private final userBlockingStub stub;

    public RequestCaller(userBlockingStub stub) {
        this.stub = stub;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        int procedure;
        double h;
        double l;
        double w;
        String pol;
        List<Double> roots;
        List<String> thirdRoots;
        long callTime; long responseTime; long elapsedTime;
        do {
            procedure = sc.nextInt();

            switch (procedure) {
                case 1: // emptyReq
                    callTime = System.nanoTime();
                    this.emptyReq();
                    responseTime = System.nanoTime();
                    elapsedTime = responseTime - callTime;
                    System.out.println("Response delay: " + elapsedTime);
                    break;
                case 2: // Calculo de volume
                    System.out.println("Enter solid height, length and width:");
                    h = sc.nextInt();
                    l = sc.nextInt();
                    w = sc.nextInt();

                    callTime = System.nanoTime();

                    double volume = this.geometricVolume(h, l, w);
                    responseTime = System.nanoTime();
                    System.out.println(String.format("Volume = %f", volume));

                    elapsedTime = responseTime - callTime;
                    System.out.println("Response delay: " + (double)elapsedTime / 1000000 + " ms");
                    break;
                case 3: // Calculo de superficie
                    System.out.println("Enter solid height, length and width:");
                    h = sc.nextInt();
                    l = sc.nextInt();
                    w = sc.nextInt();

                    callTime = System.nanoTime();

                    double area = this.geometricSurface(h, l, w);
                    responseTime = System.nanoTime();
                    System.out.println(String.format("Surface area = %f", area));

                    elapsedTime = responseTime - callTime;
                    System.out.println("Response delay: " + (double)elapsedTime / 1000000 + " ms");
                    break;
                case 4: // Resolucao equacao de segundo grau
                    System.out.println("Enter polynome:");
                    pol = sc.next();
                    System.out.println(pol);

                    callTime = System.nanoTime();

                    roots = this.secondDegreeSolve(pol);
                    responseTime = System.nanoTime();
                    System.out.println(String.format("x1 = %f | x2 = %f", roots.get(0), roots.get(1)));

                    elapsedTime = responseTime - callTime;
                    System.out.println("Response delay: " + (double)elapsedTime / 1000000 + " ms");
                    break;
                case 5: // Resolucao equacao de terceiro grau
                    System.out.println("Enter polynome:");
                    pol = sc.next();

                    callTime = System.nanoTime();

                    thirdRoots = this.thirdDegreeSolve(pol);
                    responseTime = System.nanoTime();
                    System.out.println(String.format("x1 = %s | x2 = %s | x3 = %s",
                            thirdRoots.get(0), thirdRoots.get(1), thirdRoots.get(2)));

                    elapsedTime = responseTime - callTime;
                    System.out.println("Response delay: " + (double)elapsedTime / 1000000 + " ms");
                    break;
                case 6: // Calculo de derivada
                    System.out.println("Enter polynome:");
                    pol = sc.next();

                    callTime = System.nanoTime();

                    String derivative = this.polynomeDerivative(pol);
                    responseTime = System.nanoTime();
                    System.out.println(String.format("Derivative: %s", derivative));

                    elapsedTime = responseTime - callTime;
                    System.out.println("Response delay: " + (double)elapsedTime / 1000000 + " ms");
                    break;
            }

        } while (procedure > 0);

    }

    private void emptyReq() {
        Empty emp = Empty.newBuilder().build();
        Empty response = this.stub.emptyReq(emp);
    }

    private double geometricVolume(double height, double length, double width) {
        Solid solid = Solid.newBuilder()
                .setHeight(height)
                .setLength(length)
                .setWidth(width)
                .build();

        Volume result = this.stub.geometricVolume(solid);
        return result.getVolume();
    }

    private double geometricSurface(double height, double length, double width) {
        Solid solid = Solid.newBuilder()
                .setHeight(height)
                .setLength(length)
                .setWidth(width)
                .build();

        Area result = this.stub.geometricSurface(solid);
        return result.getArea();
    }

    private List<Double> secondDegreeSolve(String pol) {
        Polynome polynome = Polynome.newBuilder().setPolynome(pol).build();
        SecondDegreeRoot result = this.stub.secondDegreeSolve(polynome);
        List<Double> roots = new ArrayList<>();
        roots.add(result.getX1());
        roots.add(result.getX2());
        return roots;
    }

    private List<String> thirdDegreeSolve(String pol) {
        Polynome polynome = Polynome.newBuilder().setPolynome(pol).build();
        ThirdDegreeRoot result = this.stub.thirdDegreeSolve(polynome);
        List<String> roots = new ArrayList<>();
        roots.add(result.getX1());
        roots.add(result.getX2());
        roots.add(result.getX3());
        return roots;
    }

    private String polynomeDerivative(String pol) {
        Polynome polynome = Polynome.newBuilder().setPolynome(pol).build();
        Polynome result = this.stub.polynomeDerivative(polynome);

        return result.getPolynome();
    }

}
