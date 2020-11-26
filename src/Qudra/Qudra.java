package Qudra;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Qudra {


    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());
        double c = Double.parseDouble(reader.readLine());
        double disc = Math.pow(b, 2) - 4 * a * c;
        if (disc == 0) {
            double x1 = (-1 * b - Math.pow(disc, 0.5)) / (2 * a);
            System.out.println(x1);

        } else if (disc < 0) {
            System.out.println("Уравнение не имеет вещественных корней");
        } else {
            double x1 = ((-1 * b - Math.pow(disc, 0.5)) / (2 * a));
            double x2 = ((-1 * b + Math.pow(disc, 0.5)) / (2 * a));
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}



