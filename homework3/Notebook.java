package homework3;

public class Notebook {

    double price;
    int ram;

    public Notebook(double price, int ram) {
        this.price = price;
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public String printNotebook() {
        System.out.println("price: " + price + "; ram: " + ram + ";");
        return null;
    }

}
