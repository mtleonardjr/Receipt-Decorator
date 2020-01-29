package cosc436assignment_5;
//Author: Michael Leonard

public class PostDecorator extends Decorator {
  //private AddOn a;
  public PostDecorator(){};
  public PostDecorator(Receipt r, AddOn a) {
    super(r, a);
  }
  public void prtReceipt() {
    callTrailer();
    System.out.println(addon.getLines());
  }
}