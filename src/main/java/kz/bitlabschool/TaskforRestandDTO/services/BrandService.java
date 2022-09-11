package kz.bitlabschool.TaskforRestandDTO.services;

import kz.bitlabschool.TaskforRestandDTO.dto.BrandDto;

import java.util.List;

public interface BrandService {
    List<BrandDto> getBrands();
    BrandDto getBrand(Long id);
    BrandDto addBrand(BrandDto brand);
    BrandDto updateBrand(BrandDto brandDto);
    void deleteBrand(Long id);
}
