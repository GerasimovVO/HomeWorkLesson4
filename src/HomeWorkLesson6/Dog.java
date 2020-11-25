package HomeWorkLesson6;

public class Dog extends Animals {
    private String name;
    private  int dogCount = 0;





    public Dog (String name){
        this.name = name;

        dogCount++;
    }

    public String getName() {
        return name;
    }

    public int getDogCount() {
        return dogCount;
    }
    @Override
    public void swimming(int length) {
        if (length <= 10){
            System.out.println("Собака проплыла" + length + "метр.");
        }
        else System.out.println("Собака может проплыть только 10 метров она утанула");


    }

    @Override
    public void run(int length) {
        if (length < 500) {
            System.out.println(getName() + " Собака проплыла " + length + " метр.");
        }
        else
            System.out.println("Собака не может пробежать больше 500 метров он утанул");

    }
}
