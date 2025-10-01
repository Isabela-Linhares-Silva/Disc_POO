package estudoProvaN12.src;

public class Employee {
    private String name;
    private double salary;
    private String departament;

    public Employee(String name){
        this.name = name ;
        salary = 1000;
        departament = "Geral";
    }

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
        departament = "Geral";
    }

    public Employee(String name, double salary, String department){
        this.name = name;
        this.salary = salary;
        this.departament = department;
    }

    public void IncreaseSalary(int percent){
        salary += salary * (percent/100); 
    }

    public void printEmployee(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Departament: " + departament);
        System.out.println("---------------------");
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }
    public String getDepatarment(){
        return departament;
    }
}
