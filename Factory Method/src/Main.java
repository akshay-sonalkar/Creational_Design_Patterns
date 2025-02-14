/**
 *  Factory Method Pattern
 *  ----------------------
 *  The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate.
 *  Factory Method lets a class defer instantiation to subclasses.
 *
 */


public class Main {
    public static void main(String[] args) {
        DocumentCreator word = new WordDocumentCreator();
        word.printDocument();

        DocumentCreator pdf = new PdfDocumentCreator();
        pdf.printDocument();
    }
}