import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PrototypeDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter employee id: ");
        int eid = Integer.parseInt(br.readLine());
        System.out.print("\n");

        System.out.print("Enter employee name: ");
        String ename = br.readLine();
        System.out.print("\n");

        System.out.print("Enter employee designation: ");
        String edesignation = br.readLine();
        System.out.print("\n");

        System.out.print("Enter employee salary: ");
        Double esalary = Double.parseDouble(br.readLine());
        System.out.print("\n");

        System.out.print("Enter employee address: ");
        String eaddress = br.readLine();
        System.out.print("\n");

        EmployeeRecord e1 = new EmployeeRecord(eid, ename, edesignation, esalary, eaddress);

        e1.showRecord();
        System.out.println("\n");
        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
        e2.showRecord();
    }
}
