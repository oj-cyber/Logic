public class Main {
    public static void main(String[] args) {
        System.out.println("=== HOSPITAL MANAGEMENT SYSTEM ===");
        Hospital hospital = new Hospital("KCCA Hospital", "kasanga");
        hospital.displayHospitalInfo();
        System.out.println("Hospital Code: " + Department.HOSPITAL_CODE + "\n");

        System.out.println("=== Doctor ===");
        Doctor doctor = new Doctor("Mukibi Wilson", 101, "Cardiology",
                "Heart Specialist", "MED12345"+"\n");
        doctor.displayInfo();

        System.out.println("=== Nurse ===");
        Nurse nurse = new Nurse("Kyeyune Johnson", 201, "Emergency", "Day"+ "\n");
        nurse.displayInfo();

        System.out.println("=== Department ===");
       Department head = new Department("Emma Davis", 301, "Cardiology");
       head.displayInfo();

    }
}
