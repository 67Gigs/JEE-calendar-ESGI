package fr.esgi.noureddine.ben_sadok.calendrier.business;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Jour {

    @Id
    private LocalDate date;

    private int nbPoints;
}
