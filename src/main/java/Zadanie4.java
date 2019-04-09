import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.println("Ввести значение :");
        double cels = sk.nextDouble();

        System.out.println("Температура по Цельсию: "+cels);
        double far = (cels * 1.8)+32;
        System.out.println("Температура по Фаренгейту: "+far);
        double kel= 273.15;
        double kel1 = kel + cels;
        System.out.println("Температура по Келвену: "+kel1);


    }
}
