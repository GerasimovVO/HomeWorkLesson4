package HomeWorkLesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiation;



    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiation = false;
    }
    public void eat(Plate p){

        if (p.decreaseFood(appetite) == true)
            catSatiation();



    }
    public void catSatiation(){
        this.satiation = true;
    }
    public void catSatiationInfo(){
        System.out.println(this.name + " satiation = " + this.satiation  );
    }
}
