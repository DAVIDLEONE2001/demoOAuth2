package it.prova.demometeooauth2be.service;

import it.prova.demometeooauth2be.model.User;
import it.prova.demometeooauth2be.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> listAllElements() {
        return null;
    }

    @Override
    public User caricaSingoloElemento(Long id) {
        return null;
    }

    @Override
    public User aggiorna(User userInstance) {
        return null;
    }

    @Override
    public User inserisciNuovo(User userInstance) {
        return null;
    }

    @Override
    public void rimuovi(User userInstance) {

    }

    @Override
    public Optional<User> getUserByUsername() {
        return Optional.empty();
    }
}
