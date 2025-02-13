/**
 * Main class to test the Builder pattern
 *  - The Builder pattern is a creational design pattern that lets you construct complex objects step by step.
 *  - The pattern allows you to produce different types and representations of an object using the same construction code.
 *  - The Builder pattern is a solution to the telescoping constructor anti-pattern.
 *  - The telescoping constructor anti-pattern occurs when a class has multiple constructors, each calling a more specific constructor in the hierarchy.
 *  - The Builder pattern uses a builder object to construct a complex object step by step.
 */

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(false)
                .build();

        System.out.println("HDD: " + computer.getHDD());
        System.out.println("RAM: " + computer.getRAM());
        System.out.println("Is Graphics Card Enabled: " + computer.isGraphicsCardEnabled());
        System.out.println("Is Bluetooth Enabled: " + computer.isBluetoothEnabled());

        Cake chocolateCake = new Cake.CakeBuilder("Chocolate", 3)
                .setFrosting(true)
                .setSprinkles(true)
                .build();

        Cake vanillaCake = new Cake.CakeBuilder("Vanilla", 2)
                .setFrosting(false)
                .setSprinkles(true)
                .build();

        System.out.println("Chocolate Cake: ");
        System.out.println("Flavor: " + chocolateCake.getFlavor());
        System.out.println("Layers: " + chocolateCake.getLayers());
        System.out.println("Has Frosting: " + chocolateCake.hasFrosting());
        System.out.println("Has Sprinkles: " + chocolateCake.hasSprinkles());

        System.out.println("\nVanilla Cake: ");
        System.out.println("Flavor: " + vanillaCake.getFlavor());
        System.out.println("Layers: " + vanillaCake.getLayers());
        System.out.println("Has Frosting: " + vanillaCake.hasFrosting());
        System.out.println("Has Sprinkles: " + vanillaCake.hasSprinkles());
    }

}