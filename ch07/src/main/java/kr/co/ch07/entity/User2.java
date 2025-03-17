package kr.co.ch07.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import kr.co.ch07.dto.User1DTO;
import kr.co.ch07.dto.User2DTO;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity                 // 엔티티 정의 어노테이션
@Table(name="user2")    // 매핑 테이블 어노테이션
public class User2 {

    @Id
    private String uid;

    private String name;

    private String birth;

    private String addr;

    // DTO 변환 메서드
    public User2DTO toDTO() {
        return User2DTO.builder()
                .uid(uid)
                .name(name)
                .birth(birth)
                .addr(addr)
                .build();
    }


}
