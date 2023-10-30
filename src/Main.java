import model.Animal;

public class Main {
    public static void main(String[] args) {
        Clock myClock = new Clock(15, 4);
        System.out.println(myClock.getHour());
        System.out.println(myClock.getMinutes());
        System.out.println(myClock.getTime());

        myClock.setHour(13);
        myClock.setMinutes(57);

        System.out.println(myClock.getTime());

        System.out.println("------------------- ++++++++++++++++++++++++++++ -----------------------");
        Clock anotherClock = new Clock();

        System.out.println(anotherClock.getHour());
        System.out.println(anotherClock.getMinutes());
        System.out.println(anotherClock.getTime());

        System.out.println("------------------- ++++++++++++++++++++++++++++ -----------------------");

        Animal cat = new Animal("Felina", 22, 10, 20);
        System.out.println("My cat:" + cat.getType() + "," + cat.getAge() + "," + cat.getWeight() + "," + cat.getHeight());

        Animal dog = new Animal("Canine", 5, 15, 25);
        System.out.println("My dog:" + dog.getType() + "," + dog.getAge() + "," + dog.getWeight() + "," + dog.getHeight());
        System.out.println(dog);

        String result = dog.getType().equals("Canine") ? "It's a dog" : "It's not a dog";
//
//        if (dog.getType().equals("Canine")) {
//            result = "It's a dog";
//        } else {
//            result = "It's not a dog";
//        }

        System.out.println(result);
    }
}
