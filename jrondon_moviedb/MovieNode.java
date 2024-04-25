
import java.io.Serializable;  

//Defines the movie node class and contains getters and setters for the different instance variables
public class MovieNode implements Serializable{
    private String title;
    private int releaseDate;
    private int popularityScore;
    private boolean isAvailable;
    private int value;
    private int key;
    private MovieNode next;
    private MovieNode leftId;
    private MovieNode rightId;
    private MovieNode leftDate;
    private MovieNode rightDate;
    private int IdCode;

    public MovieNode(String title, int releaseDate, int popularityScore, boolean isAvailable, int IdCode) {
        this.IdCode = IdCode;
        this.title = title;
        this.releaseDate = releaseDate;
        this.popularityScore = popularityScore;
        this.isAvailable = isAvailable;
        this.key = key;
    
        this.next = null;
        this.leftId = null;
        this.rightId = null;
        this.rightDate = null;
        this.leftDate = null;
    }   

    //Returns the title of the movie
    public String getTitle() {
        return title;
    }

    //Sets the title of the current movie as the inputed name
    public void setTitle(String title) {
        this.title = title;
    }

    //Returns the release date of the current movie
    public int getReleaseDate() {
        return releaseDate;
    }

    //Sets the release date of the current movie as the inputed date
    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    //Returns the ID of the current movie
    public int getIdCode() {
        return IdCode;
    }
    
    //Returns the popularity score of the current movie
    public int getPopularityScore() {
        return popularityScore;
    }
    
    //Sets the popularity score of the current movie to the inputed score
    public void setPopularityScore(int popularityScore) {
        this.popularityScore = popularityScore;
    }

    //Returns T or F according to the availibilty of the current movie
    public boolean isAvailable() {
        return isAvailable;
    }

    //Sets the avaibibility of the current movie as the inputed boolean
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    //Returns the values of the current movie
    public int getValue(){
        return value;
    }

    //Returns the key of the current movie
    public int getKey() {
        return key;
    }

    //Sets the key of the current movie to the inputed value
    public void setKey(int key) {
        this.key = key;
    }

    //Returns the next movie node
    public MovieNode getNext() {
        return next;
    }
    
    //Sets the next movie node as the inputed movie node
    public void setNext(MovieNode next) {
        this.next = next;
    }   

    //Returns the ID of the movie to the left of the current
    public MovieNode getLeftId() {
        return leftId;
    }

    //Sets the ID of the movie to the left of the current as the inputed ID
    public void setLeftId(MovieNode leftId) {
        this.leftId = leftId;
    }

    //Returns the movie ID of the movie to the right of the current
    public MovieNode getRightId() {
        return rightId;
    }

    //Sets the movie ID of the movie to the right of the current as the inputed ID value
    public void setRightId(MovieNode rightId) {
        this.rightId = rightId;
    }
    
    //Returns the release date of the movie to the left of the current
    public MovieNode getLeftDate() {
        return leftDate;
    }

    //Returns the release date of the movie to the right of the current
    public MovieNode getRightDate() {
        return rightDate;
    }
    
    //Sets the movie to the left of the currents release date to the inputed date
    public void setLeftDate(MovieNode leftDate) {
        
        this.leftDate = leftDate;
    }

    //Sets the movie to the right of the currents release date to the inputed date
    public void setRightDate(MovieNode rightDate) {
        this.rightDate = rightDate;
    }
}