package homework6;

public class Dog extends Animal {


    public Dog(){
        this.lengthBarrierRun = this.randomLimit.nextInt(300)+300;
        this.lengthBarrierSwim = this.randomLimit.nextInt(7)+5;
        this.heightBarrier = (0.4 +(1.0 - 0.4)*this.randomLimit.nextDouble());
    }

    @Override
    String name() {
        return "Dog";
    }
}
