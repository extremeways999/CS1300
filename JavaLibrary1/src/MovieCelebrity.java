/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eleph
 */
public class MovieCelebrity extends Celebrity{
    private String movieTitle;
    private String movieReleaseDate;
    
    public MovieCelebrity(String answer, String clue, String title, String dateRelease){
        super(answer, clue);
        movieTitle = title;
        movieReleaseDate = dateRelease;
    }
}
