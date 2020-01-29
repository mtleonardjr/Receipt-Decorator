package cosc436assignment_5;
import java.util.*;
//Author: Michael Leonard

public class PurchasedItems {
  
  private ArrayList<StoreItem> items;
  
  //Constructor
  public PurchasedItems() {
    items = new ArrayList<StoreItem>();
  }
  
  //Method to add items 
  public void addItem(StoreItem item){
    items.add(item);
  }
  
  //Method to return the total cost of all the purchased items
  public double getTotalCost(){
    ListIterator<StoreItem> itr = items.listIterator();
    double total = 0;
    while(itr.hasNext()){
     total += itr.next().getItemPrice(); 
    }
    return total;
  }
  
  //Method to see if an item appears in the array list
  public boolean containsItem(String itemCode){
    ListIterator<StoreItem> itr = items.listIterator();
    boolean flag = false;
    while(itr.hasNext()){
      if(itr.next().getItemCode() == itemCode)
        flag = true;
    }
    return flag;
  }
  
  //Method to print lines of the receipt
  public void printLines(){
      ListIterator<StoreItem> itr = items.listIterator();
      while(itr.hasNext()){
        StoreItem item = itr.next();
        System.out.printf("\n%-40s %10.2f", item.getItemCode()+" "+ item.getItemDescription(), item.getItemPrice());
      }
      System.out.println();
  }
}










