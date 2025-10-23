public class Doctor extends Department {
    private final String specialization;
    private String licenseNumber;

    public Doctor(String name, int deprtmentId, String department, String specialization, String licenseNumber) {
        super(name, deprtmentId, department);
        this.specialization = specialization;
        this.licenseNumber = licenseNumber;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
        System.out.println("License: " + licenseNumber);
    }
    public void prescribeMedicine() {
        System.out.println("Dr. " + name + " is prescribing medicine to the patient.");
    }
}
