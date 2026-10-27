package laundry.strategies;

public class QuickWashStrategy implements WashInterface {
    @Override
    public void wash() {
        System.out.println("Quick Wash: 40 C, 800 RPM, 20 minutes");
    }
}
