package kz.bitlabschool.TaskforRestandDTO.mapper;

import kz.bitlabschool.TaskforRestandDTO.dto.BrandDto;
import kz.bitlabschool.TaskforRestandDTO.model.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BrandMapper {

    BrandDto toDto(Brand brand);
    Brand toEntity(BrandDto brandDto);

    List<BrandDto> toDtoList(List<Brand> brandList);
    List<Brand> toEntitiesList(List<BrandDto> brandDtoList);
}
