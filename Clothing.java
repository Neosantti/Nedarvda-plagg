/**
 * Main
 */
public class Clothing {
protected static String brand = "Basic";
protected static String color = "Black";
protected static String price = "150";
}

class Shirt extends Clothing {
  public static void main(String[] args) {
    System.out.println("Brand = "+Shirt.brand + " " +"Color = "+ Shirt.color + " " +"Price = "+ Shirt.price);
  }
}
