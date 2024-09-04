package iuh.fit;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Employee  {

    protected String id;
    protected String name;
    protected LocalDate dob;
    //overloading constructors
    public Employee(){
        this("","",LocalDate.now());
//        this.id = "";
//        this.name = "";
//        this.dob = LocalDate.now();
    }

    public Employee(String id, String name, LocalDate dob){
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public Employee(String id){
        this.id = id;
        this.name = "";
        this.dob = LocalDate.now();
    }

    public void setName(String name){
//      check constraints
        this.name = name;
    }

    public String getName(){
        return name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public abstract double weeklyPay();

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("$#,##0.00");
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-20s%-10s%-20s%15s%10s",getClass().getSimpleName(), id,name,dob.format(df2),df.format(weeklyPay()));
    }
}
