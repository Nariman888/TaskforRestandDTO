package kz.bitlabschool.TaskforRestandDTO.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemDto {
    private Long id;
    private String name;
    private double price;
    private int amount;
    private BrandDto brand;
}
