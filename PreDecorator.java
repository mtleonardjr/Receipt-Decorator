package cosc436assignment_5;
//Author: Michael Leonard

public class PreDecorator extends Decorator {
  //private AddOn a;
  
  public PreDecorator(){}
  
  public PreDecorator(Receipt r, AddOn a) {
    super(r, a);
  }
  public void prtReceipt() {
    System.out.println(addon.getLines());
    callTrailer();
  }
}