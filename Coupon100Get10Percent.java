package cosc436assignment_5;
//Author: Michael Leonard

public class Coupon100Get10Percent implements Coupon { // similar to rebate class
    public boolean applies(PurchasedItems items) {
    return items.containsItem("1406");
    //return true;
  }
  
  public String getLines() {
        return "\n******************** Coupon Line ********************\n"
              +"\n******************** Coupon Line ********************\n";
        //return "Mail-in Rebate for Item #1406\n" + "Name:\n" + "Address:\n\n" +
        //"Mail to: Best Buy Rebates, P.O. Box 1400, Orlando, FL";
      }
}