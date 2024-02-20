package Creator;

import Product.CsvDocument;
import Product.Document;

public class CSVApplication extends Application {
    @Override
    public Document createDocument() {
        return new CsvDocument();
    }
}
