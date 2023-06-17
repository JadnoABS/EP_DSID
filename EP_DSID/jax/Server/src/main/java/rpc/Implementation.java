package rpc;
import jakarta.jws.WebService;
import java.util.List;
import java.util.ArrayList;

//rpc.Service Implementation
@WebService(endpointInterface = "rpc.Service")
public class Implementation implements Service {
    @Override
    public void emptyReq() { // Parametros e retorno vazio
        System.out.println("EMPTY REQUEST");
    }

    @Override
    public Double geometricVolume(Double[] solid) { // Calcula volume de um solido
        System.out.println(solid.length);

        double volume = solid[0] * solid[1] * solid[2];
        return volume;
    }

    @Override
    public Double geometricSurface(Double[] solid) { // Calcula area superficial de um solido
        double height = solid[0];
        double width = solid[1];
        double length = solid[2];

        double surf = (height * width * 2) + (height * length * 2) + (width * length * 2);
        return surf;
    }

    @Override
    public Double[] secondDegreeSolve(String polynome) { // Resolve equacoes de segundo grau

        ArrayList<Integer> coeff = GetCoefficients(polynome, true);

        int a = coeff.get(0);
        int b = 0; int c = 0;
        if(coeff.size() >= 2)
            b = coeff.get(1);
        if(coeff.size() >= 3)
            c = coeff.get(2);
        System.out.println(a + " " + b + " " + c);

        double delta = (b*b) - (4 * a * c);
        double x1 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
        double x2 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);

        System.out.println(delta + " " + x1 + " " + x2);

        Double[] result = new Double[2];
        result[0] = x1;
        result[1] = x2;
        return result;
    }

    @Override
    // Retirado de https://www.blogcyberini.com/2017/09/algoritmo-equacao-terceiro-grau.html
    public String[] thirdDegreeSolve(String polynome) { // Resolve equacoes de terceiro grau
        ArrayList<Integer> coeff = GetCoefficients(polynome, true);

        int a = coeff.get(0);
        int b = 0; int c = 0; int d = 0;
        if(coeff.size() >= 2)
            b = coeff.get(1);
        if(coeff.size() >= 3)
            c = coeff.get(2);
        if(coeff.size() >= 4)
            d = coeff.get(3);

        System.out.println(a + " " + b + " " + c);

        double A = b / a;
        double B = c / a;
        double C = d / a;

        String[] roots = new String[3];

        double p = B - A * A / 3.0;
        double q = C + 2 * A * A * A / 27.0 - A * B / 3.0;

        double delta = q * q / 4.0 + p * p * p / 27.0;

        if (delta >= 0) {
            //primeira raiz
            double y1 = Math.cbrt(-q / 2.0 + Math.sqrt(delta)) + Math.cbrt(-q / 2.0 - Math.sqrt(delta));
            roots[0] = String.valueOf(y1 - A / 3.0);
            //discriminante secundário de uma equação do segundo grau
            double delta2 = -3.0 * y1 * y1 - 4.0 * p;
            if (delta2 >= 0) {
                roots[1] = String.valueOf((-y1 + Math.sqrt(delta2)) / 2.0 - A / 3.0);
                roots[2] = String.valueOf((-y1 - Math.sqrt(delta2)) / 2.0 - A / 3.0);
            } else {
                //raízes complexas
                double realPart = -y1 / 2.0;
                double imPart = Math.sqrt(Math.abs(delta2)) / 2.0;
                roots[1] = formatComplexResult(realPart - A / 3.0, imPart);
                roots[2] = formatComplexResult(realPart - A / 3.0, -imPart);
            }
        } else {
            //utiliza a fórmula de Euler para calcular as raízes
            double rho = Math.sqrt(q * q / 4.0 + Math.abs(delta));
            double theta = Math.acos(-q / (2.0 * rho));
            roots[0] = String.valueOf(2.0 * Math.cbrt(rho) * Math.cos(theta / 3.0) - A / 3.0);
            roots[1] = String.valueOf(2.0 * Math.cbrt(rho) * Math.cos((theta + 2.0 * Math.PI) / 3.0) - A / 3.0);
            roots[2] = String.valueOf(2.0 * Math.cbrt(rho) * Math.cos((theta + 4.0 * Math.PI) / 3.0) - A / 3.0);
        }

        System.out.println(roots[0] + " " + roots[1] + " " + roots[2]);

        return roots;
    }

    private static String formatComplexResult(double realPart, double imPart) {
        if (realPart == 0 && imPart == 0) {
            return "0";
        }
        String number = "";
        if (realPart != 0) {
            number += realPart;
            if (imPart > 0) {
                number += "+" + imPart + "i";
            } else if (imPart < 0) {
                number += imPart + "i";
            }
        } else {
            number += imPart + "i";
        }
        return number;
    }


    @Override
    public String polynomeDerivative(String polynome) { // Calcula a derivada de um polinomio

        System.out.println(polynome);
        ArrayList<Integer> coeffs = GetCoefficients(polynome, false);

        ArrayList<Integer> newCoeffs = new ArrayList<Integer>();

        for(int i = 1; i < coeffs.size(); i+=2) {
            newCoeffs.add(coeffs.get(i-1) * coeffs.get(i));
            newCoeffs.add(coeffs.get(i) - 1);
        }

        if(newCoeffs.isEmpty())
            return "0";

        for (int coef : newCoeffs){
            System.out.println(coef);
        }

        String result = new String();
        for(int i = 1; i <= newCoeffs.size(); i+=2) {
            if(newCoeffs.get(i) == 0){
                if(newCoeffs.get(i-1) < 0 || i == 1){
                    result = result.concat(String.format("%d",
                            newCoeffs.get(i-1)
                    ));
                } else {
                    result = result.concat(String.format("+%d",
                            newCoeffs.get(i-1)
                    ));
                }
            } else {
                if(newCoeffs.get(i) < 0 || i == 1) {
                    result = result.concat(String.format("%dx^%d",
                            newCoeffs.get(i-1),
                            newCoeffs.get(i)
                    ));
                } else {
                    System.out.println(String.format("+%dx^%d",
                            newCoeffs.get(i-1),
                            newCoeffs.get(i)
                    ));
                    result = result.concat(String.format("+%dx^%d",
                            newCoeffs.get(i-1),
                            newCoeffs.get(i)
                    ));
                }
            }
        }
        System.out.println(result);

        return result;
    }


    private ArrayList<Integer> GetCoefficients(String eq, boolean withoutExp) {
        String result;
        result = eq.replaceAll("[^0-9\\-\\.]+", " ");
        result= result.replaceAll("-", " -");
        String[] coeffAndExp = result.split(" ");
        ArrayList<Integer> coeff = new ArrayList<Integer>();

        if(withoutExp) { // Retorna lista apenas com coeficientes
            if(coeffAndExp[0].isEmpty())
                coeff.add(1);
            else
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
            if(str.isEmpty())
                coeff.add(1);
            else
                coeff.add(Integer.parseInt(str));
        }
        return coeff;

    }
}