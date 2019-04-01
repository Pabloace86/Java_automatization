public class Zadanie4 {
    public static void main(String[] args) {
        double cels = 280.15;
        System.out.println("Температура по Цельсию: "+cels);
        double far = (cels * 1.8)+32;
        System.out.println("Температура по Фаренгейту: "+far);
        double kel= 273.15;
        if(cels<kel){
            double kel1 = (kel - cels)* -1;
            System.out.println("Температура по Келвену: "+kel1);
        }else{
           double ke = cels - kel;
            System.out.println("Температура по Келвену: "+ke);
        }

    }
}
