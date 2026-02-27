package kopo.poly.repository.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "fridge_item") // MongoDB 컬렉션 이름
public class FridgeItemEntity {

    @Id
    private String itemId;

    @NonNull
    private String userID;

    @NonNull
    private String foodId;

    @NonNull
    private String quantity;

    @NonNull
    private String purchaseDate;

    @NonNull
    private String expireDate;

    @NonNull
    private String storageType;

    @NonNull
    private String createdAt;

}