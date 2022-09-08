/*Edwin Ly In Class 6 Lab 1: Employee 4/28/2022*/
package inclass6lab1;
public class Employee {
    private String name; //String object holding employee name
    private int idNumber; //int variable holding ID #
    private String department; //name of dep employee works
    private String position; //position of job title
    Employee(String name, int idNumber){ /*half constructor*/
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }
    Employee(){ //no-arg constructor 
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }
    Employee(String name, int idNumber, String department, String position){
        this.name = name; /*full constructor*/
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }
    public void setname(String aname) {
        name = aname;
    }
    public void setidnumber(int aidnumber) {
        idNumber = aidnumber;
    }
    public void setdepartment(String adepartment) {
        department = adepartment;
    }
    public void setposition(String aposition){
        position = aposition;
    }
    
    public String getname() {
        return name;
    }
    public int getidnumber() {
        return idNumber;
    }
    public String getdepartment() {
        return department;
    }
    public String getposition() {
        return position;
    }
    public void printInfo(){
        System.out.println(name + ", " + idNumber + ", " + department + ", " + position);
    }
    public static void main(String[] args) {
        Employee Susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee Mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee Joy = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        Susan.printInfo();
        Mark.printInfo();
        Joy.printInfo();
    }
}
