import java.io.Serializable;  

//Defines the CustomerNode class, and contains getters and setters for the insatnce variables possesed by the customer
public class CustomerNode implements Serializable {
    private String name;
    private String email;
    private String creditCardNumber;
    private MovieNode[] wishList;
    private int key;
    private CustomerNode next;
    public CustomerNode left;
	public CustomerNode right;
    private Boolean admin;

    public CustomerNode(String name, String email, String creditCardNumber, MovieNode[] wishList, int key, Boolean admin) {
        this.name = name;
        this.email = email;
        this.creditCardNumber = creditCardNumber;
        this.wishList = wishList;
        this.key = key;
        this.next = null;
        this.admin = admin;
    }

    //Returns the customer to the left of the current
    public CustomerNode getLeft() {
        return left;
    }

    //Returns the customer to the right of the current
    public CustomerNode getRight() {
        return right;
    }

    //Sets the customer to the left of the current to the inputed one
    public void setLeft(CustomerNode newNode) {
        left = newNode;
    }

    //Sets the customer to the right of the current to the inputed one
    public void setRight(CustomerNode newNode) {
        right = newNode;
    }

    //Returns the name of the current customer
    public String getName() {
        return name;
    }

    //Sets the name of the current customer to the inputed one
    public void setName(String name) {
        this.name = name;
    }

    //Returns the email of the current customer
    public String getEmail() {
        return email;
    }

    //Sets the email of the current customer to the inputed one
    public void setEmail(String email) {
        this.email = email;
    }

    //Returns the credit card number of the customer
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    //Sets the credit card number of the current customer to the inputed value
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    //Returns the washlist of the current customer
    public MovieNode[] getWishList() {
        return wishList;
    }

    //Sets the wishlist of the current customer to the inputed values
    public void setWishList(MovieNode[] wishList) {
        this.wishList = wishList;
    }

    //Returns the next customer
    public CustomerNode getNext() {
        return next;
    }

    //Sets the next customer to the inputed customer node
    public void setNext(CustomerNode next) {
        this.next = next;
    }

    //Returns the key of the current customer
    public int getKey() {
        return key % 10000;
    }

    //Checks if the user is an admin, and will returns T or F accordingly
      public Boolean getAdminStatus() {
        return admin == true;
    }
}
