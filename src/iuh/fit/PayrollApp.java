package iuh.fit;

import java.time.LocalDate;

public class PayrollApp {
    public static void main(String[] args) {

        Employee emp1 = new HourlyEmployee("EMP101", "Khanh Nguyen", LocalDate.of(2000,3,15), 45, 10.0);
        Employee emp2 = new SalariedEmployee("EMP102","Le Lan",LocalDate.of(1999,4,25), 12000.0);
        Employee emp3 = new Manager("EMP103","Le Lan",LocalDate.of(1987,4,25), 15000.0,5.0);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

    }
}
