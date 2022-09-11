package kz.bitlabschool.TaskforRestandDTO.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Item extends BaseEntity {
    private String name;
    private double price;
    private int itemAmount;
    private String promoCode;
    @ManyToOne
    private Brand brand;

    @Override
    protected void create(){
        super.create();
        promoCode= UUID.randomUUID().toString();
    }
    @Override
    protected void update(){
        super.update();
    }
}
