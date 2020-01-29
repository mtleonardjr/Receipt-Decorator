package cosc436assignment_5;
import java.util.*;
//Author: Michael Leonard

public class BasicReceipt implements Receipt {
  private StoreHeader store_header; 
  private TaxComputationMethod tc;
  private ReceiptDate date; // changed to a ReceiptDate object
  private PurchasedItems items;
  
  //Constructor
  public BasicReceipt(PurchasedItems items, ReceiptDate date) { 
    this.items = items;
    this.date = date;
    this.tc = new MDTaxComputation(); //default tax computation method is set to MD
    //This is a default header for testing
    this.store_header = new StoreHeader("123 main st", "12345", "MD", "123456789", "1234");
  }
  
  //Method to set store header
   public void setStoreHeader(StoreHeader h){
    store_header = h;
  } 
  
  //Method to set tax method 
  public void setTaxComputationMethod(TaxComputationMethod tc){
    this.tc = tc;
  }

  
  public void prtReceipt() {
    store_header.prtHeader();
    System.out.printf("\n%-50s \n", date.toString());
    System.out.printf("\n%-50s \n", "ITEM #");
    items.printLines();
    System.out.printf("\n%-43s $%7.2f\n", "Total Sale:",items.getTotalCost()); 
    System.out.printf("\n%-43s $%7.2f\n", store_header.getStateCode()+
                      " Sales Tax("+tc.getTaxRate()*100+"%)", tc.computeTax(items, date));
    System.out.printf("\n%-43s $%7.2f\n", "TOTAL SALE", tc.computeTax(items, date)+items.getTotalCost());
  }
}
///BLANK BELOW




















