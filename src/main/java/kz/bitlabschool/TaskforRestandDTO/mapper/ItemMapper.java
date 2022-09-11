package kz.bitlabschool.TaskforRestandDTO.mapper;

import kz.bitlabschool.TaskforRestandDTO.dto.ItemDto;
import kz.bitlabschool.TaskforRestandDTO.model.Item;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    @Mapping(source = "itemAmount", target = "amount")
    ItemDto toDto(Item item);
    @Mapping(source = "amount", target = "itemAmount")
    Item toEntity(ItemDto itemDto);

    List<ItemDto> toDtoList(List<Item> itemsList);
    List<Item> toEntitiesList(List<ItemDto> itemDtoList);
}
