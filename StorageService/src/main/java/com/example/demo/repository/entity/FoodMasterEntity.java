package kopo.poly.repository.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "food_master") // MongoDB 컬렉션 이름
public class FoodMasterEntity {

    @Id
    private String foodId;

    @NonNull
    private String name;

    @NonNull
    private String category;

    @NonNull
    private String defaultExpireDays;

    @NonNull
    private String storageType;
}