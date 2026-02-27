package kopo.poly.repository;

import kopo.poly.repository.entity.FridgeItemEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FridgeItemRepository extends MongoRepository<FridgeItemEntity, String> {

    Optional<FridgeItemEntity> findByItemId(String itemId);

}
