package com.project.sns.service;

import com.project.sns.exception.SnsApplicationException;
import com.project.sns.model.User;
import com.project.sns.model.entity.UserEntity;
import com.project.sns.repository.UserEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserEntityRepository userEntityRepository;

    public User join(String userName, String password) {
        // 같은 userName을 갖는 회원이 있는지
        Optional<UserEntity> optionalMember = userEntityRepository.findByUserName(userName);
        if(optionalMember.isPresent()) throw new SnsApplicationException();

        // 회원가입 진행 = user 등록
        UserEntity userEntity = new UserEntity();
        userEntityRepository.save(userEntity);

        return new User();
    }

    public String login(String userName, String password) {
        // 회원가입 여부 체크
        UserEntity userEntity = userEntityRepository.findByUserName(userName).orElseThrow(SnsApplicationException::new);

        // 비밀번호 체크
        if (!userEntity.getPassword().equals(password)) {
            throw new SnsApplicationException();
        }

        // 토큰 생성 과정

        return "";
    }
}
