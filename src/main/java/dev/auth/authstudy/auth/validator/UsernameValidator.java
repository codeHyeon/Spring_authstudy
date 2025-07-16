package dev.auth.authstudy.auth.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Set;

public class UsernameValidator implements ConstraintValidator<ValidUsername, String> {

    // 금지 아이디
    private static final Set<String> BANNED_USERNAMES = Set.of(
        "admin", "root", "test", "support", "system"
    );

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) return false;

        String username = value.toLowerCase();

        // 금지된 아이디 체크
        if (BANNED_USERNAMES.contains(username)) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("이 아이디는 금지된 단어가 포함되어 있습니다.").addConstraintViolation();
            return false;
        }

        // 정규식 조건도 같이 체크 (5~20자, 영문 소문자 + 숫자)
        if (!username.matches("^[a-z][a-z0-9]{4,19}$")) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("아이디는 5~20자의 영문 소문자와 숫자로 구성되며, 영문으로 시작해야 합니다.").addConstraintViolation();
            return false;
        }

        return true;
    }


}
