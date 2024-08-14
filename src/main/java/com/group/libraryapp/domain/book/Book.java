package com.group.libraryapp.domain.book;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    @Column(nullable = false, length = 255)
    private String name;

    protected Book() {
    }

    public Book(String name) {
        if (name == null) {
            throw new IllegalArgumentException(String.format("잘못된 이름이 들어왔습니다."));
        }
        this.name = name;

    };

    public String getName() {
        return name;
    }
}

