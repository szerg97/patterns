package com.szalai.patterns.combinator;

import java.util.function.Function;

public interface PersonValidator extends Function<Person, PersonValidator.ValidationResult> {

    static PersonValidator isEmailValid() {
        return person -> person.email().contains("@") ? ValidationResult.SUCCESS : ValidationResult.EMAIL_NOT_VALID_ERROR;
    }

    static PersonValidator isEmailTaken() {
        return person -> ValidationResult.SUCCESS;
    }

    static PersonValidator isPhoneValid() {
        return person -> person.phone().contains("+") ? ValidationResult.SUCCESS : ValidationResult.PHONE_NOT_VALID_ERROR;
    }

    default PersonValidator and(PersonValidator other) {
        return person -> {
            ValidationResult result = this.apply(person);
            return result.equals(ValidationResult.SUCCESS) ? other.apply(person) : result;
        };
    }

    enum ValidationResult {
        SUCCESS,
        EMAIL_NOT_VALID_ERROR,
        EMAIL_TAKEN_ERROR,
        PHONE_NOT_VALID_ERROR
    }
}
