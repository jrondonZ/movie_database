// This program creates a Binary Search Treeclass with linked nodes that contains its methods
import java.io.Serializable;

//Defines the customer BST class which is used to organize the customers by key, and be able to access them
public class BST implements Serializable {
	private CustomerNode root;
	
	//Creates the empty BST where the customers will be stored too
	public void createEmptyTree() {
		root = null;
	}
	
	//Deletes the specified customer node, and will remove it from the BST, by calling upon the recursive function delete2
	public void delete(CustomerNode p) {
		if (root != null) {
			if (p == root) {
				root = deleteRoot(root);
			}
			else {
				delete2(root, p);
			}
		}
	}

	//Used in delete to recursively delete the specified customer node
	public void delete2(CustomerNode tree, CustomerNode p) {
		if ((tree.getLeft() != null) && (p.getKey() < tree.getKey())) {
			if (p.getKey() == tree.getLeft().getKey()) {
				tree.setLeft(deleteRoot(tree.getLeft()));
			}
			else {
				delete2(tree.getLeft(), p);
			}
		}
		else if ((tree.getRight() != null) && (p.getKey() > tree.getKey())) {
			if (p.getKey() == tree.getRight().getKey()) {
				tree.setRight(deleteRoot(tree.getRight()));
			}
			else {
				delete2(tree.getRight(), p);
			}
			
		}
	}
	
	//Will delete the root from the BST and replace it
	public CustomerNode deleteRoot(CustomerNode tree) {
		CustomerNode temp = tree;
		if ((tree.getLeft() == null) && (tree.getRight() == null)) {
			return null;
		}
		else if (tree.getLeft() == null) {
			tree = tree.getRight();
			temp.setRight(null);
			return tree;
		}
		else if (tree.getRight() == null) {
			tree = tree.getLeft();
			temp.setLeft(null);
			return tree;
		}
		else {
			temp = getSuccesor(tree.getRight());
			delete(temp);
			temp.setRight(tree.getRight()); 
			temp.setLeft(tree.getLeft());
			tree.setLeft(null);
			tree.setRight(null);
			return temp;
		}
	}
	
	//Is used when replacing the root of the tree to find the replacement node
	public CustomerNode getSuccesor(CustomerNode t) {
		if (t.getLeft() == null) {
			return t;
		}
		else {
			return getSuccesor(t.getLeft());
		}
	}
	
	//Will insert the specified customer node into the BST, and recursively calls insert2
	public void insert(CustomerNode p) {
		if (root == null) {
			root = p;
		}
		else {
			insert2(root, p);
		}
	}
	
	//Recursievly called in insert to insert a specified customer node into the BST
	public void insert2(CustomerNode t, CustomerNode p) {
		if (p.getKey() < t.getKey()) {
			if (t.getLeft() == null) {
				t.setLeft(p);
			}
			else {
				insert2(t.getLeft(), p);
			}
		}
		else {
			if (t.getRight() == null) {
				t.setRight(p);
			}
			else {
				insert2(t.getRight(), p);
			}
		}
	}
	
	//Recursively calls searchr
	public CustomerNode search(int key) {
		return searchr(root, key);
	}

	//Is recursively called by search and will look for the customer with the specified key
	public CustomerNode searchr(CustomerNode t, int key) {
		if (t == null) {
			return null;
		}
		else if (key == t.getKey()) {
			return t;
		}
		else if (key < t.getKey()) {
			return searchr(t.getLeft(), key);
		}
		else {
			return searchr(t.getRight(), key);
		}
	}
	
	//Recursively calls traverser
	public void traverse() {
		traverser(root);
		System.out.println();
	}
	
	//Recursively called by traverse and will go through the tree
	public void traverser(CustomerNode t) {
		if (t != null) {
			traverser(t.getLeft());
			System.out.print(t.getKey() + " ");
			traverser(t.getRight());
			}
	}

	//Checks to see if the tree is empty or not and returns true or false accordingly
	public boolean isEmptyTree() {
		return root == null;
	}
	
	//Prints out the contents of the tree and recursively calls printTree2
    public void printTree() {
	    printTree2(root);
	    System.out.println();
    }

	//Is recursively called in PrintTree to print out the contents of the tree
    private void printTree2(CustomerNode tree) {
	    if (tree != null) {
	        System.out.print(tree.getKey() + " ");
            if (tree.getLeft() != null) {
	            System.out.print("Left: " + tree.getLeft().getKey() + " ");
			}
            else {
            	System.out.print("Left: null ");
			}
            if (tree.getRight() != null) {
	            System.out.println("Right: " + tree.getRight().getKey() + " ");
			}
            else {
                System.out.println("Right: null ");
			}
	        printTree2(tree.getLeft());
	        printTree2(tree.getRight());
		}
	}
}