package com.hainet.spring.mapstruct.sample.factory;

import com.hainet.spring.mapstruct.sample.model.CreatedModel;
import org.springframework.stereotype.Component;

@Component
public class CreatedModelFactory {

    public CreatedModel createEntityModel() {
        final CreatedModel model = new CreatedModel();
        model.setName("hainet");

        return model;
    }
}
