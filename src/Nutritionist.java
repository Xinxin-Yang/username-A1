public class Nutritionist extends HealthProfessional {
    private String dietPlans; // 饮食计划类型
    private String healthPhilosophy; // 健康管理理念

    // 默认构造函数
    public Nutritionist() {
        super();  // 调用父类的默认构造函数
        this.dietPlans = "Balanced diet plan";
        this.healthPhilosophy = "Overall health priority";
    }
    
    // 带参构造函数
    public Nutritionist(int id, String name, String description, String qualification, int yearsOfExperience, String contactInfo, String availableTimes,double serviceFee,String employmentStatus) {
        super(id, name, description, qualification, yearsOfExperience, contactInfo, availableTimes,serviceFee, employmentStatus);
        this.dietPlans = "Balanced diet plan"; 
        this.healthPhilosophy = "Overall health priority";
    }
    
    // 打印全科医生的详细信息
    @Override
    public void prirntDetails() {
        System.out.println("Details of health professionals are as follows:");
        super.prirntDetails();  // 调用父类的方法打印基本信息
        System.out.println("Type of meal plan: " + dietPlans);
        System.out.println("Health management concept: " + healthPhilosophy);  // 打印具体职业类型
    }

    public void setDietPlans(String dietPlans) {
        this.dietPlans = dietPlans;
    }

    public String getDietPlans() {
        return dietPlans;
    }

    public void setHealthPhilosophy(String healthPhilosophy) {
        this.healthPhilosophy = healthPhilosophy;
    }

    public String getHealthPhilosophy() {
        return dietPlans;
    }
}
