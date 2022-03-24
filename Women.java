public class Women extends Clothing{

private String womenStyle ; 

// default constructor 

  public Women(){

  super(); 
  this.womenStyle = "no style" ; 

}

// parameter coonstructor 
  
public Women(double p, String c, String n, int q, String b, double s, String ws){

  super(p, c, n, q, b, s); 
  womenStyle = ws ; 

}

public String getWomenStyle(){

  return womenStyle ; 
}

public void setWomenStyle(String ws){

  womenStyle = ws ; 
}

public String toString(){

String output =  super.toString() + " This women's clothing is a " + womenStyle + " style." ; 

return output ; 
}
}