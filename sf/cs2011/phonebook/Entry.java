/* Basic storage object */

import java.util.Scanner;

public class Entry{
  int number;
  String address,name,forName,surName;

  public Entry(int number, String address,String name){
    this.number = number;
    this.address = address;
    this.name = name;
    splitName();
 
  }


  private void splitName(){ //Take the whole name as a string and split it into forname and surname.
    String[] tokens = this.name.split(" ");
    this.forName = tokens[0];
    if(tokens.length > 1){
      this.surName = tokens[1]; //I hope the don't use a middle name. </Horribel assumption>
    }
  }


  //Get/Set methods.
  public int getNumber(){
    return number;
  }

  public String getAddress(){
    return address;
  }

  public String getFor(){
    return forName;
  }

  public String getSur(){
    return surName;
  }

  //</Getters><Setters>(redundant,remove later?)

  public void setNumber(int input){
    number = input;
  }

  public void setAddress(String input){
    address = input;
  }

  public void setName(String input){
    name = input;
    splitName();
  }
    
  //</Setters>
  public String toString(){
    return String.format("%s, %s\n%s\n%d\n", surName, forName, address, number);
  }
}
