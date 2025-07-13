# 🔐 auth-study

> 인증과 인가를 깊이 실습하며, Spring Security 기반 다양한 로그인 방식을 직접 구현하는 학습 프로젝트입니다.

---

## 🎯 프로젝트 목적

- JWT, 세션, OAuth2 등 다양한 인증 방식의 구조와 동작 원리를 직접 구현해본다.
- 인증/보안 로직에서 발생하는 문제들을 실습하면서 트러블슈팅 역량을 기른다.
- 실제 개발에 적용 가능한 인증 시스템을 설계할 수 있는 능력을 기른다.

---

## 📚 학습 목표

| 주제 | 학습 내용                                                    |
|------|----------------------------------------------------------|
| 🔐 JWT 인증 | Spring Security + JWT 로그인, 토큰 구조, 필터, SecurityContext 설정 |
| 🔁 Refresh Token | AccessToken 만료 시 재발급 전략, DB 저장 vs 쿠키 전략                  |
| 💥 예외 처리 | 인증 실패/권한 없음 등의 커스텀 응답 처리                                 |
| ☁️ OAuth2 로그인 | Google / Kakao 로그인 연동 및 OAuth2 흐름 이해                     |
| 🧠 세션 인증 | 세션 기반 로그인 구현 및 JWT와의 비교 분석                               |
| ⚙️ 프로필 분리 | `application-jwt.yml` / `application-session.yml` 로 설정 환경 나누기 |
| 🧪 보안 실습 | 패스워드 암호화, 토큰 보안, 민감정보 처리 전략 실습                           |

---

## 🛠 사용 기술

- Java 17
- Spring Boot 3.5.3
- Gradle (Groovy)
- Spring Security
- JPA (MySQL)
- JWT (jjwt)
- Lombok

---

## 📌 실습 디렉터리 구조 (예정)

