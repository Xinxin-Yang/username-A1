public class Nutritionist extends HealthProfessional {
    static String practitionerType;
    private String specialty; // Type of meal plan
    private String healthPhilosophy; // Health management concept

    //Default constructor
    public Nutritionist() {
        super();  
        Nutritionist.practitionerType = "Nutritionist";
        this.specialty = "Balanced diet plan";
        this.healthPhilosophy = "Overall health priority";
    }
    
    // Parameterized constructor
    public Nutritionist(int id, String name, String description, String qualification, int yearsOfExperience, String contactInfo, String availableTimes,double serviceFee,String employmentStatus) {
        super(id, name, description, qualification, yearsOfExperience, contactInfo, availableTimes,serviceFee, employmentStatus);
        Nutritionist.practitionerType = "Nutritionist";
        this.specialty = "Balanced diet plan"; 
        this.healthPhilosophy = "Overall health priority";
    }
    
    // Print details of dietitians
    @Override
    public void prirntDetails() {
        System.out.println("Details of health professionals are as follows:");
        super.prirntDetails();  // Calls the methods of the parent class to print basic information
        System.out.println("Types of health professionals: " + practitionerType);
        System.out.println("Type of meal plan: " + specialty);
        System.out.println("Health management concept: " + healthPhilosophy);  // Print meal plan types and health management ideas
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String getSpecialty() {
        return specialty;
    }

    public void setHealthPhilosophy(String healthPhilosophy) {
        this.healthPhilosophy = healthPhilosophy;
    }

    public String getHealthPhilosophy() {
        return healthPhilosophy;
    }

    public void setPractitionerType(String practitionerType) {
        Nutritionist.practitionerType = "Nutritionist";
    }

    public String getPractitionerType() {
        return practitionerType;
    }
}
