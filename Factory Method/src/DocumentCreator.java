public abstract class DocumentCreator {
    public abstract Document createDocument();

    public void printDocument() {
        Document doc = createDocument();
        doc.print();
    }
}
