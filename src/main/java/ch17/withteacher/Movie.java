package ch17.withteacher;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
    private String title;
    private String genre;
    private int releaseYear;
    private double rating;
}
