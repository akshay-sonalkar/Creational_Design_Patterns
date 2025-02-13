/**
 * Main class to demonstrate the Prototype pattern.
 *  - The Prototype pattern is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.
 *  - The pattern declares a common interface for all objects that support cloning. This interface lets you clone an object without coupling your code to the class of that object.
 *  - The Prototype pattern provides a simple way to copy objects, even complex ones, without coupling to their specific classes.
 *  - The Prototype pattern is used when creating an instance of a class is either expensive or complicated.
 *  - The Prototype pattern is used when the class to instantiate is specified at runtime.
 *
 */
public class Main {
    public static void main(String[] args) {

        // Create a new document
        Document word = new WordDocument("Word content");
        word.print();

        // Clone the document
        Document clonedDocument = word.clone();
        clonedDocument.print();

        // Modify the cloned document
        ((WordDocument) clonedDocument).setContent("Modified Word content");
        clonedDocument.print();

        // Original document remains unchanged
        word.print();


        // Create a new character
        GameCharacter orc = new Orc("Orc", "Axe", "Green");
        orc.display();

        // Clone the character
        GameCharacter clonedOrc = orc.clone();
        clonedOrc.display();

        // Modify the cloned character
        ((Orc) clonedOrc).setColor("Red");
        clonedOrc.display();
    }
}