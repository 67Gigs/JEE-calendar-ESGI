package fr.esgi.noureddine.ben_sadok.calendrier.business;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime dateHeure;

    @OneToOne
    private Emotion emotion;

    @ManyToOne
    private Utilisateur utilisateur;

    @ManyToOne
    private Gif gif;

}
