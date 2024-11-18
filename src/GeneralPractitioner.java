public class GeneralPractitioner extends HealthProfessional {
    static String practitionerType;
    private String specialty;  // areas of expertise

    // Default constructor
    public GeneralPractitioner() {
        super();  // Call the default constructor of the parent class
        GeneralPractitioner.practitionerType = "general practitioner";
        this.specialty = "Be good at all";
    }

    // Parameterized constructor
    public GeneralPractitioner(int id, String name, String description, String qualification, int yearsOfExperience, String contactInfo, String availableTimes,double serviceFee,String employmentStatus) {
        super(id, name, description, qualification, yearsOfExperience, contactInfo, availableTimes,serviceFee, employmentStatus);
        GeneralPractitioner.practitionerType = "general practitioner";
        this.specialty = "Be good at all";  
    }

    // Print details of the general practitioner
    @Override
    public void prirntDetails() {
        System.out.println("Details of health professionals are as follows:");
        super.prirntDetails();  // Calls the methods of the parent class to print basic information
        System.out.println("Types of health professionals: " + practitionerType);
        System.out.println("Areas of expertise: " + specialty);  // Print areas of expertise
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String getSpecialty() {
        return specialty;
    }

    public void setPractitionerType(String practitionerType) {
        GeneralPractitioner.practitionerType = "general practitioner";
    }

    public String getPractitionerType() {
        return practitionerType;
    }
}