import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название футбольного клуба: ");
        String fcName = sc.nextLine();
        int len = fcName.length();
        System.out.println("Кол-во символов в названии: "+len);
    }
}
