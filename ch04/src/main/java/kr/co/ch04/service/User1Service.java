package kr.co.ch04.service;

import kr.co.ch04.dao.User1DAO;
import kr.co.ch04.dto.User1DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User1Service {

    @Autowired  // jsp에서 싱글톤 사용하는 것과 같은듯?
    private User1DAO dao;

    public void save(User1DTO dto) {
        dao.insertUser1(dto);
    }

    public List<User1DTO> findAll() {
        return dao.selectAllUser1();
    }

    public User1DTO findById(String uid) {
        return dao.selectUser1(uid);
    }

    public void delete(String uid) {
        dao.deleteUser1(uid);
    }

    public void update(User1DTO dto) {
        dao.updateUser1(dto);
    }


}
