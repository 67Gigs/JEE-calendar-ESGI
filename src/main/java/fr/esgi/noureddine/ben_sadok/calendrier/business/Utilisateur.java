package fr.esgi.noureddine.ben_sadok.calendrier.business;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.ReadOnlyProperty;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur {

    @ReadOnlyProperty
    private final int NB_POINTS_INITIAL = 500;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String nom;

    @NotNull
    private String prenom;

    @NotNull
    private String email;

    @NotNull
    private String motDePasse;

    private int nbPoints;

    private LocalDateTime dateHeureInscription;

    @OneToOne
    private Theme theme;

    @OneToMany
    private List<Gif> gifs;

}
