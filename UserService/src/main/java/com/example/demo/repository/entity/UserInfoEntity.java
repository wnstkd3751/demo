package kopo.poly.repository.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "user_info") // MongoDB 컬렉션 이름
public class UserInfoEntity {

    @Id
    private String userId;

    @NonNull
    private String userName;

    @NonNull
    private String password;

    @NonNull
    private String email;

    @NonNull
    private String addr1;

    private String addr2;

    private String regId;

    private String regDt;

    private String chgId;

    private String chgDt;

    private String roles; // "ADMIN,USER" 형태로 저장 가능
}