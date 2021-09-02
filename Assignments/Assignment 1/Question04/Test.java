
/*
4. Create a class called Invoice that a hardware store might
use to represent an invoice for an item sold at the store. An
Invoice should include four pieces of information as instance
variables—a part number (type String), a part description (type
String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and
a get method for each instance variable.

In addition, provide a method named getInvoiceAmount that
calculates the invoice amount (i.e. multiplies the quantity by
the price per item), then returns the amount as a double value.
If the quantity is not positive, it should be set to 0. If the
price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate
class Invoice’s capabilities.
*/
import java.util.*;

class Invoice {

    String partnum;
    String partdes;
    int qty;
    double price;

    Invoice() {
        System.out.println("New Invoice Generated!");
        Scanner Obj = new Scanner(System.in);
        System.out.print("Enter Part number :: ");
        partnum = Obj.next();
        System.out.print("Enter Part description :: ");
        partdes = Obj.next();
        System.out.print("Enter Quantity :: ");
        qty = Obj.nextInt();
        if (qty < 0)
            qty = 0;
        System.out.print("Enter Price :: ");
        price = Obj.nextDouble();
        if (price < 0)
            price = 0.0;
    }

    public String getPartnum() {
        return partnum;
    }

    public void setPartnum(String partnum) {
        this.partnum = partnum;
    }

    public String getPartdes() {
        return partdes;
    }

    public void setPartdes(String partdes) {
        this.partdes = partdes;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        if (qty < 0)
            this.qty = 0;
        else
            this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0)
            this.price = 0.0;
        else
            this.price = price;
    }

    double getInvoiceAmount() {
        double amount = 0;
        amount = qty * price;
        return amount;
    }
}

public class Test {
    public static void main(String[] args) {
        Invoice myObj = new Invoice();
        Scanner testObj = new Scanner(System.in);
        String partnum;
        String partdes;
        int qty;
        double price;
        int choice = 0;
        do {
            System.out.println("********************Program Menu********************");
            System.out.println("0.Exit");
            System.out.println("1.Display Invoice");
            System.out.println("2.Update Part Number");
            System.out.println("3.Update Part Description");
            System.out.println("4.Update Quantity");
            System.out.println("5.Update Price Per Part");
            System.out.print("Enter Choice :: ");

            choice = testObj.nextInt();

            switch (choice) {

                case 0:
                    System.out.println("Program Terminated Successfully");
                    break;

                case 1:
                    System.out.println("***********************Invoice**********************");
                    System.out.println("Part Number :: " + myObj.getPartnum());
                    System.out.println("Part Description :: " + myObj.getPartdes());
                    System.out.println("Quantity :: " + myObj.getQty());
                    System.out.println("Price Per Part :: " + myObj.getPrice());
                    System.out.println("Invoice Amount :: " + myObj.getInvoiceAmount());
                    continue;

                case 2:
                    System.out.print("Enter New Part Number :: ");
                    partnum = testObj.next();
                    myObj.setPartnum(partnum);
                    System.out.println("Part Number Updated Successfully");
                    continue;

                case 3:
                    System.out.print("Enter New Part Description :: ");
                    partdes = testObj.next();
                    myObj.setPartdes(partdes);
                    System.out.println("Part Description Updated Successfully");
                    continue;

                case 4:
                    System.out.print("Enter New Quantity :: ");
                    qty = testObj.nextInt();
                    myObj.setQty(qty);
                    System.out.println("Quantity Updated Successfully");
                    continue;

                case 5:
                    System.out.print("Enter New Price Per Part :: ");
                    price = testObj.nextDouble();
                    myObj.setPrice(price);
                    System.out.println("Price Updated Successfully");
                    continue;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 0);

    }

}
