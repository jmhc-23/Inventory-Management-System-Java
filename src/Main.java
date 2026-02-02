import java.util.List;

public class Main {

    public static void main(String[] args) {
        InventoryService service = new InventoryService();

        service.addItem(new Item("Dell Inspiron Laptop", "Laptop", "Office Desk", 2026));
        service.addItem(new Item("HP Wireless Mouse", "Mouse", "Accessory Drawer", 2027));
        service.addItem(new Item("Lenovo ThinkPad Laptop", "Laptop", "Work Desk", 2028));
        service.addItem(new Item("Samsung Galaxy Smartphone", "Smart Phone", "White Chair", 2029));
        service.addItem(new Item("iPhone 14", "Mobile", "Bedroom Drawer", 2027));
        service.addItem(new Item("Sony Bluetooth Headphones", "Wireless Headphones", "Study Table", 2025));
        service.addItem(new Item("Samsung 27-inch Monitor", "Monitor", "Work Desk", 2028));
        service.addItem(new Item("Type C Charging Cable", "Cable", "White Drawer", 2024));
        service.addItem(new Item("Logitech Wireless Keyboard", "Keyboard", "Office Desk", 2026));
        service.addItem(new Item("Canon Inkjet Printer", "Printer", "Office Corner", 2029));

//      List<Item> items=service.getAllItems();
//      for (Item i:items){
//        System.out.println(i);
//       }
//
//      System.out.println("============================================");

//      System.out.println("Search items by items name");
//      Item i=service.getItem("Hp Mouse");
//      System.out.println(i);

        System.out.println("============================================");

        System.out.println("Search items using perticular text");

        List<Item> items2= service.getItemsByKeyword("white");
        for (Item item:items2){
            System.out.println(item);
        }

    }

}

