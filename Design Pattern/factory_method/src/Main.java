import Creator.CSVApplication;
import Creator.TextApplication;
import Product.Document;

public class Main {

    public static void main(String[] args) {

        CSVApplication csvApp = new CSVApplication();
        Document csvDoc = csvApp.newDocument();
        csvApp.openDocument(csvDoc);
        csvApp.closeDocument(csvDoc);
        csvApp.saveDocument(csvDoc);
        csvApp.revertDocument(csvDoc);

        TextApplication textApp = new TextApplication();
        Document textDoc = textApp.newDocument();
        textApp.openDocument(textDoc);
        textApp.closeDocument(textDoc);
        textApp.saveDocument(textDoc);
        textApp.revertDocument(textDoc);

        csvApp.performDocumentOperations();

    }
}