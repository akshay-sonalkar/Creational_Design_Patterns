/**
 * Main class to test the Abstract Factory pattern
 *  - The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.
 *  - The Abstract Factory pattern is a super-factory that creates other factories.
 *  - The Abstract Factory pattern is used to create a factory of factories.
 *  - The Abstract Factory pattern is used to create a factory of related objects without specifying their concrete classes.
 */
public class Main {
    public static void main(String[] args) {
        // Create a factory for Windows
        GUIFactory windowsFactory = new WindowsFactory();
        Button windowsButton = windowsFactory.createButton();
        TextField windowsTextField = windowsFactory.createTextField();

        // Create a factory for Mac
        GUIFactory macFactory = new MacOSFactory();
        Button macButton = macFactory.createButton();
        TextField macTextField = macFactory.createTextField();

        // Use the Windows factory
        windowsButton.click();
        windowsTextField.type();

        // Use the Mac factory
        macButton.click();
        macTextField.type();
    }
}