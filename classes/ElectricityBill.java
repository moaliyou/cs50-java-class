package classes;

public class ElectricityBill{

    private int lastMonthReadings;
    private int currentMonthReadings;
    private int kilowatt;
    private double monthlyBillAmount;
    private double rateCharge;

    public ElectricityBill(){
        this.lastMonthReadings = 0;
        this.currentMonthReadings = 0;
        this.kilowatt = 0;
    }

    public ElectricityBill(int lastMonthReadings, int currentMonthReadings, double rateCharge){
        this.lastMonthReadings = lastMonthReadings;
        this.currentMonthReadings = currentMonthReadings;
        this.rateCharge = rateCharge;
    }

    public void setLastMonthReadings(int lastMonthReadings){
        this.lastMonthReadings = lastMonthReadings;
    }

    public void setCurrentMonthReadings(int currentMonthReadings){
        this.currentMonthReadings = currentMonthReadings;
    }

    public void setRateCharge(double rateCharge){
        this.rateCharge = rateCharge;
    }

    private double getRateCharge(){
        return rateCharge;
    }

    private int getLastMonthReadings(){
        return lastMonthReadings;
    }

    private int getCurrentMonthReadings(){
        return currentMonthReadings;
    }

    private int getKilowatt(){
        kilowatt = getCurrentMonthReadings() - getLastMonthReadings();
        return kilowatt;
    }

    public void calculateMonthlyBill(){
        monthlyBillAmount = getKilowatt() * getRateCharge();
    }
    
    public double getMonthlyBillAmount(){
        return monthlyBillAmount;
    }
    
    public void showMonthlyReport(){
        System.out.println("\nTHE MONTHLY REPORT DATA\n");
        
        System.out.println("Last month readings: " + getLastMonthReadings());
        System.out.println("Current month readings: " + getCurrentMonthReadings());
        System.out.println("Kilowatt used: " + getKilowatt() + "kw");
        System.out.println("Rate charge: $" + getRateCharge());
        System.out.printf("\nMonthly Bill Amount: $%.2f \n\n", getMonthlyBillAmount());
        
    }


}