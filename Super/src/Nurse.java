public class Nurse extends Department{
    private final String shift;

    public Nurse(String name, int deprtmentId, String department, String shift) {
        super(name, deprtmentId, department);
        this.shift = shift;
    }
    public void displayInfo() {
        System.out.println("ID: " + super.deprtmentId + " , Name: " + name);
        System.out.println("Dept: " + department + " ,Shift: " + shift);
    }

}
