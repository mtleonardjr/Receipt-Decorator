package cosc436assignment_5;
//Author: Michael Leonard

public abstract class Decorator implements Receipt {
  Receipt trailer;  //I made Decorator's variables package access to make things easier on me
  AddOn addon;
  
  public Decorator(){ //I added this default constructor because i wanted to be able to create objects with no data.
  }                   //Because I was having problems with null pointer exceptions
  
  public Decorator(Receipt r, AddOn a) {
    trailer = r;
    addon = a;
  }
  
  protected void callTrailer() {
    trailer.prtReceipt();
  }
  
  public abstract void prtReceipt();
}