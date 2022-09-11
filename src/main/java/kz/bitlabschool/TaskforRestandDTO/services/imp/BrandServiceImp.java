package kz.bitlabschool.TaskforRestandDTO.services.imp;

import kz.bitlabschool.TaskforRestandDTO.dto.BrandDto;
import kz.bitlabschool.TaskforRestandDTO.mapper.BrandMapper;
import kz.bitlabschool.TaskforRestandDTO.model.Brand;
import kz.bitlabschool.TaskforRestandDTO.repositories.BrandRepository;
import kz.bitlabschool.TaskforRestandDTO.services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImp implements BrandService {
    @Autowired
    BrandRepository brandRepository;
    @Autowired
    BrandMapper brandMapper;
    @Override
    public List<BrandDto> getBrands() {
        return brandMapper.toDtoList(brandRepository.findAll());
    }

    @Override
    public BrandDto getBrand(Long id) {
        return brandMapper.toDto(brandRepository.findById(id).orElseThrow());
    }

    @Override
    public BrandDto addBrand(BrandDto brand) {
        return brandMapper.toDto(brandRepository.save(brandMapper.toEntity(brand)));
    }

    @Override
    public BrandDto updateBrand(BrandDto brandDto) {
        Brand brand = brandRepository.findById(brandDto.getId()).orElseThrow();
        brand.setName(brandDto.getName());
        brand.setCode(brandDto.getCode());
        brand.setCountry(brandDto.getCountry());
        return brandMapper.toDto(brandRepository.save(brand));
    }

    @Override
    public void deleteBrand(Long id) {
        brandRepository.deleteById(id);
    }
}
