
//This program creates a class node that contains methods to get and set different fields

public class Node{

	private String name;
	private int SSN;
	private Node left;
	private Node right;

	public Node(String name, int SSN){
		this.name=name;
		this.SSN=SSN;
		this.left = left;
		this.right = right;
	}
	public String getName(){
		return name;
		}

	public int getSSN(){
		return SSN;
		}

	public int getKey(){
		int key=SSN%10000;
		return key;
		}
		
	public Node getLeft() {
		return left;
		}
	public Node getRight() {
		return right;
		}

	public void setLeft(Node newNode){
		left=newNode;
		}
		
	public void setRight(Node newNode){
		right = newNode;
		}
		
	public void setName(String Name){
		name=Name;
		}
	public void setSSN(int SSN){
		SSN=SSN;

		}
	}
