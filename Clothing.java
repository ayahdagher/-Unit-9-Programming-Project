public class Clothing extends Product {

// instance data 

private String brand ; 
private double size ; 

// default constructor 
  
public Clothing(){

  super(); 
  this.brand = "unbranded" ; 
  this.size = 0.0 ; 

}
  
// parameter constructor 

  public Clothing(double p, String c, String n, int q, String b, double s){

    super(p, c, n, q); 
    brand = b ; 
    size = s ; 
  }

// accessors

public String getBrand(){

return brand ; 
  
}

public double getSize(){

return size ; 
  
}

// mutators
  
public void setBrand(String b){

  brand = b ; 
}

public void setSize(double s){

  size = s ; 
}

public String toString(){

String output = super.toString() + " This piece of clothing is from the brand " + brand + " and it's size " + size + "." ; 

return output; 
}
}