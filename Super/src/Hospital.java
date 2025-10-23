final class Hospital {
    private final String hospitalName;
    private final String location;
    public Hospital(String name, String location) {
        this.hospitalName = name;
        this.location = location;
    }
    public void displayHospitalInfo() {
        System.out.println(hospitalName + " - " + location);
    }


    }