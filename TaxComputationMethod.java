package cosc436assignment_5;
import java.util.*;
//Author: Michael Leonard

public abstract class TaxComputationMethod {  
  public abstract double computeTax(PurchasedItems items, ReceiptDate date);
  public abstract boolean taxHoliday(ReceiptDate date);
  public abstract double getTaxRate();
  public abstract String getStateCode();
}