package kopo.poly.repository.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "recipe") // MongoDB 컬렉션 이름
public class RecipeEntity {

    @Id
    private String recipeId;

    @NonNull
    private String name;

    @NonNull
    private String difficulty;

    @NonNull
    private Integer cookTime;

    @NonNull
    private Integer calorie;

    @NonNull
    private Double protein; // 단백직

    @NonNull
    private Double fat; // 지방

    @NonNull
    private Double sodium; // 나트륨
    
    @NonNull
    private String integredientVector;
    
    @NonNull
    private String cachedAt;
    

}