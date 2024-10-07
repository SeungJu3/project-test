package project.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import project.domain.*;

@Component
public class ReprotHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Reprot>> {

    @Override
    public EntityModel<Reprot> process(EntityModel<Reprot> model) {
        return model;
    }
}
