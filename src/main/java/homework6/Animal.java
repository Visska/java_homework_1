package homework6;

import java.util.Random;

public class Animal {
    Random randomLimit = new Random();
    int lengthBarrierRun;
    int lengthBarrierSwim;
    double heightBarrier;

    public int getLengthBarrierRun() {
        return lengthBarrierRun;
    }

    public void setLengthBarrierRun(int lengthBarrierRun) {
        this.lengthBarrierRun = lengthBarrierRun;
    }

    public int getLengthBarrierSwim() {
        return lengthBarrierSwim;
    }

    public void setLengthBarrierSwim(int lengthBarrierSwim) {
        this.lengthBarrierSwim = lengthBarrierSwim;
    }

    public double getHeightBarrier() {
        return heightBarrier;
    }

    public void setHeightBarrier(double heightBarrier) {
        this.heightBarrier = heightBarrier;
    }

    boolean run(int lengthBarrierRun) {
        System.out.println(name() + " Need run: " + lengthBarrierRun +"/ Can run: "+this.lengthBarrierRun);
        if (lengthBarrierRun > this.lengthBarrierRun) {
            System.out.println(false);
            return false;
        }
        System.out.println(true);
        return true;
    }

    boolean swim(int lengthBarrierSwim){
        System.out.println(name() + " Need swim: " + lengthBarrierSwim + "/ Can swim: " + this.lengthBarrierSwim);
        if(lengthBarrierSwim > this.lengthBarrierSwim || this.lengthBarrierSwim == 0) {
            System.out.println(false);
            return false;
        }
        System.out.println(true);
        return true;
    }

    boolean jump(double heightBarrier){
        System.out.printf("%s Need jump: %.1f/ Can jump: %.1f %n", name(), heightBarrier, this.heightBarrier);
        if(heightBarrier > this.heightBarrier) {
            System.out.println(false);
            return false;
        }
        System.out.println(true);
        return true;
    }

    String name(){
       return "Animal";
    }

}
