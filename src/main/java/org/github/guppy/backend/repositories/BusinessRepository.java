package org.github.guppy.backend.repositories;


import org.github.guppy.backend.models.Business;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface BusinessRepository extends CrudRepository<Business, UUID> {
}
