public class GeneralPractitioner extends HealthProfessional {
    static String practitionerType;
    private String specialty;  // 擅长的领域


    // 默认构造函数
    public GeneralPractitioner() {
        super();  // 调用父类的默认构造函数
        GeneralPractitioner.practitionerType = "general practitioner";
        this.specialty = "Be good at all";
    }

    // 带参构造函数
    public GeneralPractitioner(int id, String name, String description, String qualification, int yearsOfExperience, String contactInfo, String availableTimes,double serviceFee,String employmentStatus) {
        super(id, name, description, qualification, yearsOfExperience, contactInfo, availableTimes,serviceFee, employmentStatus);
        GeneralPractitioner.practitionerType = "general practitioner";
        this.specialty = "Be good at all";  
    }

    // 打印全科医生的详细信息
    @Override
    public void prirntDetails() {
        System.out.println("Details of health professionals are as follows:");
        super.prirntDetails();  // 调用父类的方法打印基本信息
        System.out.println("Types of health professionals: " + practitionerType);
        System.out.println("Areas of expertise: " + specialty);  // 打印擅长的领域
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