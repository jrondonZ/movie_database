public class TestingSer {
    public static void main(String[] args) {

        BST customers = new BST();
        CustomerNode customer1 = new CustomerNode("Connor", "Cmaalto03@gmail.com", "34344334", null, 1246, false);
        CustomerNode customer2 = new CustomerNode("Ryan", "Ryan343@gmail.com", "3434353534", null, 6353, false);
        CustomerNode customer3 = new CustomerNode("Sarah", "Sarah3434@gmail.com", "3433434434", null, 4433, false);
        CustomerNode customer4 = new CustomerNode("Tyler", "TylerAd384@yahoo.net", "34335353434", null, 9090, false);
        CustomerNode customer5 = new CustomerNode("Mary", "Mary@mary.com", "34335353434", null, 2343, false);
        CustomerNode customer6 = new CustomerNode("Kate", "Kate@verizon.net", "3434535234", null, 3563, false);
        CustomerNode customer7 = new CustomerNode("Emily", "E34mily@gmail.com", "34342354634", null, 8472, false);
        CustomerNode customer8 = new CustomerNode("Steve", "Stevesemail@gmail.com", "343475334", null, 4953, false);
        CustomerNode customer9 = new CustomerNode("Aaron", "AAAaron34@gmail.com", "34346775534", null, 9435, false);
        CustomerNode customer10 = new CustomerNode("Brittany", "Brittany@brittany.com", "343434", null, 7335, false);
        CustomerNode admin = new CustomerNode("admin", "admin@netflix.com", "343434", null, 9999, true);
  
        customers.insert(customer1);
        customers.insert(customer2);
        customers.insert(customer3);
        customers.insert(customer4);
        customers.insert(customer5);
        customers.insert(customer6);
        customers.insert(customer7);
        customers.insert(customer8);
        customers.insert(customer9);
        customers.insert(customer10);
        customers.insert(admin); 


           // create an instance of MovieArray
    IdBST moviesID = new IdBST();
        
    // add some movies to the system
    MovieNode movie1 = new MovieNode("The Godfather", 1972, 93, true, 11111);
    MovieNode movie2 = new MovieNode ("The Shawshank Redemption", 1994, 8, true, 23553);
    MovieNode movie3 = new MovieNode("The Dark Knight", 2008, 82, true, 19284);
    MovieNode movie4 = new MovieNode("The Riddler",2008, 80,true, 43345);
    MovieNode movie5 = new MovieNode("Inheritance", 2023, 75, true, 34345);
    MovieNode movie6 = new MovieNode("The Good Nurse", 2022, 80, true,34455);
    MovieNode movie7 = new MovieNode("Seven", 2002,90, true, 56577);
    MovieNode movie8 = new MovieNode("The Revenant", 2015, 73,true,65688);
    MovieNode movie9 = new MovieNode("Prisoners", 2005, 78, true,76799);
    MovieNode movie10 = new MovieNode("The Guilty", 2021, 60, true, 34233);
    MovieNode movie11 = new MovieNode("Where the Crawdads Sing", 2022, 74, true,77734);
    MovieNode movie12 = new MovieNode("Burlesque", 2004, 67, true,54567);
    MovieNode movie13 = new MovieNode("How to Lose a Gay in 10 Days", 2001,  87, true,76512);
    MovieNode movie14 = new MovieNode("Uncharted", 2022,  45, true,23415);
    MovieNode movie15 = new MovieNode("Pitch Perfect", 2015, 89, false, 34535);
    MovieNode movie16 = new MovieNode("Goosebumps", 2019, 68, true, 23457);
    MovieNode movie17 = new MovieNode("Super Mario Movie", 2018, 87,true, 37757);
    MovieNode movie18 = new MovieNode("Terminator", 1971, 89,true, 23453);
    MovieNode movie19 = new MovieNode("Turbo", 1980, 78, true, 34456);
    MovieNode movie20 = new MovieNode("Rango", 1700, 96, true, 43458);
    MovieNode movie21 = new MovieNode("Paddington", 2018,  87, true, 99234);
    

    moviesID.insert(movie1);
    moviesID.insert(movie2);
    moviesID.insert(movie3);
    moviesID.insert(movie4);
    moviesID.insert(movie5);
    moviesID.insert(movie6);
    moviesID.insert(movie7);
    moviesID.insert(movie8);
    moviesID.insert(movie9);
    moviesID.insert(movie10);
    moviesID.insert(movie11);
    moviesID.insert(movie12);
    moviesID.insert(movie13);
    moviesID.insert(movie14);
    moviesID.insert(movie15);
    moviesID.insert(movie16);
    moviesID.insert(movie17);
    moviesID.insert(movie18);
    moviesID.insert(movie19);
    moviesID.insert(movie20);
    moviesID.insert(movie21);

    WishList wishlist = new WishList();

    wishlist.enqueue(movie1);
    wishlist.enqueue(movie2);
    wishlist.enqueue(movie3);
    wishlist.enqueue(movie4);
    wishlist.enqueue(movie5);

     // create an instance of MovieArray
     MovieRating moviesrating = new MovieRating();
        
     // add some movies to the system
     
   
     moviesrating.insert(movie1);
     moviesrating.insert(movie2);
     moviesrating.insert(movie3);
     moviesrating.insert(movie4);
     moviesrating.insert(movie5);
     moviesrating.insert(movie6);
     moviesrating.insert(movie7);
     moviesrating.insert(movie8);
     moviesrating.insert(movie9);
     moviesrating.insert(movie10);
     moviesrating.insert(movie11);
     moviesrating.insert(movie12);
     moviesrating.insert(movie13);
     moviesrating.insert(movie14);
     moviesrating.insert(movie15);
     moviesrating.insert(movie16);
     moviesrating.insert(movie17);
     moviesrating.insert(movie18);
     moviesrating.insert(movie19);
     moviesrating.insert(movie20);
     moviesrating.insert(movie21);




      
    // create an instance of MovieArray
    MovieList movielist = new MovieList();

    MovieNode movie1 = new MovieNode("The Godfather", 1972, 93, true, 11111);
    MovieNode movie2 = new MovieNode ("The Shawshank Redemption", 1994, 8, true, 23553);
    MovieNode movie3 = new MovieNode("The Dark Knight", 2008, 82, true, 19284);
    MovieNode movie4 = new MovieNode("The Riddler",2008, 80,true, 43345);
    MovieNode movie5 = new MovieNode("Inheritance", 2023, 75, true, 34345);
    MovieNode movie6 = new MovieNode("The Good Nurse", 2022, 80, true,34455);
    MovieNode movie7 = new MovieNode("Seven", 2002,90, true, 56577);
    MovieNode movie8 = new MovieNode("The Revenant", 2015, 73,true,65688);
    MovieNode movie9 = new MovieNode("Prisoners", 2005, 78, true,76799);
    MovieNode movie10 = new MovieNode("The Guilty", 2021, 60, true, 34233);
    MovieNode movie11 = new MovieNode("Where the Crawdads Sing", 2022, 74, true,77734);
    MovieNode movie12 = new MovieNode("Burlesque", 2004, 67, true,54567);
    MovieNode movie13 = new MovieNode("How to Lose a Gay in 10 Days", 2001,  87, true,76512);
    MovieNode movie14 = new MovieNode("Uncharted", 2022,  45, true,23415);
    MovieNode movie15 = new MovieNode("Pitch Perfect", 2015, 89, false, 34535);
    MovieNode movie16 = new MovieNode("Goosebumps", 2019, 68, true, 23457);
    MovieNode movie17 = new MovieNode("Super Mario Movie", 2018, 87,true, 37757);
    MovieNode movie18 = new MovieNode("Terminator", 1971, 89,true, 23453);
    MovieNode movie19 = new MovieNode("Turbo", 1980, 78, true, 34456);
    MovieNode movie20 = new MovieNode("Rango", 1700, 96, true, 43458);
    MovieNode movie21 = new MovieNode("Paddington", 2018,  87, true, 99234);
        
    // add some movies to the system
   

    movielist.insert(movie1);
    movielist.insert(movie2);
    movielist.insert(movie3);
    movielist.insert(movie4);
    movielist.insert(movie5);
    movielist.insert(movie6);
    movielist.insert(movie7);
    movielist.insert(movie8);
    movielist.insert(movie9);
    movielist.insert(movie10);
    movielist.insert(movie11);
    movielist.insert(movie12);
    movielist.insert(movie13);
    movielist.insert(movie14);
    movielist.insert(movie15);
    movielist.insert(movie16);
    movielist.insert(movie17);
    movielist.insert(movie18);
    movielist.insert(movie19);
    movielist.insert(movie20);
    movielist.insert(movie21);


        Serialize.serCustomers(customers);
        Serialize.serMoviesRating(moviesrating);
        Serialize.serMoviesID(moviesID);
       Serialize.serWishList(wishlist);
       Serialize.serMovieList(movielist);


    }
}
