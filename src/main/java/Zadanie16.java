import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение :");
        String str = sc.nextLine();

        StringBuffer bufStr = new StringBuffer(str);

        int first = bufStr.indexOf("e");
        int second = bufStr.lastIndexOf("e");

        System.out.println("первая :"+first);
        System.out.println("вторая :"+second);


    }
}
