//movielist when ordering by date
import java.io.Serializable;  


public class MovieList implements Serializable{
	
	private int n; 
	private MovieNode[] s; 
	
	public MovieList(){
		s= new MovieNode[255];
		n=0;	
		
	}
	
	public boolean isEmpty(){
		return n==0; 
		
	}
	public MovieNode findMin(){
		return s[0];
		
	}
	public void insert(MovieNode newNode) {
		if (n >= s.length) {
        // Heap is full
			System.out.println("Heap is full");
		}
		else{
		s[n] = newNode;
		n++;

	// Move the new node up the tree as needed to restore the heap property
		int i = n - 1;
		int parent = (i - 1) / 2;
		while (i > 0 && s[i].getReleaseDate() > s[parent].getReleaseDate()) {
			swap(i, parent);
			i = parent;
			parent = (i - 1) / 2;
		}
		}
}
/* 	public void insert(Node x){
 * 	
 * 		
 * 		int parent= (n-1)/2; 
 * 		if (x.getKey()> s[parent].getKey()){
 * 			s[n]=x;
 * 			n+=1;
 * 			
 * 		}
 * 		
 * 		else{
 * 			
 * 			s[n]=x;
 * 			n+=1;
 * 			int i =n;
 * 			while(s[i-1].getKey()<s[parent].getKey()){
 * 				parent=(i-1)/2;
 * 				swap(i-1, parent);
 * 				i=parent;
 * 			
 * 			}
 * 		}
 * 		
 * 	
 * 	}
 */
	
	
	public void swap(int i, int j){
		MovieNode temp=s[i];
		s[i]=s[j];
		s[j]=temp; 
	
	}
	
	public MovieNode deleteMin(){
		if (isEmpty()) {
			return null; // return null if the heap is empty
		}
		MovieNode minNode = s[0];
		s[0] = s[n-1]; // replace the root with the last node in the heap
		s[n-1] = null; // set the last node to null
		n--; // decrement the number of nodes in the heap
		int i = 0;
		while (i < n) {
			int left = 2*i + 1;
			int right = 2*i + 2;
			int min = i;
		
			if (left < n && s[left].getReleaseDate() < s[min].getReleaseDate()) {
				min = left;
			}
	
			if (right < n && s[right].getReleaseDate() < s[min].getReleaseDate()) {
				min = right;
			}
	
			if (min != i) {
				swap(i, min);
				i = min;
	
			} else {
				break;
		
			}
	}
		return minNode;
}

public void printMovieList(){
 
	 if (n>0){
			for(int i=0; i < n; i++){
			System.out.println(" " + s[i].getTitle());
			System.out.println(" " + s[i].getIdCode());
			System.out.println(" " + s[i].getReleaseDate()); 
			System.out.println(" "+ s[i].getPopularityScore());
		
			
			}
		}
	}
}

/* 		n=n-1; 
 * 		swap(s[0], s[n]); 
 * 		//if s[n-1]<m {
 * 		//	swap(
 * 		}
 * 		if(s[0]< childL or childR){
 * 			int lessThan= 
 * 			swap(
 * 			else 
 * 		// switch it with the less of the two 
 * 			
 * 		}
 * 		
 * 		int parent = (i-1)/2;
 * 		int childL= 2*i+1; 
 * 		int childR=2*i+2; 
 */
		
		
	
	