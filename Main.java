package oops;

import classes.*;

public class Main{

    public static void main(String[] args){

        // Customer firstCustomer = new Customer("Mahmoud Ali Yusuf", "128-AB-Mog", new ElectricityBill(1298, 1313, 0.49));

        // firstCustomer.showMonthlyReport();
        
        Book book1 = new Book("Atomic Habits", 10.5, new Author("James Clear", "jamesclear19@gmail.com", 'M'));
        
        book1.printBookDetails();

    }

}