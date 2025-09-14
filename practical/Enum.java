enum Laptop {
    // these are objects of Laptop class itself
    // as you are passing some value, so you need to create a constructor
    Macbook(2000), Dell(1200), Acer(1400);

    public int price;

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}

public class Enum {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
        System.out.println(lap.getClass()); // class Laptop
        System.out.println(lap.getClass().getSuperclass()); // class java.lang.Enum

        System.out.println("s = " + lap); // Macbook
        System.out.println("price = " + lap.getPrice()); // 2000

    }
}
