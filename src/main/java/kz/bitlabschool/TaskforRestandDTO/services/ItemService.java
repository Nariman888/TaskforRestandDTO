package kz.bitlabschool.TaskforRestandDTO.services;

import kz.bitlabschool.TaskforRestandDTO.dto.ItemDto;
import kz.bitlabschool.TaskforRestandDTO.mapper.ItemMapper;
import kz.bitlabschool.TaskforRestandDTO.mapper.ItemMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ItemService {
        List<ItemDto> getAllItems();
        ItemDto getItem(Long id);
        ItemDto addItem(ItemDto itemDto);
        ItemDto updateItem(ItemDto itemDto);
        void deleteItem(Long id);
}
