
public class MainClass {
    public static void main(String[] args) {

        // Student Objects
        Student student1 = new Student("ST101", "Ahmed Hassan");
        Student student2 = new Student("ST102", "Amina Ali");
        Student student3 = new Student("ST103", "Mohamed Omar");

        // Display Students
        System.out.println("===== UNIVERSITY LABORATORY SYSTEM =====");
        System.out.println("\n===== STUDENT INFORMATION =====");

        student1.displayStudentDetails();
        System.out.println();

        student2.displayStudentDetails();
        System.out.println();

        student3.displayStudentDetails();

        // Equipment Objects
        Equipment equipment1 = new Equipment("EQ201", "Cisco Router", 5);
        Equipment equipment2 = new Equipment("EQ202", "Laptop", 3);
        Equipment equipment3 = new Equipment("EQ203", "Network Switch", 2);
        Equipment equipment4 = new Equipment("EQ204", "Projector", 1);

        // Display Equipment
        System.out.println("\n===== EQUIPMENT INFORMATION =====");

        equipment1.displayEquipmentDetails();
        System.out.println();

        equipment2.displayEquipmentDetails();
        System.out.println();

        equipment3.displayEquipmentDetails();
        System.out.println();

        equipment4.displayEquipmentDetails();

        // Borrow Equipment
        System.out.println("\n===== BORROW EQUIPMENT =====");
        System.out.println("Student: " + student1.studentName);
        System.out.println("Equipment: " + equipment1.equipmentName);

        boolean borrowed = equipment1.borrowOneItem();

        // Updated Details After Borrowing
        System.out.println("\n===== UPDATED EQUIPMENT =====");
        equipment1.displayEquipmentDetails();

        // Return Equipment
        if (borrowed) {
            System.out.println("\n===== RETURN EQUIPMENT =====");
            System.out.println("Student: " + student1.studentName);
            System.out.println("Equipment: " + equipment1.equipmentName);

            equipment1.returnOneItem();
        }

        // Final Details
        System.out.println("\n===== FINAL EQUIPMENT DETAILS =====");
        equipment1.displayEquipmentDetails();

        // Test Zero Quantity
        System.out.println("\n===== TEST UNAVAILABLE EQUIPMENT =====");

        Equipment equipment5 = new Equipment("EQ205", "Old Laptop", 0);
        equipment5.displayEquipmentDetails();
        equipment5.borrowOneItem();
    }
}
