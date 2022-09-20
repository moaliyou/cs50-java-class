package oops;

import classes.*;

public class Main{

    public static void main(String[] args){

        ElectricityBill firstBill = new ElectricityBill();
        
        firstBill.setLastMonthReadings(1273);
        firstBill.setCurrentMonthReadings(1318);
        firstBill.setRateCharge(0.39);

        firstBill.calculateMonthlyBill();
        
        System.out.printf("$%.2f\n", firstBill.getMonthlyBillAmount());

    }

}