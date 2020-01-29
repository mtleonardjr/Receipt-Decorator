package cosc436assignment_5;
//Author: Michael Leonard

public interface AddOn { 
  // the type of added info to a BasicReceipt (e.g., greetings, rebates, coupons)
  public boolean applies(PurchasedItems items);
  public String getLines();
}