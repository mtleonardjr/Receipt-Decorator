package cosc436assignment_5;
//Author: Michael Leonard

public class HolidayGreeting implements SecondaryHeading {
  public boolean applies(PurchasedItems items) {
    return true; // SecondaryHeading decorators always applied
  }
  
  public String getLines() {
    return "****** Happy Holidays from Best Buy ******";
  }
}