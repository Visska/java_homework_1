package homework7;

public class Plate {

    private  int food;

    public Plate(int food){
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("plate: " + food);
    }

    public boolean decreaseFood(int appetite){
        if(appetite <= this.food){
            this.food -= appetite;
            return true;
        }
        return false;
    }

    public void increaseFood(int countFood){
        this.food += countFood;
    }
}
