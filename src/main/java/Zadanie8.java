import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трехзначное число :");

        int a = sc.nextInt();
        int top = a / 100;
        int bot = a % 10;
        int v = a % 100;
        int mid = v / 10;

        if(top > bot){
            System.out.println("Первая цифра больше последней :"+top);
        }else{
            System.out.println("Последняя цифра больше первой :"+bot);
        }

        if (top > mid) {
            System.out.println("Первая цифра больше второй :"+top);
        }else{
            System.out.println("Вторая цифра больше первой :"+mid);
        }

        if (mid > bot) {
            System.out.println("Второая цифра больше последней :"+mid);
        }else{
            System.out.println("Последняя цифра больше второй :"+bot);
        }

    }

}
