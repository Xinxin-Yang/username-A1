public class Appointment {
    private String patientName;
    private String patientPhone;
    private String preferredTime;  // 例如08:00、10:00、14:30
    private HealthProfessional healthProfessional;  // 使用Doctor类或其子类

    // 默认构造函数
    public Appointment() {
        this.patientName = "Unknown";
        this.patientPhone = "Unknown";
        this.preferredTime = "08:00";
        this.healthProfessional = new GeneralPractitioner();  // 默认选择全科医生
    }

    // 带参数的构造函数
    public Appointment(String patientName, String patientPhone, String preferredTime, HealthProfessional healthProfessional) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.preferredTime = preferredTime;
        this.healthProfessional = healthProfessional;
    }

    // Getter 和 Setter 方法
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


    // 输出预约信息
    public void displayAppointmentDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Phone: " + patientPhone);
        System.out.println("Preferred Time: " + preferredTime);
        System.out.println("The name of the health professional: " + healthProfessional.getName());
        System.out.println("Specialty: " + healthProfessional.getSpecialty());
    }
}
