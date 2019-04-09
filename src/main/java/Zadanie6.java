public class Zadanie6 {
    public static void main(String[] args) {
        final double P = 3.14;
        //радиус круга
        double r = 5;
        //диаметр круга
        double d = r*2;
        //площадь круга
        double krug = P * (Math.pow(r,2));
        System.out.println("Площадь круга = "+ krug);
        //сторона квадрата
        double s = 15;
        //диагональ квадрата
        double dg = s * Math.sqrt(2);
        //площадь квадрата
        double kvad = Math.pow(s,2);
        System.out.println("Площадь квадрата "+  kvad);

        if(krug <= s){
            System.out.println("Круг поместится в квадрате");
        }else {
            System.out.println("Круг не поместится в квадрате");
        }

        if(dg<d){
            System.out.println("Квадрат поместится в круге");
        }else {
            System.out.println("Квадрат не поместится в круге");
        }
    }
}
