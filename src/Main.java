import java.util.ArrayList;
import java.util.Iterator;

public class Main {
        // 第 5 部分 - 预约的收集
        private static final ArrayList<Appointment> appointmentList = new ArrayList<>();

        // 创建新的预约并将其添加到预约列表
        public static void createAppointment(String patientName, String patientPhone, String preferredTime, HealthProfessional healthProfessional) {
            if (patientName.isEmpty() || patientPhone.isEmpty() || preferredTime.isEmpty()) {
                System.out.println("无法创建预约：信息不完整。");
                return;
            }
            
            Appointment newAppointment = new Appointment(patientName, patientPhone, preferredTime, healthProfessional);
            appointmentList.add(newAppointment);
            System.out.println("预约已成功创建！");
        }
    
        // 打印现有预约
        public static void printExistingAppointments() {
            if (appointmentList.isEmpty()) {
                System.out.println("当前没有预约。");
                return;
            }
    
            System.out.println("现有预约：");
            for (Appointment appointment : appointmentList) {
                appointment.displayAppointmentDetails();
                System.out.println("------------------------------");
            }
        }
    
        // 取消预约，通过患者手机号码来查找并删除
        public static void cancelBooking(String patientPhone) {
            Iterator<Appointment> iterator = appointmentList.iterator();
            boolean found = false;
    
            while (iterator.hasNext()) {
                Appointment appointment = iterator.next();
                if (appointment.getPatientPhone().equals(patientPhone)) {
                    iterator.remove();
                    System.out.println("预约已成功取消。");
                    found = true;
                    break;
                }
            }
    
            if (!found) {
                System.out.println("未找到此手机号码的预约。");
            }
        }
    
           
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

        nutritionist1.setSpecialty("Balanced diet plan");
        nutritionist1.setHealthPhilosophy("Overall health priority");
        nutritionist2.setSpecialty("High protein diet plan");
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
        System.out.println("------------------------------");

        // 第 5 部分 - 预约的收集
        // 预约两次全科医生
        createAppointment("Alice", "1234567890", "10:00", gp1);
        createAppointment("Bob", "0987654321", "14:30", gp2);

        // 预约另外两位专科医生
        createAppointment("Charlie", "1122334455", "11:00", nutritionist1);
        createAppointment("David", "5566778899", "15:00", nutritionist2);

        // 打印现有预约
        printExistingAppointments();
        System.out.println("------------------------------");

        // 取消某个预约
        cancelBooking("1122334455"); // 取消 Charlie 的预约
        System.out.println("------------------------------");

        // 打印更新后的预约
        printExistingAppointments();
    }
}
