public class Nurse extends Department{
    private final String shift;
    String Salary;


    public Nurse(String name, int deprtmentId, String department, String shift, String salary) {
        super(name, deprtmentId, department);
        this.shift = shift;
        Salary = salary;
    }

    public void displayInfo() {
        System.out.println("ID: " + super.deprtmentId + " , Name: " + name);
        System.out.println("Dept: " + department + " ,Shift: " + shift);
        System.out.println("salary:"+"Ugx"+Salary);
    }

}
