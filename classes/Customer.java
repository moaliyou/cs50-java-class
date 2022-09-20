package classes;

public class Customer {
    
    private String customerName;
    private String homeNo;
    ElectricityBill bill;
    
    public Customer(String customerName, String homeNo, ElectricityBill bill){
        this.customerName = customerName;
        this.homeNo = homeNo;
        this.bill = bill;
    }
    
    public String getCustomerName(){
        return customerName;
    }
    
    public String getHomeNo(){
        return homeNo;
    }
    
    public void showMonthlyReport(){
        
        bill.calculateMonthlyBill();
        
        System.out.println("\nTHE MONTHLY REPORT DATA\n");
        
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Home No: " + getHomeNo());
        System.out.println("Last month readings: " + bill.getLastMonthReadings());
        System.out.println("Current month readings: " + bill.getCurrentMonthReadings());
        System.out.println("Kilowatt used: " + bill.getKilowatt() + "kw");
        System.out.println("Rate charge: $" + bill.getRateCharge());
        System.out.printf("\nMonthly Bill Amount: $%.2f \n\n", bill.getMonthlyBillAmount());
        
    }
    
}