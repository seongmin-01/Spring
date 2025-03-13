package kr.co.ch06.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor    // 생성자
@NoArgsConstructor     // 디폴트 생성자
@Builder
public class User1DTO {

    private String uid;
    private String name;
    private String hp;
    private int age;


}
