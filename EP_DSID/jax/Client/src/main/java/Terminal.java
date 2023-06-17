import rpc.RemoteCaller;

import java.util.List;
import java.util.Scanner;

public class Terminal {
    public static void start(RemoteCaller caller) {
        Scanner sc = new Scanner(System.in);

        int procedure;
        Double[] solid = new Double[3];
        String pol;
        Double[] roots;
        String[] thirdRoots;
        long callTime; long responseTime; long elapsedTime;
        do {
            procedure = sc.nextInt();

            switch (procedure) {
                case 1: // emptyReq
                    callTime = System.nanoTime();
                    caller.emptyReq();
                    responseTime = System.nanoTime();
                    elapsedTime = responseTime - callTime;
                    System.out.println("Response delay: " + (double)elapsedTime / 1000000 + " ms");
                    break;
                case 2: // Calculo de volume
                    System.out.println("Enter solid height, length and width:");
                    solid[0] = sc.nextDouble();
                    solid[1] = sc.nextDouble();
                    solid[2] = sc.nextDouble();

                    callTime = System.nanoTime();
                    double volume = caller.geometricVolume(solid);
                    responseTime = System.nanoTime();
                    System.out.println(String.format("Volume = %f", volume));
                    elapsedTime = responseTime - callTime;
                    System.out.println("Response delay: " + (double)elapsedTime / 1000000 + " ms");
                    break;
                case 3: // Calculo de superficie
                    System.out.println("Enter solid height, length and width:");
                    solid[0] = sc.nextDouble();
                    solid[1] = sc.nextDouble();
                    solid[2] = sc.nextDouble();

                    callTime = System.nanoTime();
                    double area = caller.geometricSurface(solid);
                    responseTime = System.nanoTime();
                    System.out.println(String.format("Surface area = %f", area));
                    elapsedTime = responseTime - callTime;
                    System.out.println("Response delay: " + (double)elapsedTime / 1000000 + " ms");
                    break;
                case 4: // Resolucao equacao de segundo grau
                    System.out.println("Enter polynome:");
                    pol = sc.next();

                    callTime = System.nanoTime();
                    roots = caller.secondDegreeSolve(pol);
                    responseTime = System.nanoTime();
                    System.out.println(String.format("x1 = %f | x2 = %f", roots[0], roots[1]));
                    elapsedTime = responseTime - callTime;
                    System.out.println("Response delay: " + (double)elapsedTime / 1000000 + " ms");
                    break;
                case 5: // Resolucao equacao de terceiro grau
                    System.out.println("Enter polynome:");
                    pol = sc.next();
                    callTime = System.nanoTime();
                    thirdRoots = caller.thirdDegreeSolve(pol);
                    responseTime = System.nanoTime();
                    System.out.println(String.format("x1 = %s | x2 = %s | x3 = %s",
                            thirdRoots[0], thirdRoots[1], thirdRoots[2]));
                    elapsedTime = responseTime - callTime;
                    System.out.println("Response delay: " + (double)elapsedTime / 1000000 + " ms");
                    break;
                case 6: // Calculo de derivada
                    System.out.println("Enter polynome:");
                    pol = sc.next();
                    callTime = System.nanoTime();
                    String derivative = caller.polynomeDerivative(pol);
                    responseTime = System.nanoTime();
                    System.out.println(String.format("Derivative: %s", derivative));
                    elapsedTime = responseTime - callTime;
                    System.out.println("Response delay: " + (double)elapsedTime / 1000000 + " ms");
                    break;
            }

        } while (procedure > 0);

    }
}
