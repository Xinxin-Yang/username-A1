public abstract class HealthProfessional {
    
    // Instance variable
    private int id;             // ID of the health professional
    private String name;        // name
    private String description; // evaluate
    private String qualification;// Qualification certification
    private int yearsOfExperience;// Work experience
    private String contactInfo;   // Contact information
    private String availableTimes;// Available time
    private double serviceFee;    // Service charge
    private String employmentStatus;// Employment status


    // Default constructor
    public HealthProfessional() {
        this.id = 0;
        this.name = "None";
        this.description = "None";
        this.qualification = "None";
        this.yearsOfExperience = 0;
        this.contactInfo = "None";
        this.serviceFee = 0.0;
        this.employmentStatus = "Full-time";
    }

     // A constructor with arguments
     public HealthProfessional(int id, String name, String description, String qualification, int yearsOfExperience, String contactInfo, String availableTimes, double serviceFee, String employmentStatus){
        this.id = id;
        this.name = name;
        this.description = description;
        this.qualification = qualification;
        this.yearsOfExperience = yearsOfExperience;
        this.contactInfo = contactInfo;
        this.availableTimes = availableTimes;
        this.serviceFee = serviceFee;
        this.employmentStatus = employmentStatus;
    }
    
    // Print details of the instance variable
    public void prirntDetails() {
        System.out.println("ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Description: "+ description);
        System.out.println("Qualification: " + qualification);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Contact Info: " + contactInfo);
        System.out.println("Available Times: " + availableTimes);
        System.out.println("Service Fee: " + serviceFee);
        System.out.println("Employment Status: " + employmentStatus);
    }

    // Getter and Setter methods
    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    
    public String getContactInfo() {
        return contactInfo;
    }

    public void setAvailableTimes(String availableTimes) {
        this.availableTimes = availableTimes;
    }

    public String getAvailableTimes() {
        return availableTimes;
    }

    public void setServiceFee(double serviceFee) {
        this.serviceFee = serviceFee;
    }

    public double getServiceFee() {
        return serviceFee;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public abstract String getSpecialty();
}
