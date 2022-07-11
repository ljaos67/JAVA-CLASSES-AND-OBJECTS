/**********************************************************
 *                                                        *
 *  CSCI 470/502        Assignment 2         Summer 2021  *
 *                                                        *
 *  Class Name:   Invoice                                 *
 *                                                        *
 *  Developer(s): Leonart Jaos                            *
 *                                                        *
 *                                                        *
 *  Purpose:  The invoice class is used to create objects *
 *  with 4 private members; A string part number, a string*
 *  part description, an integer quantity of the part, and*
 *  the cost of a single unit of the part. This class has *
 *  set methods so that Invoice objects can have their    *
 *  member values changed, and get get methods so that    *
 *  member values of an Invoice can be seen. The method   *
 *  InvoiceAmount is also included the calculate the cost *
 *  of the total of the parts-- price * quantity.         *
 *                                                        *
 **********************************************************/ 

public class Invoice
{
  // instance variables
  private String partno;
  private String desc; 
  private int quantity;
  private double price;
  
  public Invoice()
  {
    // default constructor
  }
  // constructor with all members as parameters
  public Invoice(String partno, String desc, int quantity, double price)
  {
    this.partno = partno;
    this.desc = desc;
    this.quantity = quantity;
    this.price = price;
  }
  // set method for part numnber member, changes partno to value
  // taken in as parameter
  public void setPartno(String partno)
  {
    this.partno = partno;
  }
  // get method for part number member, returns part no
  public String getPartno()
  {
    return partno;
  }
  // set method for part description member, changes desc member to
  // value taken in as parameter
  public void setDesc(String desc)
  {
    this.desc = desc;
  }
  // get method for part description, returns description member 
  public String getDesc()
  {
    return desc;
  }
  // set method for part quantity member, changes quantity member
  // to value taken in parameter
  public void setQuantity(int quantity)
  {
    this.quantity = quantity;
  }
  // get method for part quantity member, returns quantity
  public int getQuantity()
  {
    return quantity;
  }
  // set method for part price member takes in price param
  // and changes price
  public void setPrice(double price)
  {
    this.price = price;
  }
  // get method for part price member, returns the price
  public double getPrice()
  {
    return price;
  }
  // method that calculates Invoice amount
  // filters out invalid quantity and price values, returns zero
  // otherwise, returns the price member multiplied with the quantity member
  public double getInvoiceAmount()
  {
    if(quantity < 0 || price < 0)
    {
      return 0.0;
    }
    else
    {
      return (price * quantity);
    }
  }
}