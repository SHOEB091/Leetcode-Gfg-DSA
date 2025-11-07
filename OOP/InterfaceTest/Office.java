package OOP.InterfaceTest;

class MultiFunctionPrinter implements Printer, Scanner, Fax {

    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning document: " + document);
    }

    @Override
    public void fax(String document) {
        System.out.println("Faxing document: " + document);
    }
}

public class Office {
    public static void main(String[] args) {
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print("Invoice.pdf");
        mfp.scan("Contract.pdf");
        mfp.fax("Report.pdf");
    }
}
