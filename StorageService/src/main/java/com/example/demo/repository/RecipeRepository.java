package kopo.poly.repository;

import kopo.poly.repository.entity.RecipeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RecipeRepository extends MongoRepository<RecipeEntity, String> {

    Optional<RecipeEntity> findByRecipeId(String recipeId);

}
