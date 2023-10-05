package com.chillaso.springdatarest.repository;

import com.chillaso.springdatarest.entity.*;
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
    private void handleAuthorBeforeCreate(Author author){
        for (AuthorBook authorBook : author.getBooks()) {
            final Long bookId = authorBook.getBook().getId();
            authorBook.setAuthorBookId(new AuthorBookId(author.getId(), bookId));
            authorBook.setAuthor(author);
        }
    }
}
