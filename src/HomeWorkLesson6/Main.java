package HomeWorkLesson6;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        Cat cat = new Cat("Барсик");
        cat.run(500);
        cat.run(10);
        cat.swimming(1);
        dog.run(300);
        dog.swimming(5);
        dog.run(1000);
        dog.swimming(11);
        dog.getDogCount();
        cat.getCatCaunt();

    }
}
