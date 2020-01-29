package cosc436assignment_5;
import java.io.*;
//Author: Michael Leonard

public class StoreHeader {
  private String street_addr, zip_code, phone_num, store_num, state_code; 

  public StoreHeader(String street_addr, String zip_code, String state_code, String phone_num,
                     String store_num){
    this.street_addr = street_addr;
    this.zip_code = zip_code;
    this.state_code = state_code;
    this.phone_num = phone_num;
    this.store_num = store_num;
  }

  public String getStateCode(){
    return state_code;
  }
  
  public void prtHeader(){
    System.out.printf("\n%-25s %25s", "BEST BUY", "Store #"+store_num);
    System.out.printf("\n%-39s %11s\n", street_addr+", "+state_code+" "+zip_code, phone_num);
  }
}