
public class Zadanie11 {

    public static void main(String[] args) {
        int z = 0;
        int [] ar = {1,2,5,9,6,5,3,9,8};

        for (int i = 0; i < ar.length; i++) {

            if (ar[i] % 2 == 0){
                z ++ ;
            }

        }

        System.out.println("Количество четных чисел в массиве: "+z);
    }
}
