public class GeneralPractitioner extends HealthProfessional {
    private String specialty;  // 擅长的领域


    // 默认构造函数
    public GeneralPractitioner() {
        super();  // 调用父类的默认构造函数
        this.specialty = "Be good at all";
    }

    // 带参构造函数
    public GeneralPractitioner(int id, String name, String description, String qualification, int yearsOfExperience, String contactInfo, String availableTimes,double serviceFee,String employmentStatus) {
        super(id, name, description, qualification, yearsOfExperience, contactInfo, availableTimes,serviceFee, employmentStatus);
        this.specialty = "Be good at all";  // 确保该值是“全科医生”
    }

    // 打印全科医生的详细信息
    @Override
    public void prirntDetails() {
        System.out.println("Details of health professionals are as follows:");
        super.prirntDetails();  // 调用父类的方法打印基本信息
        System.out.println("Areas of expertise: " + specialty);  // 打印具体职业类型
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }


}