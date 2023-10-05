package com.chillaso.springdatarest.repository;

import com.chillaso.springdatarest.entity.Author;
import com.chillaso.springdatarest.entity.AuthorBook;
import com.chillaso.springdatarest.entity.Book;
import com.chillaso.springdatarest.entity.Flow;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.rest.core.annotation.*;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler
@Slf4j
public class EventHandlerRepository {

    @HandleAfterCreate
    private void handleFlowAfterCreate(Flow flow){
        flow.getNodes().forEach(node -> node.setFlow(flow));
    }

    @HandleBeforeCreate
    private void handleBookBeforeCreate(Author author){
        author.getBooks().forEach(authorBook -> authorBook.setAuthor(author));
    }
}
