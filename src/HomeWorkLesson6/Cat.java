package HomeWorkLesson6;

public class Cat extends Animals {
private int catCaunt = 0;
private String name;

    public int getCatCaunt() {
        return catCaunt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Cat(String name) {
        this.name = name;
        catCaunt++;
    }

    @Override
    public void swimming(int length) {
        System.out.println("Кот не умеет плавать он помер");

    }

    @Override
    public void run(int length) {
        if (length < 200) {
            System.out.println(getName() + " Кот пробежал " + length + " метр.");
        }
        else {
            System.out.println("Кот не может пробежать больше 200 метров.");
        }

    }





}
