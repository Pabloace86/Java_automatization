public class Zadanie2 {

    public static void main(String[] args) {
        int x,y,z,ret,usl1,ret2;

        x = 66;
        y = 2;
        z = 9;
        ret = 7*x+y;
        usl1 = x*y+37;
        ret2 = 5*y-x;

        if(usl1 > 0){
            int dv =z*2;
            System.out.println(ret);
            System.out.println("Z ="+dv);
        }else{
            System.out.println(ret2);
            if(x != 0){
                int vx = z/x;
                System.out.println("Z ="+vx);
            }else{
                int vp = z/5;
                System.out.println("Z ="+vp);
            }

        }

    }
}
