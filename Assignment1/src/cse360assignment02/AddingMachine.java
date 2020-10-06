package cse360assignment02;
/* this is a class */
public class AddingMachine {
  private int total;
  private String his;
   // this is a constructor method */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    his ="0 ";
  }
  /*  returns the total value */
  public int getTotal () {
    return total;
  }
  /*  adds the new value to total and put the new value in the his string variable */
  public void add (int value) {
	  total= total+value;
	  his= his +" + "+ value;
  }
 /*  subtracts the new value total and put the new value in the his string variable */
  public void subtract (int value) {
	  total= total-value;
	  his= his +" - "+ value;
  }
  /* returns/prints out the results */
  public String toString () {
    return his;
  }
  /* clears the memory and resets the total to zero */
  public void clear() {
	  his=" 0 ";
  }
}