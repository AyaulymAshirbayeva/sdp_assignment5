package laundry.strategies;

public class CottonWashStrategy implements WashInterface {
    @Override
    public void wash() {
        System.out.println("Cotton Wash: 60 C, 800 RPM, 90 minutes");
    }
}
