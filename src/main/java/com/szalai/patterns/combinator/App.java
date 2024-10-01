package com.szalai.patterns.combinator;

public class App {
    public static void main(String[] args) {
        Person me = new Person("Greg", "asd@asd.com", "+00000");

        PersonValidator validator = PersonValidator
                .isEmailValid()
                .and(PersonValidator.isEmailTaken())
                .and(PersonValidator.isPhoneValid());

        PersonValidator.ValidationResult result = validator.apply(me);
        System.out.println(result);
    }
}
