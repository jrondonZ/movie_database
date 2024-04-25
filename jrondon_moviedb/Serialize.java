import java.io.*;    
public class Serialize {  
  
  public static void serCustomers(BST customers) {
   
    try {   

    //Creating the object    
      //Creating stream and writing the object    
      FileOutputStream fout = new FileOutputStream("customers.ser");    
      ObjectOutputStream out = new ObjectOutputStream(fout);    
      out.writeObject(customers);    
      out.flush();    
      //closing the stream    
      out.close();    
      
    }
    catch(Exception e) {
        System.out.println(e);
    }    
 } 

 public static void serMoviesID(IdBST moviesID) {
   
  try {    
  
 

    //Creating stream and writing the object    
    FileOutputStream fout=new FileOutputStream("moviesID.ser");    
    ObjectOutputStream out=new ObjectOutputStream(fout);    
    out.writeObject(moviesID);    
    out.flush();    
    //closing the stream    
    out.close();    
  }
  catch(Exception e) {
      System.out.println(e);
  }    
} 
public static void serWishList(WishList wishlist) {

    try {
   
 
        //Creating stream and writing the object    
        FileOutputStream fout=new FileOutputStream("wishlist.ser");    
        ObjectOutputStream out=new ObjectOutputStream(fout);    
        out.writeObject(wishlist);    
        out.flush();    
        //closing the stream    
        out.close();   
    }
    catch(Exception e){
      System.out.println(e);
  }   
}

public static void serMoviesRating(MovieRating moviesrating) {

  try {    
  
   

    //Creating stream and writing the object    
    FileOutputStream fout=new FileOutputStream("moviesrating.ser");    
    ObjectOutputStream out=new ObjectOutputStream(fout);    
    out.writeObject(moviesrating);    
    out.flush();    
    //closing the stream    
    out.close();   
    
  } catch(Exception e) {
    System.out.println(e);
  }

 
}

public static void serMovieList(MovieList movielist){
    try {    
 

    //Creating stream and writing the object    
    FileOutputStream fout=new FileOutputStream("movielist.ser");    
    ObjectOutputStream out=new ObjectOutputStream(fout);    
    out.writeObject(movielist);    
    out.flush();    
    //closing the stream    
    out.close();   
    
  } catch(Exception e) {
    System.out.println(e);
    }
  }
}