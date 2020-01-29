package cosc436assignment_5;
import java.util.*;
//Author: Michael Leonard

public class MATaxComputation extends TaxComputationMethod {
  private static double MATaxRate = .06;        //I made up data for tax classes
  private ArrayList<ReceiptDate> holidays;      //All the states tax holidays are stored in a array list of receiptdates
  private String state_code = "MA";             //Added state code to make it easier to find tax classes
  
  //Constuctor creates an arraylist constaining the holiday dates
  public MATaxComputation(){
    //Holiday dates are assumed to be known ahead of time and loaded into each state's clsss
    holidays = new ArrayList<ReceiptDate>();
    for(int startDate = 11; startDate < 18; startDate++){
      holidays.add(new ReceiptDate(startDate,8,2019)); 
    }
  }
  
  //Getter method to return state_code
  public String getStateCode(){
    return state_code;
  }
  
  //Getter method to return tax rate
  public double getTaxRate(){
    return MATaxRate;
  }
  
  //method to compute the tax rate
  public double computeTax(PurchasedItems items, ReceiptDate date) {
    if(taxHoliday(date)==true)
      return 0.00;
    else
       return MATaxRate*items.getTotalCost();
  }
  
  //This uses ReceiptDate's dateIs() method to check for a holiday
  public boolean taxHoliday(ReceiptDate date){    //I had to make this method public in order for it to overide the interface
    boolean holiday = false;
    ListIterator<ReceiptDate> itr = holidays.listIterator();
    while(itr.hasNext()){
      if(itr.next().dateIs(date)==true)
        holiday = true;
    }
    return holiday;
  }
}