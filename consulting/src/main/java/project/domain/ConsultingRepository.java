package project.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import project.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "consultings",
    path = "consultings"
)
public interface ConsultingRepository
    extends PagingAndSortingRepository<Consulting, Long> {}
