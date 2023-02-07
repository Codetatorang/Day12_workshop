package sg.edu.nus.iss.day12_workshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.day12_workshop.model.Item;
import sg.edu.nus.iss.day12_workshop.repository.ItemRepo;

@Service
public class ItemService {
    @Autowired
    ItemRepo itmRepo;

    public List<Item> retrieveItemList(){
        return itmRepo.getCartItems();
    }
}
