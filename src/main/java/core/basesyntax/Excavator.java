package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println(this.getClass().getSimpleName() + " started its work");
    }

    @Override
    public void stopWork() {
        System.out.println(this.getClass().getSimpleName() + " ended its work");
    }
}