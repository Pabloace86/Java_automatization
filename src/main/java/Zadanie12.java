public class Zadanie12 {

    public static void main(String[] args) {

        int X = 200;
        int Y = 17;
        int min = 0;

        do {
            min++;
            if ((min > X)&&(min%Y == 0)) {
                System.out.println("Результат: " + min);
            break;
            }
        }
        while (min < 250);

    }
}
