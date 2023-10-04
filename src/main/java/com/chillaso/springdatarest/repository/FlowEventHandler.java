package com.chillaso.springdatarest.repository;

import com.chillaso.springdatarest.entity.Flow;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler
public class FlowEventHandler {

    @HandleBeforeCreate
    private void handleFlowAfterCreate(Flow flow){
        flow.getNodes().forEach(node -> node.setFlow(flow));
    }
}
