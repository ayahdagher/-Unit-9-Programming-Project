public class Electronics extends Product{

// instance data

private String typeOfElectronic ; 
private boolean batteryIncluded ; 

// default constructor 

public Electronics(){

  super(); 
  this.typeOfElectronic = "nonexistent" ; 
  this.batteryIncluded = false ; 

}
  
// parameter constructor 

  public Electronics(double p, String c, String n, int q, String te, boolean bai){

    // using the parameter constructor from the superclass, and adding the class' unique variables to it
    super(p, c, n, q); 
    typeOfElectronic = te ; 
    batteryIncluded = bai ; 
  }
  
// accessors

public boolean getBattInc()
  {
    return batteryIncluded ; 
  }

public String getTypeOfElectronic()
  {
    return typeOfElectronic ; 
  }

// mutators

public void setBattInc(boolean yn){

  batteryIncluded = yn ; 
}

public void setTypeOfElectronic(String et){

  typeOfElectronic = et ; 
}

public String toString()
  {

    String output = super.toString() + " This is a "
+ typeOfElectronic + " electronic." ;     

    return output ; 
  }

  
}