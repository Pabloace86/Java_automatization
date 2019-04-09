import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввести значение для n :");
        int n = sc.nextInt();
        System.out.println("Ввести значение для m :");
        int m = sc.nextInt();

        int ost = n%m;
        int chas = n/m;

        if(ost == 0){
            System.out.println("Частное от деления n на m :"+chas);
        }else{
            System.out.println("m на n нацело не делится");
        }
    }
}
