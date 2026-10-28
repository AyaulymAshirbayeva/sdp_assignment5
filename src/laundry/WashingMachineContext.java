package laundry;
import laundry.strategies.WashInterface;

public class WashingMachineContext {
    private WashInterface strategy;

    public void setStrategy(WashInterface strategy) {
        this.strategy = strategy;
    }

    public void startWash() {
        if (strategy == null) {
            System.out.println("Select a washing mode first.");
            return;
        }
        strategy.wash();
    }
}