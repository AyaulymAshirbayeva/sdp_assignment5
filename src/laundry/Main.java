package laundry;
import laundry.strategies.CottonWashStrategy;
import laundry.strategies.DelicateWashStrategy;
import laundry.strategies.QuickWashStrategy;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WashingMachineContext machine = new WashingMachineContext();

        while (true) {
            System.out.println("\n=== Washing Machine ===");
            System.out.println("1. Cotton Wash");
            System.out.println("2. Quick Wash");
            System.out.println("3. Delicate Wash");
            System.out.println("0. Exit");
            System.out.print("Choose a mode: ");

            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    machine.setStrategy(new CottonWashStrategy());
                    break;
                case 2:
                    machine.setStrategy(new QuickWashStrategy());
                    break;
                case 3:
                    machine.setStrategy(new DelicateWashStrategy());
                    break;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }

            machine.startWash();
        }

        scanner.close();
    }
}