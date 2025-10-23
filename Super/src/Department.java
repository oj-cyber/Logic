public class Department {
    protected String name;
    protected  int deprtmentId;
    protected String department;
    public static final String HOSPITAL_CODE = "GEN_HOSP";

    public Department(String name, int deprtmentId, String department) {
        this.name = name;
        this.deprtmentId = deprtmentId;
        this.department = department;
    }

    public final int getDeprtmentId() {
        return deprtmentId;
    }
    public void displayInfo() {
        System.out.println("ID: " +deprtmentId + ", Name: " + name + " , Dept: " + department);
    }
}
