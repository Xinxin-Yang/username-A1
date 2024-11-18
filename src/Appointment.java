public class Appointment {
    private String patientName;
    private String patientPhone;
    private String preferredTime;  //For example, 08:00, 10:00, and 14:30
    private HealthProfessional healthProfessional;  // Use the Doctor class or its subclasses
    // Default constructor
    public Appointment() {
        this.patientName = "None";
        this.patientPhone = "None";
        this.preferredTime = "08:00";
        this.healthProfessional = new GeneralPractitioner();  // General practitioner is selected by default
    }

    // A constructor with arguments
    public Appointment(String patientName, String patientPhone, String preferredTime, HealthProfessional healthProfessional) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.preferredTime = preferredTime;
        this.healthProfessional = healthProfessional;
    }

    // Getter and Setter methods
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    
    public String getPatientName() {
        return patientName;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPreferredTime(String preferredTime) {
        this.preferredTime = preferredTime;
    }

    public String getPreferredTime() {
        return preferredTime;
    }

    public void setHealthProfessionalD(HealthProfessional healthProfessional) {
        this.healthProfessional = healthProfessional;
    }
    
    public HealthProfessional getHealthProfessional() {
        return healthProfessional;
    }


    // Outputting reservation information
    public void displayAppointmentDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Phone: " + patientPhone);
        System.out.println("Preferred Time: " + preferredTime);
        System.out.println("The name of the health professional: " + healthProfessional.getName());
        System.out.println("Specialty: " + healthProfessional.getSpecialty());
    }
}
