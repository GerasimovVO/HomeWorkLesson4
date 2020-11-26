package HomeWorkLesson7;

import java.sql.SQLOutput;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();
        cat.catSatiationInfo();
        Cat[] cats = new Cat[10];
        cats[0] = new Cat("Murzik", 20);
        cats[1] = new Cat("Dino", 5);
        cats[2] = new Cat("Maki", 18);
        cats[3] = new Cat("Dagi", 33);
        cats[4] = new Cat("Polli", 40);
        cats[5] = new Cat("Zinna", 11);
        cats[6] = new Cat("Polli", 25);
        cats[7] = new Cat("Denni", 15);
        cats[8] = new Cat("Irbis", 17);
        cats[9] = new Cat("Musya", 7);
        Plate wiskas = new Plate(150);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(wiskas);
            cats[i].catSatiationInfo();
        }
        // Добавим еду в тарелку и покормим катов которые не поели.


        wiskas.topUpPlate(100);
        System.out.println("Добавили еду в тарелку и покормили голодных котов");
        cats[6].eat(wiskas);
        cats[6].catSatiationInfo();
        cats[8].eat(wiskas);
        cats[8].catSatiationInfo();
        wiskas.info();




    }
}
