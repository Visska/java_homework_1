package homework7;

public class Cat {

    private final String name;
    private final int appetite;
    private boolean full;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }

    public boolean isFull() {
        return full;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName(){
        return name;
    }


    public void catInfo(){
        System.out.printf("Cat %s not hungry %s %n " , this.name, this.full );
    }

    public void eat(Plate plate){
        if(!this.full && plate.decreaseFood(this.appetite)){
            this.full = true;
        }
    }
}
