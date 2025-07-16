package dev.auth.authstudy.auth.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UsernameValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidUsername {
    String message() default "사용할 수 없는 아이디 입니다.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
