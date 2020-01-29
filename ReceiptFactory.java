package cosc436assignment_5;
import java.util.*;
import java.io.*;
//Author: Michael Leonard

public class ReceiptFactory {
  StoreHeader store_header; // contains street_addr, zip_code, state_code, phone num, store num
  private TaxComputationMethod[] taxComputationsObjs; // tax computation objs (for each state)
  private AddOn[] addOns; // secondary heading, rebate and coupon add-ons (hardcoded here)
  
  public ReceiptFactory() throws FileNotFoundException{ // constructor

    taxComputationsObjs = new TaxComputationMethod[] {new MDTaxComputation(), new MATaxComputation(), new CATaxComputation()};    
    Scanner reader = new Scanner(new File("cosc436assignment_5\\config.txt"));
    String[] tokens = new String[5];
    for(int i = 0; i < 5; i++){
      tokens[i] = reader.nextLine();
    }
    store_header = new StoreHeader(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4]);
    addOns = new AddOn[] {new HolidayGreeting(),new Rebate1406(),new Coupon100Get10Percent()};    
  }
public Receipt getReceipt(PurchasedItems items, ReceiptDate date) {
  //Declarations
  Boolean preFlag = false, postFlag = false;
  BasicReceipt b = new BasicReceipt(items, date);
  Decorator pre = new PreDecorator();
  PostDecorator post = new PostDecorator();
  Decorator currentD = new PreDecorator();
  
  //Store header
  b.setStoreHeader(store_header);
  
  //Set tax object
  for(int i = 0; i < taxComputationsObjs.length; i++){
    if (store_header.getStateCode().equals(taxComputationsObjs[i].getStateCode()))
      b.setTaxComputationMethod(taxComputationsObjs[i]);
  }
  
  //determine predecorator
  for(int i = 0; i < addOns.length; i++){
    if(addOns[i].applies(items)&& addOns[i] instanceof SecondaryHeading){
      preFlag = true;
      pre = new PreDecorator(b, addOns[i]);
      currentD = pre;
    }
  }
  
  //Determines post decorator
  for (int i = 0; i < addOns.length; i++){
    if ((addOns[i].applies(items) && addOns[i] instanceof Rebate) || (addOns[i].applies(items) && addOns[i] instanceof Coupon)) {
      post = new PostDecorator(currentD, addOns[i]);
      currentD = post;
      postFlag = true;
    }
  }
   
  //If-else to determine which receipt to return.
  if(postFlag==true)
    return post;
  else if(preFlag==true)
    return pre;
  else
    return b;  
  }
}
///Blank Below















