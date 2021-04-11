package AnimalRescue;

public class Animal {
    private String name;
    private int ani;
    private String color;
    private float weight;
    private int heightincm;
    public boolean male;

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAni() {
        return ani;
    }

    public void setAni(int ani) {
        this.ani = ani;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public int getHeightincm(){
        return heightincm;
    }
    public void setHeightincm ( int heightincm){
        this.heightincm = heightincm;
    }



public void speack () {
    System.out.println(" i am speacking ");
}
public void eat(){
    System.out.println(" i eat food all the time ");
}
public void run(){
    System.out.println(" run run run run ");

}
public void sleep(){
    System.out.println(" noise noise noise ");
}

public void play(){
    System.out.println(" wuf wuf wuf ");
}
}


