package lab2;


public class Main {
    public static void main(String[] args) {
        printMyName();
        System.out.println("Rezultatul adunarii este: " + adunare(2, 3));

        System.out.println("Rezultatul scaderii este: " + scadere(17, 5));
        System.out.println("Rezultatul inmultirii este:" + inmultire(18, 17));
        System.out.println("Rezultatul impartirii este:" + impartire(120, 60));
        System.out.println("      j       a        v     v       a");
        System.out.println("      j      a a        v   v       a a ");
        System.out.println(" j    j     aaaaa        v v       aaaaa ");
        System.out.println("  jjj     a       a       v       a      a ");
        int suma = sum();
        System.out.println(suma);
        int inmult = inmult();
        System.out.println(inmult);
        System.out.println("  +\"\"\"\"\"+");
        System.out.println(" [| o o |]");
        System.out.println("  |  ^  |");
        System.out.println("  | '-' |");
        System.out.println("  +-----+");
        System.out.println(div());
        double x = 5;
        x /= 3;
        System.out.println(x);

        double y = 5/9 * (x - 32);
        x = 145.32f;
        System.out.println(y);
        doStuff(5);
        int z = 10;
        doStuff(z);

    }

    {
    }

    public static int adunare(int primulNumar, int alDoileaNumar) {

        int rezultat = primulNumar + alDoileaNumar;

        return rezultat;

    }

    public static void printMyName() {
        System.out.println("Heloo \n Adela");
    }

    public static int scadere(int primulNumar, int alDoileaNumar) {

        int rezultat = primulNumar - alDoileaNumar;

        return rezultat;

    }

    public static int inmultire(int primulNumar, int alDoileaNumar) {

        int rezultat = primulNumar * alDoileaNumar;

        return rezultat;
    }

    public static int impartire(int primulNumar, int alDoileaNumar) {

        int rezultat = primulNumar / alDoileaNumar;

        return rezultat;
    }


    public static int sum() {
        int sum = 7 + 8 + 6;
        return sum;
    }

    public static int inmult() {
        int inmult = 9 * 9 * 10;
        return inmult;
    }

    public static void printFace() {
        System.out.println();
    }
    public static int div(){
        int div = 185 / 56;
        return div;
    }
public static void doStuff(int y){
    System.out.println(y);
}
}




