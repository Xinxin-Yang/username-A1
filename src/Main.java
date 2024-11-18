import java.util.ArrayList;
import java.util.Iterator;

public class Main {
        // Part 5 - Collection of appointments
        private static final ArrayList<Appointment> appointmentList = new ArrayList<>();

        // Create a new appointment and add it to the appointment list
        public static void createAppointment(String patientName, String patientPhone, String preferredTime, HealthProfessional healthProfessional) {
            if (patientName.isEmpty() || patientPhone.isEmpty() || preferredTime.isEmpty()) {
                System.out.println("Unable to create a reservation: The information is incomplete.");
            }
            
            else {
                Appointment newAppointment = new Appointment(patientName, patientPhone, preferredTime, healthProfessional);
                appointmentList.add(newAppointment);
                System.out.println("Reservation created successfully!");
            }
        }
    
        // Print existing appointment
        public static void printExistingAppointments() {
            if (appointmentList.isEmpty()) {
                System.out.println("There is no appointment at the moment.");
            }
    
            else {
                System.out.println("Existing appointment：");
                for (Appointment appointment : appointmentList) {
                    appointment.displayAppointmentDetails();
                    System.out.println("------------------------------");
                }
            }
        }
    
        //Cancel the appointment, find and delete it by the patient's cell phone number
        public static void cancelBooking(String patientPhone) {
            if (appointmentList.isEmpty()) {
                System.out.println("There is no appointment at the moment.");
            }

            if (patientPhone.isEmpty()) {
                System.out.println("Unable to cancel: Mobile number does not exist.");
            }

            Iterator<Appointment> iterator = appointmentList.iterator();  //Introduce interfaces that traverse the elements of a collection sequentially
    
            while (iterator.hasNext()) {
                Appointment appointment = iterator.next();
                if (appointment.getPatientPhone().equals(patientPhone)) {
                    iterator.remove();
                    System.out.println("The reservation has been successfully cancelled.");
                    break;
                }
            }      
        }
    
           
    public static void main(String[] args) {
        // Create three general practitioner objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. William", "The general practitioner specializes in paediatrics.", "MD", 11, "156-345-3620", "9:00 AM - 5:00 PM", 200.0, "Full-time");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. James", "The general practitioner has experience in home care.", "MD", 9, "193-376-9270", "8:00 AM - 4:00 PM", 240.0, "Freelance");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Johnson", "The general practitioner's expertise in gerontology is extensive.", "MD", 10, "197-886-3647", "10:00 AM - 7:00 PM", 190.0, "Part-time");

        // Create two dietitian objects
        Nutritionist nutritionist1 = new Nutritionist(4, "Michael Davis", "The dietitian focuses on plant-based diets.", "MSc in Nutrition", 7, "188-666-7778", "9:00 AM - 5:00 PM", 230.0, "Freelance");
        Nutritionist nutritionist2 = new Nutritionist(5, "Charlotte King", "The dietitian specializes in sports nutrition.", "BSc in Nutrition", 9, "133-678-9274", "11:00 AM - 6:00 PM", 170.0, "Part-time");

        GeneralPractitioner.practitionerType = "general practitioner";
        Nutritionist.practitionerType = "Nutritionist";

        gp1.setSpecialty("Department of surgery");
        gp2.setSpecialty("Internal medicine");
        gp3.setSpecialty("Be good at all");

        nutritionist1.setSpecialty("Balanced diet plan");
        nutritionist1.setHealthPhilosophy("Overall health priority");
        nutritionist2.setSpecialty("High protein diet plan");
        nutritionist2.setHealthPhilosophy("Sustainability and long-term management");

        
        // Print details for each medical professional
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

        // Part 5 - Collection of appointments
        // Make two GP appointments
        createAppointment("Charlotte King", "1772554789", "9:00", gp1);
        createAppointment("Daniel Robinson", "2996346188", "14:30", gp2);

        // Make an appointment with two other specialists
        createAppointment("Olivia Carter", "3682972567", "10:00", nutritionist1);
        createAppointment("Grace Walker", "4678352259", "17:00", nutritionist2);

        // Print existing appointment
        printExistingAppointments();
        System.out.println("------------------------------");

        // Cancel an appointment
        cancelBooking("3682972567"); // Cancel Charlie's appointment
        System.out.println("------------------------------");

        // Print the updated appointment
        printExistingAppointments();
    }
}
