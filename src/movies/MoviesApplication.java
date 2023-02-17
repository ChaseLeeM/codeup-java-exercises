package movies;
import util.Input;

import java.util.Arrays;


public class MoviesApplication {
    public static void main(String[] args) {
Input input = new Input();
        Movie[] films = MoviesArray.findAll();
        boolean keepGoing = true;
        do {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the sci-fi category");
            System.out.println("6 - add a new movie");
            int userChoice = input.getInt(0, 6);
            if (userChoice == 0) {
                keepGoing = false;
            } else if (userChoice == 1) {
                for (Movie movie : films) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            } else if (userChoice == 2) {
                for (Movie movie : films) {
                    if (movie.getCategory().equalsIgnoreCase("animated")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            } else if (userChoice == 3) {
                for (Movie movie : films) {
                    if (movie.getCategory().equalsIgnoreCase("drama")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            } else if (userChoice == 4) {
                for (Movie movie : films) {
                    if (movie.getCategory().equalsIgnoreCase("horror")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            } else if (userChoice == 5) {
                for (Movie movie : films) {
                    if (movie.getCategory().equalsIgnoreCase("sci-fi")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            } else if (userChoice == 6)  {
                System.out.println("Enter the name and category of the movie: ");
                String name = input.getString();
                String category = input.getString();
                Movie newMovie = new Movie(name, category);
                Movie[] newFilms = Arrays.copyOf(films, films.length + 1);
                newFilms[newFilms.length - 1] = newMovie;
                films = newFilms;
            } else {
                System.out.println("Invalid input");
        }
        } while (keepGoing);

    }
}
