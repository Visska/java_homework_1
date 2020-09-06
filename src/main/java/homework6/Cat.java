package homework6;


public class Cat extends Animal {


    public Cat() {
        this.lengthBarrierRun = this.randomLimit.nextInt(125)+125;
        this.lengthBarrierSwim = 0;
        this.heightBarrier = this.randomLimit.nextInt(7)+5;
    }

    @Override
    String name() {
        return "Cat";
    }
}
