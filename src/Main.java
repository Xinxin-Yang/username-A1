public class Main {
    public static void main(String[] args) {
        // 创建三个全科医生对象
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "General practitioner with experience in family care", "MD", 10, "123-456-7890", "9:00 AM - 5:00 PM", 150.0, "Full-time");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Johnson", "General practitioner specializing in pediatrics", "MD", 8, "987-654-3210", "10:00 AM - 4:00 PM", 160.0, "Full-time");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Lee", "General practitioner with expertise in geriatrics", "MD", 12, "555-123-4567", "9:00 AM - 6:00 PM", 170.0, "Part-time");

        // 创建两个营养师对象
        Nutritionist nutritionist1 = new Nutritionist(4, "Alice Wang", "Nutritionist with focus on plant-based diets", "MSc in Nutrition", 5, "555-234-5678", "9:00 AM - 4:00 PM", 120.0, "Freelance");
        Nutritionist nutritionist2 = new Nutritionist(5, "Bob Zhang", "Nutritionist specializing in sports nutrition", "BSc in Nutrition", 6, "555-345-6789", "11:00 AM - 5:00 PM", 130.0, "Full-time");

        GeneralPractitioner.practitionerType = "general practitioner";
        Nutritionist.practitionerType = "Nutritionist";

        gp1.setSpecialty("Department of surgery");
        gp2.setSpecialty("Internal medicine");
        gp3.setSpecialty("Be good at all");

        nutritionist1.setDietPlans("Balanced diet plan");
        nutritionist1.setHealthPhilosophy("Overall health priority");
        nutritionist2.setDietPlans("High protein diet plan");
        nutritionist2.setHealthPhilosophy("Sustainability and long-term management");


        // 打印每个医疗专业人员的详细信息
        gp1.prirntDetails();
        System.out.println("------------------------------");
        gp2.prirntDetails();
        System.out.println("------------------------------");
        gp3.prirntDetails();
        System.out.println("------------------------------");
        nutritionist1.prirntDetails();
        System.out.println("------------------------------");
        nutritionist2.prirntDetails();
    }

}
