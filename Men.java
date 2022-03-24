public class Men extends Clothing{

private String menStyle ; 

// default constructor 

  public Men(){

  super(); 
  this.menStyle = "no style" ; 

}

// parameter coonstructor 
  
public Men(double p, String c, String n, int q, String b, double s, String ms){

  super(p, c, n, q, b, s); 
  menStyle = ms ; 

}

public String getMenStyle(){

  return menStyle ; 
}

public void setMenStyle(String ms){

  menStyle = ms ; 
}

public String toString(){

  String output = super.toString() + " This men's clothing is a " + menStyle + " style." ;

  return output ; 
}
}