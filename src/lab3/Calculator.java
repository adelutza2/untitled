package lab3;

public class Calculator {
    public int adunare(int primulNumar, int alDoileaNumar) {

        int rezultat = primulNumar + alDoileaNumar;

        return rezultat;

    }
    public int scadere(int primulNumar, int alDoileaNumar) {

        int rezultat = primulNumar - alDoileaNumar;

        return rezultat;

    }
    public  int inmultire(int primulNumar, int alDoileaNumar) {

        int rezultat = primulNumar * alDoileaNumar;

        return rezultat;
}
    public int impartire(int primulNumar, int alDoileaNumar) {

        int rezultat = primulNumar / alDoileaNumar;

        return rezultat;
    }
    public int sum() {
        int sum = 7 + 8 + 6;
        return sum;
    }
    public int inmult() {
        int inmult = 9 * 9 * 10;
        return inmult;
    }
    public int sum2(){
        int sum2 = (7 + 2 + 3) / 3;
        return sum2;
    }
    public int div(){
        int div = 185 / 56;
        return div;
    }
    public static void doStuff(int y){
        System.out.println(y);
    }
    double celsius(double f)
    {
        return (f-32)*5/9;
    }
    double meters(int inches)
    {
        return inches * 0.0254;
    }
    double speed1(int distance,int hours,int minutes,int second)
    {
//Speed = Distance / Time
        int timeseconds=(hours*3600) + (minutes*60)+second;
        return distance/timeseconds;
    }
    double speed2(int distance,int hours,int minutes,int second)
    {
//Speed = Distance / Time
        int timeseconds=hours + (minutes/60);
        int km=distance/1000;
        return km/timeseconds;
    }
    double speed3(int distance,int hours,int minutes,int second)
    {
//Speed = Distance / Time
        int timeseconds=hours + (minutes/60);
        int km=distance/1609;
        return km/timeseconds;
    }
}


