package AnimalRescue;

public class Girl {
    String name;
    String Breed;
    int ani;
    String colorhair;
    float weight;
    int heightincm;

    public String getColorhair() {
        return colorhair;
    }

    public void setColorhair(String colorhair){
        this.colorhair = colorhair;}

    public float getWeight(){
        return weight;
    }
     public void setWeight(float weight){
        this.weight = weight;
     }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBreed(){
        return Breed;
    }
    public void setBreed(String breed){
        this.Breed = Breed;
    }

    public int getAni(){
      return ani;
    }
    public void setAni(int ani) {
        this.ani = ani;
    }
    public int getHeightincm(){
        return heightincm;
    }
    public void setHeightincm(int weight){
        this.heightincm = heightincm;
    }











    public void callthedog() {
        System.out.println("Daisy come and eat");
    }

    public void putthefood() {
        System.out.println("Here is your food!eat");
    }

    public void play() {
        System.out.println("If you eat everything,we can play!");
    }

    public void goout() {
        System.out.println("Come daisy,lets go out!");

    }
public void walkthedog(){
    System.out.println("I will put the leash,and then we walk");
}
public void gotothe(){
    System.out.println("today we will go to the vet!");
}}
