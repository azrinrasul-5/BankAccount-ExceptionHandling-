public class Main {
    public static void main(String[] args) {
        try{
            BankAccount account1 = new BankAccount("Xyz",123, 18,30000);
            account1.withdrawAmount(3000);
            System.out.println(account1.calculateProfit(3000, 12, 8));
        }catch(AgeLimitException | InsufficientBalanceException | ExceptionInProfit e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("This is the Finally block");

        }

        }
    }
