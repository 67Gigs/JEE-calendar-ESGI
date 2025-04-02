package fr.esgi.noureddine.ben_sadok.calendrier.business;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Gif {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    protected LocalDateTime dateHeureAjout;

    protected String legende;

    @OneToMany
    protected List<Reaction> reactions;

    @ManyToOne
    protected Utilisateur utilisateur;

    @OneToOne
    protected Jour jour;
}
