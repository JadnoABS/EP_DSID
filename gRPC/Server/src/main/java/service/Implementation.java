package service;


import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
import generated.userGrpc;
import generated.Area;
import generated.Empty;
import generated.IntValue;
import generated.Polynome;
import generated.Solid;
import generated.Volume;
import generated.ThirdDegreeRoot;
import generated.SecondDegreeRoot;

import io.grpc.stub.StreamObserver;

public class Implementation extends userGrpc.userImplBase {

    // Implementacao da logica

    @Override
    public void emptyReq(Empty request, StreamObserver<Empty> response) {
        for (int i = 0; i < 1000; i++){

        }

        response.onCompleted();
    }

    @Override
    public void geometricVolume(Solid solid, StreamObserver<Volume> response) {

        float volume = solid.getHeight() * solid.getLength() * solid.getWidth();

        Volume.Builder result = Volume.newBuilder();
        result.setVolume(volume);

        response.onNext(result.build());
        response.onCompleted();
    }

    @Override
    public void geometricSurface(Solid solid, StreamObserver<Area> response) {
        float height = solid.getHeight();
        float width = solid.getWidth();
        float length = solid.getLength();

        float surf = (height * width * 2) + (height * length * 2) + (width * length * 2);

        Area.Builder result = Area.newBuilder();
        result.setArea(surf);

        response.onNext(result.build());
        response.onCompleted();
    }

    @Override
    public void secondDegreeSolve(Polynome polynome, StreamObserver<SecondDegreeRoot> response) {

        String str = polynome.getPolynome();
        List<Integer> coeff = GetCoefficients(str, true);

        int a = coeff.get(0);
        int b = 0; int c = 0;
        if(coeff.size() >= 2)
            b = coeff.get(1);
        if(coeff.size() >= 3)
            c = coeff.get(2);

        double delta = Math.pow(b, 2) + 4 * a * c;
        double x1 = (-1 * b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-1 * b - Math.sqrt(delta)) / (2 * a);

        response.onNext(SecondDegreeRoot.newBuilder().setX1(x1).setX2(x2).build());
        response.onCompleted();
    }

    @Override
    public void thirdDegreeSolve(Polynome polynome, StreamObserver<ThirdDegreeRoot> response) {
        String str = polynome.getPolynome();
        List<Integer> coeff = GetCoefficients(str, true);

        int a = coeff.get(0);
        int b = 0; int c = 0; int d = 0;
        if(coeff.size() >= 2)
            b = coeff.get(1);
        if(coeff.size() >= 3)
            c = coeff.get(2);
        if(coeff.size() >= 4)
            c = coeff.get(3);

        double A = b / a;
        double B = c / a;
        double C = d / a;

        double x1; double x2; double x3;

        double p = B - A * A / 3.0;
        double q = C + 2 * A * A * A / 27.0 - A * B / 3.0;

        double delta = q * q / 4.0 + p * p * p / 27.0;

        if (delta >= 0) {
            double y1 = Math.cbrt(-q / 2.0 + Math.sqrt(delta)) + Math.cbrt(-q / 2.0 - Math.sqrt(delta));
            x1 = y1 - A / 3.0;

            double delta2 = -3.0 * y1 * y1 - 4.0 * p;
            if (delta2 >= 0) {
                x2 = (-y1 + Math.sqrt(delta2)) / 2.0 - A / 3.0;
                x3 = (-y1 - Math.sqrt(delta2)) / 2.0 - A / 3.0;
            } else {
                x2 = 0;
                x3 = 0;
            }
        } else {
            //utiliza a fórmula de Euler para calcular as raízes
            double rho = Math.sqrt(q * q / 4.0 + Math.abs(delta));
            double theta = Math.acos(-q / (2.0 * rho));
            x1 = 2.0 * Math.cbrt(rho) * Math.cos(theta / 3.0) - A / 3.0;
            x2 = 2.0 * Math.cbrt(rho) * Math.cos((theta + 2.0 * Math.PI) / 3.0) - A / 3.0;
            x3 = 2.0 * Math.cbrt(rho) * Math.cos((theta + 4.0 * Math.PI) / 3.0) - A / 3.0;
        }

        response.onNext(ThirdDegreeRoot.newBuilder()
                .setX1(x1)
                .setX2(x2)
                .setX3(x3)
                .build()
        );

        response.onCompleted();
    }


    @Override
    public void secondDegreeDerivative(Polynome polynome, StreamObserver<Polynome> response) {

    }

    @Override
    public void thirdDegreeDerivative(Polynome polynome, StreamObserver<Polynome> response) {

    }

    private List<Integer> GetCoefficients(String eq, boolean withoutExp) {
        String result;
        result = eq.replaceAll("[^0-9\\-\\.]+", " ");
        result= result.replaceAll("-", " -");
        String[] coeffAndExp = result.split(" ");
        List<Integer> coeff = new ArrayList<Integer>();

        if(withoutExp) { // Retorna lista apenas com coeficientes
            coeff.add(Integer.parseInt(coeffAndExp[0]));
            if(coeffAndExp.length >= 3)
                coeff.add(Integer.parseInt(coeffAndExp[2]));
            if(coeffAndExp.length >= 5)
                coeff.add(Integer.parseInt(coeffAndExp[4]));
            if(coeffAndExp.length >= 7)
                coeff.add(Integer.parseInt(coeffAndExp[6]));

            return coeff;
        }

        // Retorna lista com os coeficientes e os expoentes
        for(String str : coeffAndExp) {
            coeff.add(Integer.parseInt(str));
        }
        return coeff;

    }


}
