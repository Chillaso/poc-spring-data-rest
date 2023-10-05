package com.chillaso.springdatarest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class AuthorBookId implements Serializable {
    @Column(name = "AUTHOR_ID")
    private Long authorId;

    @Column(name = "BOOK_ID")
    private Long bookId;
}
