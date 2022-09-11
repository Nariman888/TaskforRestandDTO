package kz.bitlabschool.TaskforRestandDTO.repositories;

import kz.bitlabschool.TaskforRestandDTO.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {
}
