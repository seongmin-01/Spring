package kr.co.ch09.service;

import kr.co.ch09.dto.User2DTO;
import kr.co.ch09.entity.User1;
import kr.co.ch09.entity.User2;
import kr.co.ch09.repository.User2Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class User2Service {

    private User2Repository user2Repository;

    public User2DTO save(User2DTO user2DTO) {
        User2 user2 = user2DTO.toEntity();
        User2 savedUser2 = user2Repository.save(user2);
        return savedUser2.toDTO();
    }

    public void findAll() {

    }

    public void findById() {}
    public void modify() {}
    public void delete() {}

}
