package constructors;

public class Customerr {
    String name;
    double minOrderValue;

    public Customerr() {
        this.minOrderValue = 0;
    }

    public Customerr(String name) {
        this();
        this.name = name;
    }
}

public class PremiumCustomer extends Customerr {
    double discountRate;

    public PremiumCustomer() {
        super();
        this.discountRate = 0.20;
    }

    public PremiumCustomer(String name, double discountRate) {
        super(name);
        this.discountRate = discountRate;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | " + "Discount Rate: " + discountRate;
    }

    public static void main() {
    
    Customerr c1 = new Customerr();
    Customerr c2 = new Customerr("John");
    PremiumCustomer c3 = new PremiumCustomer();
    PremiumCustomer c4 = new PremiumCustomer("Alan", 0.40);

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    }
}

