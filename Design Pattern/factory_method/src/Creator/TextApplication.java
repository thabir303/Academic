package Creator;

import Product.Document;
import Product.TextDocument;

public class TextApplication extends Application {
    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}

