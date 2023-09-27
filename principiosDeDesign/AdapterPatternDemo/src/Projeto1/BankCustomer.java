package Projeto1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard {
    public void giveBankDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Digite o nome do titular da conta: ");
            String customername = br.readLine();
            System.out.print("\n");

            System.out.println("Digite o número da conta: ");
            long accno = Long.parseLong(br.readLine());
            System.out.print("\n");

            System.out.println("Digite o nome do banco:");
            String bankName = br.readLine();

            setAccHolderName(customername);
            setAccNumber(accno);
            setBankName(bankName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        long accno = getAccNumber();
        String accholdername = getAccHolderName();
        String bname = getBankName();

        return ("O número da conta " + accno + " / Nome: " + accholdername + " / Banco: " + bname);
    }

}
