
public class Equipment {
    String equipmentId;
    String equipmentName;
    int availableQuantity;

    // Constructor
    public Equipment(String equipmentId, String equipmentName,
                     int availableQuantity) {
        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
        this.availableQuantity = availableQuantity;
    }

    // Display Equipment Details
    public void displayEquipmentDetails() {
        System.out.println("Equipment ID: " + equipmentId);
        System.out.println("Name: " + equipmentName);
        System.out.println("Available Quantity: " + availableQuantity);
    }

    // Borrow Equipment
    public boolean borrowOneItem() {
        if (availableQuantity > 0) {
            availableQuantity--;
            System.out.println("Equipment Borrowed Successfully!");
            System.out.println("Remaining Quantity: " + availableQuantity);
            return true;
        } else {
            System.out.println("Sorry, equipment is not available.");
            return false;
        }
    }

    // Return Equipment
    public void returnOneItem() {
        availableQuantity++;
        System.out.println("Equipment Returned Successfully!");
        System.out.println("Available Quantity: " + availableQuantity);
    }
}
