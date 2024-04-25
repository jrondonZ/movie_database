class testing {
    public static void main(String[] args) {



        Serialize.serCustomers();
        Serialize.serMovieList();
        Serialize.serMoviesDate();
        Serialize.serMoviesID();
        Serialize.serWishList();

         BST customers1 = Deserialize.desCustomers();

         System.out.println(customers1);

        IdBST moviesID1 = Deserialize.desMoviesID();
        
        DateBST moviesDate1 = Deserialize.desMoviesDate();

        WishList wishlist1 = Deserialize.desWishList();
        
        System.out.println(wishlist1);

        MovieList movielist1 = Deserialize.desMovieList();

        
    }
}