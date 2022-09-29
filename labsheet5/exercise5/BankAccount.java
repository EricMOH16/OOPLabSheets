package labsheet5.exercise5;

public class BankAccount {

    private String owner;
    private int number;
    private static int count;
    private static double interestRate;

    public BankAccount(){
        this("Owner not available",0);
    }

    public BankAccount(String owner, double interestRate){
        setOwner(owner);
        setNumber(count);
        setInterestRate(interestRate);
        incrementCount();
    }

    public String getOwner() {
        return owner;
    }

    public int getNumber() {
        return number;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    private static void incrementCount(){
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public String toString(){
        return "Owner: " + getOwner() + " Number: " + getCount() +
                " Interest Rate: " + getInterestRate();
    }
}
