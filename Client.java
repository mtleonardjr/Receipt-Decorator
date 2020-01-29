package cosc436assignment_5;
import java.util.*;
import java.io.*;
//Author: Michael Leonard


public class Client {
    public static void displayOptions(){
    System.out.println("\nSelect from the following options"
                         +"\n1: Exit Program"
                         +"\n2: Enter Date"
                         +"\n3: Populate Item List"
                         +"\n4: Print Receipt");
  }
  
  public static void main(String[] args) throws FileNotFoundException{
    ReceiptDate rd;
    PurchasedItems p = new PurchasedItems();
    ReceiptFactory rf;
    displayOptions();
    Scanner input = new Scanner(System.in);
    int selection = input.nextInt();
    while(selection !=1) {
      switch(selection){
        case 2: 
          System.out.println("Enter the day of the month");
          int d = input.nextInt();
          System.out.println("Enter the Month Number. eg Enter '7' for July");
          int m = input.nextInt();
          System.out.println("Enter the Year.");
          int y = input.nextInt();
          rd = new ReceiptDate(d, m, y);
          break;
        case 3:
          p.addItem(new StoreItem("0001", "item 1", 1.00));
          p.addItem(new StoreItem("0002", "item 2", 2.00));
          p.addItem(new StoreItem("0003", "item 3", 3.00));
          p.addItem(new StoreItem("0004", "item 4", 4.00));
          p.addItem(new StoreItem("0005", "item 5", 5.00));
          p.addItem(new StoreItem("1406", "item 1406", 14.06));
          break;
        case 4:
          rf = new ReceiptFactory();
          Receipt r = rf.getReceipt(p, new ReceiptDate(14,11,2019));
          r.prtReceipt();
          break;
      }   
    displayOptions();
    selection = input.nextInt();
    }
  }
  }
