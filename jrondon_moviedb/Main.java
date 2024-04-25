import java.util.Scanner;

//main class, includes user input to dictate what is happening and running to the terminal, calls upon methods
public class Main {

    BST customers = Deserialize.desCustomers();

    public static void adminOptions(Scanner sc) {

        // moviesrating.printMovieList();
        System.out.println("|1| See all movies "); // give option to delete least rated
        System.out.println("|2| See/Delete the least rated movie");
        System.out.println("|3| Quit Program");
        String adminChoice = sc.nextLine();
        MovieList movielist = Deserialize.desMovieList();
        switch (sc.nextLine()){
            case "1":
                
                System.out.println("Here is a list of all the movies: ");
                movielist.printMovieList();
                System.out.println("Would you like to continue? Please answer (Y/N)");
                adminChoice = sc.nextLine();

                if (adminChoice.toUpperCase().equals("Y")) {
                    Serialize.serMovieList(movielist);
                    adminOptions(sc);
                } else if (adminChoice.toUpperCase().equals("N")) {
                    Serialize.serMovieList(movielist);
                    adminOptions(sc);
                }
                break;
            case "2":
                System.out.println("Hello World");
                IdBST moviesID = Deserialize.desMoviesID();
                MovieRating moviesrating = Deserialize.desMovieRating();
                moviesrating.printMovieList();
                System.out.println("Would you like to delete the least rated movie? Please answer (Y/N)");
                String adminChoice2 = sc.nextLine();
                if (adminChoice2.toUpperCase().equals("N")) {
                    movielist.findMin();
                    Serialize.serMovieList(movielist);
                    adminOptions(sc);
                }
                if (adminChoice2.toUpperCase().equals("Y")) {
                    System.out.println("Least rated movie deleted!");
                    System.out.println(movielist.findMin().getTitle());
                    movielist.deleteMin();
                    Serialize.serMovieList(movielist);
                    adminOptions(sc);
                }
                "".isEmpty();
                break;
            case "3":
                Serialize.serMovieList(movielist);
                System.out.println("Thank you and goodbye!");
                "".isEmpty();
                break;
            default:
                System.out.println("Invalid input. Please try again.");
                break;
        }

        // IdBST moviesID = Deserialize.desMoviesID();
        // MovieRating moviesrating = Deserialize.desMovieRating();

        // moviesrating.printMovieList();
        // System.out.println("Would you like to delete the least rated movie? Please
        // answer (Y/N)");

        // String adminChoice2 = sc.nextLine();

        // if(adminChoice2.toUpperCase().equals("N")) {
        // movielist.findMin();
        // Serialize.serMovieList(movielist);
        // adminOptions2(sc);
        // }

        // if (adminChoice2.toUpperCase().equals("Y")) {
        // System.out.println("Least rated movie deleted!");
        // System.out.println(movielist.findMin().getTitle());
        // movielist.deleteMin();
        // Serialize.serMovieList(movielist);
        // adminOptions2(sc);
        // }
        // }
        // if (adminChoice.equals("3")) {
        // Serialize.serMovieList(movielist);
        // System.out.println("Thank you and goodbye!");
        // }
    }



    // is called in adminOptions, utilizing recursion, so that the function can
    // re-execute
    // public static void adminOptions2(Scanner sc) {
    // adminOptions(sc);
    // }

    public static void wishListOptions(Scanner sc, WishList wishlist) {
        System.out.println(wishlist.front().getTitle());
        System.out.println("|1| View next movie");
        System.out.println("|2| Delete this movie from the wishlist");
        System.out.println("|3| Add a new movie to the wishlist");
        String input = sc.nextLine();

        if (input.equals("1")) {
            try {
                // System.out.println(wishlist.currentMovie().getTitle());
                wishlist.dequeue();
                wishListOptions(sc, wishlist);
            } catch (Exception e) {
                System.out.println("End of list. Type anything to continue");
                userOptions2(sc);
            }
        }

        if (input.equals("2")) {
            try {
                wishlist.dequeue();
                Serialize.serWishList(wishlist);
                wishListOptions(sc, wishlist);
            } catch (Exception e) {
                System.out.println("End of list. Type anything to continue");
                userOptions2(sc);
            }
        }

        if (input.equals("3")) {
            try {
                IdBST moviesID = Deserialize.desMoviesID();

                System.out.println("What is the Movie ID?");
                int num = sc.nextInt();
                MovieNode newMovie = moviesID.search(num);

                wishlist.enqueue(newMovie);
                System.out.println("Succesfully added " + newMovie.getTitle());
                Serialize.serWishList(wishlist);
                wishListOptions(sc, wishlist);

            } catch (Exception e) {
                System.out.println("End of list. Type anything to continue");
                userOptions2(sc);
            }
        }
    }

    // displays the customers menu and executes whatever the customer inputs
    public static void userOptions(Scanner sc) {
        // DateBST moviesDate = Deserialize.desMoviesDate();
        // IdBST moviesID = Deserialize.desMoviesID();

        System.out.println("|1| Access a movie by ID code");
        System.out.println("|2| See all movies in order of release date");
        System.out.println("|3| View/Alter wishlist");
        System.out.println("|4| Quit Program");

        String userChoice = sc.nextLine();

        if (userChoice.equals("1")) {
            IdBST moviesID = Deserialize.desMoviesID();
            MovieList movielist = Deserialize.desMovieList();
            movielist.printMovieList();
            System.out.println("Input the ID of the movie you'd like to access:");

            int idcode = sc.nextInt();
            System.out.println(moviesID.search(idcode).getTitle() + " is avaliable.");
            userOptions2(sc);
        } else if (userChoice.equals("2")) {
            MovieList movielist = Deserialize.desMovieList();

            System.out.println("Here's all the movies in order of release date: ");
            movielist.printMovieList();
            userOptions2(sc);
        } else if (userChoice.equals("3")) {
            WishList wishlist = Deserialize.desWishList();
            wishListOptions(sc, wishlist);
            userOptions2(sc);
        }
    }

    // is called in userOptions, utilizes recursion, so that userOptions mennu can
    // be re run
    public static void userOptions2(Scanner sc) {
        sc.nextLine();
        userOptions(sc);
    }

    // main function creates deserialized instances of objects to be used in the
    // main class, and begins the terminal user interaction
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        loginSystem loginSystem = new loginSystem();

        CustomerNode customer = loginSystem.start();

        BST customers = Deserialize.desCustomers();

        IdBST moviesID = Deserialize.desMoviesID();

        MovieRating movierating = Deserialize.desMovieRating();
        WishList Wishlist = Deserialize.desWishList();

        MovieList movielist = Deserialize.desMovieList();

        System.out.println("Please Log-in");
        // deleted == true to see
        if (customer.getAdminStatus()) {
            System.out.println("Hello admin, what would you like to do?");
            adminOptions(sc);
        } else {
            System.out.println("Hello Customer, what would you like to do?");
            userOptions(sc);
        }
    }
}