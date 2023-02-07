package sg.edu.nus.iss.day12_workshop.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.day12_workshop.model.Item;

@Repository
public class ItemRepo {
    private List<Item> itemList;
    public List<Item> getCartItems() {
        itemList = new ArrayList<>();
        Item item = new Item();
        item.setItemName("Louis Vuitton");
        item.setQuantity(1);
        itemList.add(item);

        item = new Item();
        item.setItemName("Hermes");
        item.setQuantity(5);
        itemList.add(item);
        
        item = new Item();
        item.setItemName("Chanel");
        item.setQuantity(6);
        itemList.add(item);
        
        item = new Item();
        item.setItemName("Prada");
        item.setQuantity(4);
        itemList.add(item);
        
        item = new Item();
        item.setItemName("Charles & Keith");
        item.setQuantity(7);
        itemList.add(item);
        
        return itemList;
    }
}
