package kz.bitlabschool.TaskforRestandDTO.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Brand extends BaseEntity {
    private String name;
    private String country;
    private String code;
}
