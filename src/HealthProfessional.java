import java.util.List;

public class HealthProfessional {
    
    // 实例变量
    private int id;             // 健康专业人员的ID
    private String name;        // 姓名
    private String description; // 评价
    private String qualification;// 资格认证
    private int yearsOfExperience;// 工作经验
    private String profession;    // 专业领域
    private String contactInfo;   // 联系方式
    private List<String> availableTimes;// 可预约时间
    private double serviceFee;    // 服务费用
    private String employmentStatus;// 雇佣状态


    // 默认构造函数
    public HealthProfessional() {
        this.id = 0;
        this.name = "None";
        this.description = "None";
        this.qualification = "None";
        this.yearsOfExperience = 0;
        this.profession = "None";
        this.contactInfo = "None";
        this.serviceFee = 0.0;
        this.employmentStatus = "Full-time";
    }

     // 带参数的构造函数
     public HealthProfessional(int id, String name, String description, String qualification, int yearsOfExperience, String profession, String contactInfo, List<String> availableTimes, double serviceFee, String employmentStatus){
        this.id = id;
        this.name = name;
        this.description = description;
        this.qualification = qualification;
        this.yearsOfExperience = yearsOfExperience;
        this.profession = profession;
        this.contactInfo = contactInfo;
        this.availableTimes = availableTimes;
        this.serviceFee = serviceFee;
        this.employmentStatus = employmentStatus;
    }
    
    // 打印实例变量的详细信息
    public void prirntDetails() {
        System.out.println("ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Description: "+ description);
        System.out.println("Qualification: " + qualification);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Profession: " + profession);
        System.out.println("Contact Info: " + contactInfo);
        System.out.println("Available Times: " + availableTimes);
        System.out.println("Service Fee: " + serviceFee);
        System.out.println("Employment Status: " + employmentStatus);
    }

    // Getter 和 Setter 方法
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

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    
    public String getContactInfo() {
        return contactInfo;
    }

    public void setAvailableTimes(List<String> availableTimes) {
        this.availableTimes = availableTimes;
    }

    public List<String> getAvailableTimes() {
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
}
