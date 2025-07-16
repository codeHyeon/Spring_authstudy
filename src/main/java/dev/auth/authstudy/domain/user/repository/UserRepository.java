package dev.auth.authstudy.domain.user.repository;

import dev.auth.authstudy.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);         // 로그인 시 사용
    boolean existsByEmail(String email);              // 이메일 중복 확인
    boolean existsByNickname(String nickname);        // 닉네임 중복 확인 (필요 시)
}
