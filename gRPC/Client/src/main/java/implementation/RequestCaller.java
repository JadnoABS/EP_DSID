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
        do {
            procedure = sc.nextInt();

            switch (procedure) {
                case 1:
                    this.emptyReq();
                    break;
                case 2:
                    System.out.println("Enter solid height, length and width:");
                    h = sc.nextInt();
                    l = sc.nextInt();
                    w = sc.nextInt();

                    double volume = this.geometricVolume(h, l, w);
                    System.out.println(String.format("Volume = %f", volume));
                    break;
                case 3:
                    System.out.println("Enter solid height, length and width:");
                    h = sc.nextInt();
                    l = sc.nextInt();
                    w = sc.nextInt();

                    double area = this.geometricSurface(h, l, w);
                    System.out.println(String.format("Surface area = %f", area));
                    break;
                case 4:
                    System.out.println("Enter polynome:");
                    pol = sc.next();
                    System.out.println(pol);
                    roots = this.secondDegreeSolve(pol);
                    System.out.println(String.format("x1 = %f | x2 = %f", roots.get(0), roots.get(1)));
                    break;
                case 5:
                    System.out.println("Enter polynome:");
                    pol = sc.next();
                    roots = this.thirdDegreeSolve(pol);
                    System.out.println(String.format("x1 = %f | x2 = %f | x3 = %f",
                            roots.get(0), roots.get(1), roots.get(2)));
                    break;
                case 6:
                    System.out.println("Enter polynome:");
                    pol = sc.next();
                    String derivative = this.polynomeDerivative(pol);
                    System.out.println(String.format("Derivative: %s", derivative));
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

    private List<Double> thirdDegreeSolve(String pol) {
        Polynome polynome = Polynome.newBuilder().setPolynome(pol).build();
        ThirdDegreeRoot result = this.stub.thirdDegreeSolve(polynome);
        List<Double> roots = new ArrayList<>();
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
