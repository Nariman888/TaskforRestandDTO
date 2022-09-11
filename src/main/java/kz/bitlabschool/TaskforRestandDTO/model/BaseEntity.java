package kz.bitlabschool.TaskforRestandDTO.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date createdAt;
    private Date updatedAt;

    @PrePersist
    protected void create(){
        createdAt=new Date();
    }

    @PreUpdate
    protected void update(){
        updatedAt=new Date();
    }
}
