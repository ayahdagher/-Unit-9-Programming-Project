public class Product
  {
// instance data
    
private double price ; 
private String company ; 
private String name ; 
private int quantity ; 

// default constructor 
public Product(){
  this.price =  0.0 ;
  this.company = "nonexistent" ; 
  this.name = "nameless" ; 
  this.quantity = 0 ; 
}
  
// paramater constructor

public Product(double p, String c, String n, int q){
  this.price =  p ;
  this.company = c ; 
  this.name = n ; 
  this.quantity = q ; 
}

// accessors    
    
public double getPrice(){

  return price ; 
}

public String getName(){

  return name ; 
}

public int getQuantity(){

  return quantity ; 
}

public String getCompany(){

  return company ; 
} 

// mutators
    
public void setPrice(double p){

  price = p ; 
  
}

public void setName(String n){

  name = n ; 
}

public void setCompany(String c){
  
  company = c;
}
    
public void setQuantity(int q){

  quantity = q ; 
  
}

public String toString(){

  String output = "The name of the product is " + name + ". It costs " + price + " dollars, and they are made by " + company + ". There are " + quantity + " of them in stock." ;

return output ;   
    
}

  }
