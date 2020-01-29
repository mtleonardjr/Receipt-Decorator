package cosc436assignment_5;
//Author: Michael Leonard

public class StoreItem {
  private String itemCode; 
  private String itemDescription; 
  private double itemPrice; //This was changed from a String to a double from the skeleton code
  
  //Constructor
  public StoreItem(String code, String descript, double price){
   itemCode = code;
   itemDescription = descript;
   itemPrice = price;
  }
  
  //Getters
  public String getItemCode(){
   return itemCode; 
  }  
  public String getItemDescription(){
    return itemDescription;
  } 
  public double getItemPrice(){
    return itemPrice; 
  }
  
  //Setters
  public void setItemCode(String input){
    itemCode = input;
  } 
  public void setItemDescription(String input){
    itemDescription = input;
  }  
  public void setItemPrice(double input){
    itemPrice = input;
  } 
}