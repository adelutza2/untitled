package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog daisy = new Dog();
        daisy.bark();
        Dog dog1 = new Dog();
                dog1.setName("iuliu");
        System.out.println(dog1.getName());
        dog1.setBreed("brawn");
        System.out.println(dog1.getBreed());
        dog1.setAni(5);
        System.out.println(dog1.getAni());
        dog1.setHeightincm(25);
        System.out.println(dog1.getHeightincm());
        System.out.println("I m the lucky dog");

        Food food = new Food();
        food.setName("one");
        System.out.println(food.getFood());
        food.setFood("berry");
        System.out.println(food.getFood());
        food.setColorhair("brawn");
        System.out.println(food.getColorhair());
        food.setWeight(4);
        System.out.println(food.getweight());
        System.out.println("my food is the best!");


        Girl girl = new Girl();
        girl.setName("Aldena");
        System.out.println(girl.getName());
     girl.setAni(6);
        System.out.println(girl.getAni());
        girl.setColorhair("brawn");
        System.out.println(girl.getColorhair());
        System.out.println("all my animals are the best");


        Vet vet = new Vet();
        vet.setNamevet("Gabriel");
        System.out.println(vet.getNamevet());
        vet.setAni(36);
        System.out.println(vet.getAni());
        vet.setWeight(86.2f);
        System.out.println(vet.getWeight());
    }

}
