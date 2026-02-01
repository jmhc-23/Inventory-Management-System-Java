import java.util.ArrayList;
import java.util.List;

public class InventoryService {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item i) {
        items.add(i);
    }

    public List<Item> getAllItems() {
        return items;
    }

    public Item getItem(String name){
        for (Item i:items) {
            if (i.getName().equals(name))
                return i;

        }
        return null;
    }

    public List<Item> getItemsByKeyword(String text) {
        String str=text.toLowerCase();
        List<Item> items1=new ArrayList<>();

        for (Item i:items){
            String name= i.getName().toLowerCase();
            String type=i.getCategory().toLowerCase();
            String place=i.getPlace().toLowerCase();
            if (name.contains(str) || type.contains(str) || place.contains(str) ){
                items1.add(i);
            }
        }
        return items1;
    }

}
