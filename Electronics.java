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

    String output = super.toString() + "This is a "
+ typeOfElectronic + " electronic." ;     

    return output ; 
  }

  
}