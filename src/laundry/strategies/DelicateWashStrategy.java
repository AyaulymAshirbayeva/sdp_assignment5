package laundry.strategies;

public class DelicateWashStrategy implements WashInterface {
    @Override
    public void wash() {
        System.out.println("Delicate Wash: 20 C, 400 RPM, 40 minutes");
    }
}