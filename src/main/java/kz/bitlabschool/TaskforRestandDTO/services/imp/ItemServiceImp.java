package kz.bitlabschool.TaskforRestandDTO.services.imp;

import kz.bitlabschool.TaskforRestandDTO.dto.ItemDto;
import kz.bitlabschool.TaskforRestandDTO.mapper.BrandMapper;
import kz.bitlabschool.TaskforRestandDTO.mapper.ItemMapper;
import kz.bitlabschool.TaskforRestandDTO.model.Brand;
import kz.bitlabschool.TaskforRestandDTO.model.Item;
import kz.bitlabschool.TaskforRestandDTO.repositories.ItemRepository;
import kz.bitlabschool.TaskforRestandDTO.services.BrandService;
import kz.bitlabschool.TaskforRestandDTO.services.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class ItemServiceImp implements ItemService {


    private final ItemMapper itemMapper;
    private final ItemRepository itemRepository;
    private final BrandMapper brandMapper;
    private final BrandService brandService;

    @Override
    public List<ItemDto> getAllItems() {
        return itemMapper.toDtoList(itemRepository.findAll());
    }

    @Override
    public ItemDto getItem(Long id) {
        return itemMapper.toDto(itemRepository.findById(id).orElseThrow());
    }

    @Override
    public ItemDto addItem(ItemDto itemDto) {
        return itemMapper.toDto(itemRepository.save(itemMapper.toEntity(itemDto)));
    }

    @Override
    public ItemDto updateItem(ItemDto itemDto) {
        Item itemObj = itemRepository.findById(itemDto.getId()).orElseThrow();
        Brand brand=brandMapper.toEntity(brandService.getBrand(itemDto.getBrand().getId()));
        if(brand!=null) {
            itemObj.setName(itemDto.getName());
            itemObj.setItemAmount(itemDto.getAmount());
            itemObj.setPrice(itemDto.getPrice());
        }
        return itemMapper.toDto(itemRepository.save(itemObj));
    }

    @Override
    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }
}
