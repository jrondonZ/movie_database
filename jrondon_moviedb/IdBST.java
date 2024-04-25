//AVL Tree for admins searching by release date
import java.io.Serializable;

public class IdBST implements Serializable {
	private MovieNode root;
	
	public void createEmptyTree() {
		root = null;
	}
	
	public void delete(MovieNode p) {
		if (root != null) {
			if (p == root) {
				root = deleteRoot(root);
			}
			else {
				delete2(root, p);
			}
		}
	}
		
	public MovieNode deleteRoot(MovieNode tree) {
		MovieNode temp = tree;
		if ((tree.getLeftId() == null) && (tree.getRightId() == null)) {
			return null;
		}
		else if (tree.getLeftId() == null) {
			tree = tree.getRightId();
			temp.setRightId(null);
			return tree;
		}
		else if (tree.getRightId() == null) {
			tree = tree.getLeftId();
			temp.setLeftId(null);
			return tree;
		}
		else {
			temp = getSuccesor(tree.getRightId());
			delete(temp);
			temp.setRightId(tree.getRightId()); 
			temp.setLeftId(tree.getLeftId());
			tree.setLeftId(null);
			tree.setRightId(null);
			return temp;
		}
	}

	public void delete2(MovieNode tree, MovieNode p) {
		if(p.getIdCode() < tree.getIdCode()) {
			if (p.getIdCode() == tree.getLeftId().getIdCode()) {
				tree.setLeftId(deleteRoot(tree.getLeftId()));
			}
			else {
				delete2(tree.getLeftId(), p);
			}
		}
		 if (p.getIdCode() > tree.getIdCode()) {
			if (p.getIdCode() == tree.getRightId().getIdCode()) {
				tree.setRightId(deleteRoot(tree.getRightId()));
			} else {
				delete2(tree.getRightId(), p);
			}
			
		}
	}
	
	public MovieNode getSuccesor(MovieNode t) {
		if (t.getLeftId() == null) {
			return t;
		}
		else {
			return getSuccesor(t.getLeftId());
		}
	}
	
	public void insert(MovieNode p) {
		if (root == null) {
			root = p;
		}
		else {
			insert2(root, p);
		}	
	}
		
	public void insert2(MovieNode t, MovieNode p) {
		if (p.getKey() < t.getKey()) {
			if (t.getLeftId() == null) {
				t.setLeftId(p);
			}
			else {
				insert2(t.getLeftId(), p);
			}
		}
		else {
			if (t.getRightId() == null) {
				t.setRightId(p);
			}
			else {
				insert2(t.getRightId(), p);
			}
		}
	}
		
	public MovieNode search(int key) {
		return searchr(root, key);
	}
		
	public MovieNode searchr(MovieNode t, int key) {
		if (t == null) {
			return null;
		}
		else if (key == t.getIdCode()) {
			return t;
		}
		else if (key < t.getIdCode()) {
			return searchr(t.getLeftId(), key);
		}
		else {
			return searchr(t.getRightId(), key);
		}
	}
		
	public void traverse() {
		traverser(root);
		System.out.println();
	}
		
	public void traverser(MovieNode t) {
		if (t != null) {
			traverser(t.getLeftId());
			System.out.print(t.getIdCode() + " ");
			traverser(t.getRightId());
		}
	}
	
	public boolean isEmptyTree() {
		return root == null;
	}

    public void printTree() {
	    printTree2(root);
	    System.out.println();
    }

    private void printTree2(MovieNode tree) {
	    if (tree != null) {
	        System.out.print(tree.getIdCode() + " ");
            if (tree.getLeftId() != null) {
	            System.out.print("Left: " + tree.getLeftId() + " ");
			}
            else {
                System.out.print("Left: null ");
			}
            if (tree.getRightId() != null) {
	           	System.out.println("Right: " + tree.getRightId() + " ");
			}
            else {
                System.out.println("Right: null ");
			}
	        printTree2(tree.getLeftId());
	        printTree2(tree.getRightId());
	     }
	}
}