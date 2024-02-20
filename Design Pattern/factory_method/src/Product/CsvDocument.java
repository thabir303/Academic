package Product;

public class CsvDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening CSV Document");
    }

    @Override
    public void close() {
        System.out.println("Closing CSV Document");
    }

    @Override
    public void save() {
        System.out.println("Saving CSV Document");
    }

    @Override
    public void revert() {
        System.out.println("Reverting CSV Document");
    }
}
