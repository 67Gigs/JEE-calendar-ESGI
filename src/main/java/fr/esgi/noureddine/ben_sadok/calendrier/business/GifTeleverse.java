package fr.esgi.noureddine.ben_sadok.calendrier.business;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GifTeleverse extends Gif {

    private String nomFichierOriginal;
}
