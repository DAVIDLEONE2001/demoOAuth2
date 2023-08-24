package it.prova.demometeooauth2be.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user-table")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String name;


}
