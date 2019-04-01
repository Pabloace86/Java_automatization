public class Zadanie3 {

    public static void main(String[] args) {
        int x = 3;
        int y = 6;
        int sr = (x + y)/2;
        int tan = x - sr;
        if(tan >= 0){
            System.out.println("Возраст Тани отличается на: "+tan);}
        else{
            int tan2 = tan * -1;
            System.out.println("Возраст Тани отличается на: "+tan2);
        }
        int mit = y - sr;
        if(mit >=0){
            System.out.println("Возраст Мити отличается на: "+mit);
        }else{
            int mit2 = mit * -1;
            System.out.println("Возраст Мити отличается на: "+mit2);
        }
    }
}
