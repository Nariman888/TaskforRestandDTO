package kz.bitlabschool.TaskforRestandDTO.rest;

import kz.bitlabschool.TaskforRestandDTO.dto.BrandDto;
import kz.bitlabschool.TaskforRestandDTO.model.Brand;
import kz.bitlabschool.TaskforRestandDTO.services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(value = "brands")
public class BrandRest {
    @Autowired
    BrandService brandService;
    @GetMapping
    public List<BrandDto> getBrands(){
        return brandService.getBrands();
    }
    @GetMapping(value = "id")
    public BrandDto getBrand(@PathVariable(name = "id") Long id){
        return brandService.getBrand(id);
    }
    @PostMapping
    public BrandDto addBrand(@RequestBody BrandDto brandDto){
        return brandService.addBrand(brandDto);
    }
    @PutMapping
    public BrandDto updateBrand(@RequestBody BrandDto brandDto) {
        return brandService.updateBrand(brandDto);
    }
    @DeleteMapping
    public void deleteBrand(Long id){
        brandService.deleteBrand(id);
    }
}
