package cosc436assignment_5;
import java.util.*;
//Author: Michael Leonard

public class ReceiptDate {
  //day, month, year are stored as integers
  private int day, month, year;
  
  //constructor method
  public ReceiptDate(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }
  
  //This method takes a date and checks to see if another date shares its month and day
  //will be used to check for holidays
  public boolean dateIs(ReceiptDate date){
    if((this.day == date.day)&&(this.month == date.month)) 
      return true;
    else
      return false;
  }
  
  //ToString will give us a formated date for the receipt
  public String toString(){
    return(month+"/"+day+"/"+year);
  }

  
}
