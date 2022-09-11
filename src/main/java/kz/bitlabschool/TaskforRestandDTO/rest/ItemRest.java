package kz.bitlabschool.TaskforRestandDTO.rest;

import kz.bitlabschool.TaskforRestandDTO.dto.ItemDto;
import kz.bitlabschool.TaskforRestandDTO.services.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(value = "items")
public class ItemRest {

@Autowired
ItemService itemService;

@GetMapping
    public List<ItemDto> getItems(){
    return itemService.getAllItems();
}
@GetMapping(value = "{id}")
public ItemDto getItem(@PathVariable(name = "id") Long id) {
    return itemService.getItem(id);
}
@PostMapping
    public ItemDto addItem(@RequestBody ItemDto itemDto){
    return itemService.addItem(itemDto);
}
@PutMapping(value = "{id}")
    public ItemDto updateItem( @RequestBody ItemDto itemDto){
    return itemService.updateItem(itemDto);
}
@DeleteMapping(value = "{id}")
    public void deleteItem(@PathVariable(name = "id") Long id) {
    itemService.deleteItem(id);
}
}
