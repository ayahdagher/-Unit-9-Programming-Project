public class Media extends Product{

// instance data

private String typeOfMedia ; 

// default constructor 

public Media(){

  super(); 
  this.typeOfMedia = "nonexistent" ; 

}

// parameter coonstructor 
  
public Media(double p, String c, String n, int q, String tm){

  super(p, c, n, q); 
  typeOfMedia = tm ; 

}

// accessor 

public String getTypeOfMedia()
  {
    return typeOfMedia ; 
  }

// mutators

public void setTypeOfMedia(String tm){

  typeOfMedia = tm ; 
}

public String toString()
  {

    String output = super.toString() + "This is a "
+ typeOfMedia + " media." ;     

    return output ; 
  }










  
}