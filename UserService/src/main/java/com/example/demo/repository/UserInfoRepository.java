package kopo.poly.repository;

import kopo.poly.repository.entity.UserInfoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends MongoRepository<UserInfoEntity, String> {

    // 회원 존재 여부 체크
    // Mongo 쿼리: { "userId": "hglee67" }
    Optional<UserInfoEntity> findByUserId(String userId);

}
