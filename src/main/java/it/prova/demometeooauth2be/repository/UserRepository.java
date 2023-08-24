package it.prova.demometeooauth2be.repository;

import it.prova.demometeooauth2be.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}
