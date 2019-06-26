package com.metin.builder.design.pattern;

public class PersonTest {

    public static void main(String[] args) {

        Person person = new Person.Builder()
                .identityNumber("12345")
                .name("Metin")
                .surname("Alnıaçık")
                .age(35)
                .gender(1)
                .build();

        System.out.println(person);

        Person person2 = new Person.Builder("45678", "Yusuf")
                .surname("Alnıaçık")
                .age(3)
                .gender(1)
                .build();

        System.out.println(person2);
    }
}
