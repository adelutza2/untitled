package AnimalRescue;

public class Cat extends  Animal {
    public void purr(){
        System.out.println(" trrrtrrrtrrrr");
    }

    public void pullouttheclaws(){
        System.out.println(" vras vras vras");

    }

    @Override
    public void sleep() {
        System.out.println("zzzzzz");
    }

    @Override
    public void foodtoeat() {
        System.out.println("fish");
    }

    @Override
    public void play() {
        System.out.println("miau miau");
    }
}

