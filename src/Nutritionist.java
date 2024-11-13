public class Nutritionist extends HealthProfessional {
    static String practitionerType;
    private String specialty; // 饮食计划类型
    private String healthPhilosophy; // 健康管理理念

    // 默认构造函数
    public Nutritionist() {
        super();  // 调用父类的默认构造函数
        Nutritionist.practitionerType = "Nutritionist";
        this.specialty = "Balanced diet plan";
        this.healthPhilosophy = "Overall health priority";
    }
    
    // 带参构造函数
    public Nutritionist(int id, String name, String description, String qualification, int yearsOfExperience, String contactInfo, String availableTimes,double serviceFee,String employmentStatus) {
        super(id, name, description, qualification, yearsOfExperience, contactInfo, availableTimes,serviceFee, employmentStatus);
        Nutritionist.practitionerType = "Nutritionist";
        this.specialty = "Balanced diet plan"; 
        this.healthPhilosophy = "Overall health priority";
    }
    
    // 打印营养师的详细信息
    @Override
    public void prirntDetails() {
        System.out.println("Details of health professionals are as follows:");
        super.prirntDetails();  // 调用父类的方法打印基本信息
        System.out.println("Types of health professionals: " + practitionerType);
        System.out.println("Type of meal plan: " + specialty);
        System.out.println("Health management concept: " + healthPhilosophy);  // 打印饮食计划类型和健康管理理念
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
