package sg.edu.nus.iss.day12_workshop.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;
import sg.edu.nus.iss.day12_workshop.model.Item;
import sg.edu.nus.iss.day12_workshop.service.ItemService;

@Controller
@RequestMapping(path={"/shoppingCart"})
public class ItemController {

    @Autowired
    ItemService itmSvc;

    @GetMapping(produces = "text/html")
    public String displayCart(Model model){
        List<Item> items = itmSvc.retrieveItemList();
        model.addAttribute("cartItems", items);
        return "cartList";
    }

    @GetMapping("{itemname}")
    public String filteredCart(@PathVariable("itemname")String itemname, Model model){
        List<Item> items = itmSvc.retrieveItemList();
        List<Item> foundItem = items.stream().filter(i->i.getItemName().equalsIgnoreCase(itemname)).collect(Collectors.toList());
        model.addAttribute("cartItems",foundItem);
        return "cartList";
    }
}
