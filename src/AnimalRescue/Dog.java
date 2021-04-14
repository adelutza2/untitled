package AnimalRescue;

public class Dog extends Animal{

private String fur;

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    @Override
    public void speack() {
        System.out.println("ham ham");

    }

    @Override
    public void foodtoeat() {
        System.out.println("bones");
    }

    @Override
    public void play() {
        System.out.println("bark bark");
    }
}

