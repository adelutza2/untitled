package lab2;

public class Main {
    public static void main(String[] args) {
int i = mult (5,6);
        System.out.println(i);
        int ii = imp (100,5);
        System.out.println(ii);
        int iii = rez (6,9);
        System.out.println(iii);
    }

    public static int mult(int first, int second) {
        int mult = first * second ;
        return mult;
    }

    public static int imp(int first,int second){
        int imp = second / first;
        return imp ;

    }
    public static int rez( int first,int second){
        int rez = second % first ;
        return rez;
    }


}
