package project.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import project.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "reprots", path = "reprots")
public interface ReprotRepository
    extends PagingAndSortingRepository<Reprot, Long> {}
