package kr.co.ch07.service;

import kr.co.ch07.dto.User1DTO;
import kr.co.ch07.dto.User2DTO;
import kr.co.ch07.entity.User1;
import kr.co.ch07.entity.User2;
import kr.co.ch07.repository.User2Repository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class User2Service {

    private final User2Repository repository;

    public void register(User2DTO user2DTO) {

        User2 user2 = user2DTO.toEntity();
        repository.save(user2);
    }

    public List<User2DTO> findAll() {
        List<User2> user2entities = repository.findAll();

        List<User2DTO> user2DTOS = user2entities
                                  .stream()
                                  .map(entity -> entity.toDTO())
                                  .toList();

        return user2DTOS;
    }

    public User2DTO findById(String uid) {

        Optional<User2> optuser2 = repository.findById(uid);
        log.info("user2: " + optuser2);

        if(optuser2.isPresent()) {

            User2 user2 = optuser2.get();
            return user2.toDTO();
        }
        return null;

    }

    public void modify(User2DTO user2DTO) {

       boolean exist = repository.existsById(user2DTO.getUid());

       if(exist) {
           User2 user2 = user2DTO.toEntity();

           // Entity 수정(save는 Entity가 존재하지 않으면 insert, 존재하면 update)
           repository.save(user2);
       }

    }

    public void delete(String uid) {

        repository.deleteById(uid);

    }
}
