package oops;

import classes.*;

public class Main{

    public static void main(String[] args){

        Customer firstCustomer = new Customer("Mahmoud Ali Yusuf", "128-AB-Mog", new ElectricityBill(1298, 1313, 0.49));

        firstCustomer.showMonthlyReport();

    }

}