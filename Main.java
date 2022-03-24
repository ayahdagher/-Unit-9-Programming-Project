import java.util.*; 
import java.text.* ; 

class Main {

  public static double productCost(Product prod)
  {

    double total = prod.getPrice() * prod.getQuantity();
    return total;
  }

  public static double grandTotal(Product[] prod)
  {

    double total = 0.0;

    for (Product x : prod) {

      total += productCost(x);
    }

    return total;
  }

  public static void main(String[] args)
  {

    Product[] products = new Product[6];

    products[0] = new Product(
        129.00, "Apple", "Airpods", 3 + (int)(Math.random() * ((6 - 3) + 1)));

    products[1] = new Electronics(299.99, "Nintendo", "Nintendo Switch",
        3 + (int)(Math.random() * ((6 - 3) + 1)), "Gaming Console", true);

    products[2] = new Media(12.99, "Kodansha Comics", "Blue Period Volume 1",
        3 + (int)(Math.random() * ((6 - 3) + 1)), "Manga");

    products[3] = new Clothing(38.43, "Boxlunch",
        "Studio Ghibli Kiki's Delivery Service Jiji with Bowtie Cardigan",
        3 + (int)(Math.random() * ((6 - 3) + 1)), "Our Universe", 10);

    products[4] = new Women(38.43, "Boxlunch",
        "Disney Alice in Wonderland Icons Smocked Dress",
        3 + (int)(Math.random() * ((6 - 3) + 1)), "Boxlunch", 10, "Dress");

    products[5] = new Men(27.23, "Boxlunch",
        "Jujutsu Kaisen Chibi Gojo Tie-Dye Joggers",
        3 + (int)(Math.random() * ((6 - 3) + 1)), "Boxlunch", 10, "Joggers");

    for (Product x : products) {

      System.out.println(x);
    
    }
    
      System.out.println( );
      System.out.println( );
      System.out.println("Name \t Company \t Quantity \t Price \t Total Cost");
      System.out.println("*************************************************************************");

    for (Product x : products) {
      
NumberFormat nf = NumberFormat.getCurrencyInstance();

      System.out.println(x.getName() + "\t" + x.getCompany() + "\t" + x.getQuantity() + "\t" + x.getPrice() + "\t" + nf.format(productCost(x)));
    
    }

      System.out.println("*************************************************************************");
    
NumberFormat nf = NumberFormat.getCurrencyInstance();

System.out.println("Grand Total: " + nf.format(grandTotal(products)));

    
  }
}