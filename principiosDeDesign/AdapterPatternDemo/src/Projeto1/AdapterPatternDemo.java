package Projeto1;

public class AdapterPatternDemo {
    public static void main(String args[]) {
        CreditCard targetInterface = new BankCostumer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());
    }

}
