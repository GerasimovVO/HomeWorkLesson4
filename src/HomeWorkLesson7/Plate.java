package HomeWorkLesson7;

public class Plate {
    private int food;
    public Plate(int food){
        this.food = food;
    }
    public void topUpPlate (int meal){
        this.food = this.food + meal;

    }
    public boolean decreaseFood(int n) {
        if (food - n > 0) {
            food -= n;
            return true;






        } else {
            System.out.println("кот не может есть с этой тарелки");
            return false;
        }
    }
    public void info(){
        System.out.println("plate: " + food);

    }
}
