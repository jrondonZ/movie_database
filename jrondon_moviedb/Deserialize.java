import java.io.*;

public class Deserialize {

   public static BST desCustomers() {
      
      try {
         FileInputStream fileIn = new FileInputStream("customers.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         BST customers = (BST) in.readObject();
         in.close();
         fileIn.close();

         return customers;
      } catch (IOException i) {
         i.printStackTrace();
         return null;
      } catch (ClassNotFoundException c) {
         System.out.println("class not found");
         c.printStackTrace();
         return null;
      }
   }

   public static IdBST desMoviesID() {

      try {
         FileInputStream fileIn = new FileInputStream("moviesID.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         IdBST moviesID = (IdBST) in.readObject();
         in.close();
         fileIn.close();

         return moviesID;
      } catch (IOException i) {
         i.printStackTrace();
         return null;
      } catch (ClassNotFoundException c) {
         System.out.println("class not found");
         c.printStackTrace();
         return null;
      }
   }

   public static MovieRating desMovieRating() {

      try {
         FileInputStream fileIn = new FileInputStream("moviesrating.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         MovieRating moviesrating = (MovieRating) in.readObject();
         in.close();
         fileIn.close();

         return null;
      } catch (IOException i) {
         i.printStackTrace();
         return null;
      } catch (ClassNotFoundException c) {
         System.out.println("class not found");
         c.printStackTrace();
         return null;
      }
   }

   public static WishList desWishList() {

      try {
         FileInputStream fileIn = new FileInputStream("wishlist.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         WishList wishlist = (WishList) in.readObject();
         in.close();
         fileIn.close();

         return wishlist;
      } catch (IOException i) {
         i.printStackTrace();
         return null;
      } catch (ClassNotFoundException c) {
         System.out.println("class not found");
         c.printStackTrace();
         return null; 
      }
   }

   public static MovieList desMovieList() {

      try {
         FileInputStream fileIn = new FileInputStream("movielist.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         MovieList movielist = (MovieList) in.readObject();
         in.close();
         fileIn.close();

         return movielist;
      } catch (IOException i) {
         i.printStackTrace();
         return null;
      } catch (ClassNotFoundException c) {
         System.out.println("Class not found");
         c.printStackTrace();
         return null;
      }
   }
}