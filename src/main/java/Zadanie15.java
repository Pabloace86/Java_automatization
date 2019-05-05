import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение :");
        String str = sc.nextLine();
        int pow = 0;

        do {
            pow++;
            if ((str.charAt(pow) == 'н') && (str.charAt(pow + 1) == 'н'))
                System.out.println("нн");
        }while (pow < str.length());


    }
}
