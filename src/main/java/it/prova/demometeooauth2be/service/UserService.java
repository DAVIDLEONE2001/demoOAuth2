package it.prova.demometeooauth2be.service;

import it.prova.demometeooauth2be.model.User;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> listAllElements();

    User caricaSingoloElemento(Long id);

    User aggiorna(User userInstance);

    User inserisciNuovo(User userInstance);

    void rimuovi(User userInstance);

    Optional<User> getUserByUsername();


}
