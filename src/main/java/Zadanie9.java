import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трехзначное число :");

        int a = sc.nextInt();
        int top = a / 100;
        int bot = a % 10;
        int v = a % 100;
        int mid = v / 10;

        if (top == 6|bot == 6|mid == 6){
            System.out.println("цифра 6 входит в число");
        }else {
            System.out.println("цифра 6 не входит в число");
        }

        System.out.println("Введите значение n :");
        int n = sc.nextInt();

        if (top == n|bot == n|mid == n){
            System.out.println("цифра "+n+" входит в число");
        }else {
            System.out.println("цифра "+n+" не входит в число");
        }



    }
}
