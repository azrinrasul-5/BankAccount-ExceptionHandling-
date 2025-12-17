import org.w3c.dom.ls.LSOutput;

class BankAccount{
    private String username;
    private int id;
    private int age;
    private double amount;

    BankAccount(String username, int id, int age, double amount ) throws AgeLimitException{
        if(age < 18){
            throw new AgeLimitException("Account cannot be created due to age restriction.");
        }
        this.username = username;
        this.id = id;
        this.age = age;
        this.amount = amount;
    }

    public void withdrawAmount(double withdrawAmount) throws InsufficientBalanceException {
        if (withdrawAmount > amount) {
            throw new InsufficientBalanceException("Insufficient balance");

        } else
            System.out.println(amount + " is withdrawn");
    }
    public double calculateProfit(int principal, double rate, int years) throws ExceptionInProfit{
        double interest = principal + principal*(rate/(float)100)*years;
        if(rate <= 0 || rate > 15){
            throw new ExceptionInProfit("Invalid profit rate");
        }
        else
            return interest;
    }
}