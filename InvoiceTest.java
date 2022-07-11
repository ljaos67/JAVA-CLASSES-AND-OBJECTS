/**********************************************************
 *                                                        *
 *  CSCI 470/502        Assignment 2         Summer 2021  *
 *                                                        *
 *  Developer(s):  Leonart Jaos                           *
 *                                                        *
 *                                                        *
 *  Section:  0Y01                                        *
 *                                                        *
 *  Due Date/Time: 06/25/2021 @ 11:59 PM                  *
 *                                                        *
 *  Purpose:  This app uses the Invoice class, which des- *
 *  cribes an item, the quantity of the item, the cost of *
 *  the item, and a description of the item. This app in- *
 *  itializes 5 Invoice class members and uses the invoice*
 *  class get methods to access the members to print      *
 *  object details. The Invoice #, item part number, item *
 *  description, item quantity, and item price are output *
 *  along with the invoice amount figure which is output  *
 *  using the DecimalFormat class and calculated using the*
 *  invoiceamount method.                                 *
 *                                                        *
 **********************************************************/
// For DecimalFormat class
import java.text.DecimalFormat;

public class InvoiceTest
{ // main method begins execution of InvoiceTest app
  public static void main(String[] args)
  {
    // instantiation of 5 Invoice objects using 4 argument-constructor
    Invoice item1 = new Invoice("TR-46-2390", "PORTER Belt Sander", 25, 119.99);
    Invoice item2 = new Invoice("RO-09-1140", "Philips Head Screwdriver", 43, 9.99);
    Invoice item3 = new Invoice("LD-78-5302", "Rotorazer Saw", 87, 149.85);
    Invoice item4 = new Invoice("GH-01-3768", "Ryobi 18-Volt Power Drill", 33, 49.97);
    Invoice item5 = new Invoice("TC-24-2065", "PORTER Impact Wrench", 25, 70.42);
    // print structure for first invoice object
    // print object members, part number, description, quantity, and price
    // using the Invoice class get methods
    System.out.printf("Invoice # 1 %n%n");
    System.out.printf("        Part No.:  %s%n%n", item1.getPartno());
    System.out.printf("      Item Desc.:  %s%n%n", item1.getDesc());
    System.out.printf("        Quantity:  %d%n%n", item1.getQuantity());
    System.out.printf("      Item Price:  %.2f%n%n",item1.getPrice());
    // creates DecimalFormat object of which is used to create edit pattern
    DecimalFormat aFormat = new DecimalFormat("$##,###,##0.00");
    // print Invoice amount using InvoiceAmount member in the format of the edit pattern
    System.out.printf("Invoice Subtotal:  %14s\n\n", aFormat.format(item1.getInvoiceAmount()));
    System.out.print("*********************************\n\n");
    // repeats the logic above for object 2
    System.out.printf("Invoice # 2 %n%n");
    System.out.printf("        Part No.:  %s%n%n", item2.getPartno());
    System.out.printf("      Item Desc.:  %s%n%n", item2.getDesc());
    System.out.printf("        Quantity:  %d%n%n", item2.getQuantity());
    System.out.printf("      Item Price:  %.2f%n%n",item2.getPrice());
    System.out.printf("Invoice Subtotal:  %14s\n\n", aFormat.format(item2.getInvoiceAmount()));
    System.out.print("*********************************\n\n");
    // repeats the logic above for object 3
    System.out.printf("Invoice # 3 %n%n");
    System.out.printf("        Part No.:  %s%n%n", item3.getPartno());
    System.out.printf("      Item Desc.:  %s%n%n", item3.getDesc());
    System.out.printf("        Quantity:  %d%n%n", item3.getQuantity());
    System.out.printf("      Item Price:  %.2f%n%n",item3.getPrice());
    System.out.printf("Invoice Subtotal:  %14s\n\n", aFormat.format(item3.getInvoiceAmount()));
    System.out.print("*********************************\n\n");
    // repeats the logic above for object 4
    System.out.printf("Invoice # 4 %n%n");
    System.out.printf("        Part No.:  %s%n%n", item4.getPartno());
    System.out.printf("      Item Desc.:  %s%n%n", item4.getDesc());
    System.out.printf("        Quantity:  %d%n%n", item4.getQuantity());
    System.out.printf("      Item Price:  %.2f%n%n",item4.getPrice());
    System.out.printf("Invoice Subtotal:  %14s\n\n", aFormat.format(item4.getInvoiceAmount()));
    System.out.print("*********************************\n\n");
    // repeats the logic above for object 5
    System.out.printf("Invoice # 5 %n%n");
    System.out.printf("        Part No.:  %s%n%n", item5.getPartno());
    System.out.printf("      Item Desc.:  %s%n%n", item5.getDesc());
    System.out.printf("        Quantity:  %d%n%n", item5.getQuantity());
    System.out.printf("      Item Price:  %.2f%n%n",item5.getPrice());
    System.out.printf("Invoice Subtotal:  %14s\n\n", aFormat.format(item5.getInvoiceAmount()));
    System.out.print("*********************************\n\n");
  }
}