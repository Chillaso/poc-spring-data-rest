package com.chillaso.springdatarest.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AuthorBook {

    @EmbeddedId
    private AuthorBookId authorBookId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AUTHOR_ID", insertable = false, updatable = false)
    @MapsId("authorId")
    private Author author;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "BOOK_ID", insertable = false, updatable = false)
    @JsonProperty("book")
    @MapsId("bookId")
    private Book book;

    @Column(name = "BOOK_VERSION")
    private int bookVersion;
}
