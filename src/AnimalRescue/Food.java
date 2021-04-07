package AnimalRescue;

public class Food {
    String name;
    String Food;
    int weight;
    String colorhair;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getFood(){
        return Food;
    }
    public void setFood(String food) {
        this.Food = food;
    }
    public int getweight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public String getColorhair(){
        return colorhair;
    }
    public void setColorhair(String color) {
        this.colorhair = color;
    }






    public void callthedog() {
        System.out.println("Daisy your food for today are berry");
    }

    public void putthefood() {
        System.out.println("Here are your berry");
    }

    public void howmuch() {
        System.out.println("for today you can eat only 20gr");
    }


}

