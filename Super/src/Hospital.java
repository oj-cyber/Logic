final class Hospital {
    private final String hospitalName;
    private final String location;
     String Rating;

    public Hospital(String hospitalName, String location, String rating) {
        this.hospitalName = hospitalName;
        this.location = location;
        this.Rating = rating;
    }

    public Hospital(String name, String location) {
        this.hospitalName = name;
        this.location = location;
    }
    public void displayHospitalInfo() {
        System.out.println(hospitalName + " - " + location);
        System.out.println("Rating"+" "+Rating);
    }


    }