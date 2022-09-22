package exerciciopoo.descontosalario;

public class Employee {

    String name;
    double grossSalary;
    double tax;

    double netSalary(){
        return grossSalary - tax;
    }

    void increaseSalary(double percentage){
        grossSalary += grossSalary * percentage / 100;
    }

    public String toString(){
        return name + ", $" + String.format("%.2f", netSalary());
    }
}
