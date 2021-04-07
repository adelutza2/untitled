package AnimalRescue;

public class Dog {
    private String name;
    private String breed;
    private int ani;
    private String color;
    private float weight;
    private int heightincm;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     public String getBreed(){
        return breed;
     }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public int getAni(){
        return ani;
    }
    public void setAni(int ani){
        this.ani = ani;
    }
public String getColor(){
        return color;
}
    public void Colorf(String color) {
        this.color = color;
    }
    public float getWeight(){
        return weight;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }
    public int getHeightincm(){
        return heightincm;
    }
        public void setHeightincm ( int heightincm){
            this.heightincm = heightincm;
        }


    public void bark() {
        System.out.println("hamhamham");
    }

    public void sleep() {
        System.out.println("brrrbrrrbrrrbrrr");
    }

    public void play() {
        System.out.println("wufwufwufwuf");
    }

    public void eat() {
        System.out.println("crant crant");
    }

}

