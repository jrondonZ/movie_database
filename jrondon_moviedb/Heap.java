//Program 5, Priority Queue (Heap)

public class Heap{
	
	private int n; 
	private Node[] s; 
	
	public Heap(){
		s= new Node[120];
		n=0;
	
		
	}
	
	public boolean isEmpty(){
		return n==0; 
		
	}
	public int findMin(){
       
		return s[0].getKey();
		
	}
	public void insert(Node newNode) {
		if (n >= s.length) {
        // Heap is full
			return;
		}
		
		s[n] = newNode;
		n++;

	// Move the new node up the tree as needed to restore the heap property
		int i = n - 1;
		int parent = (i - 1) / 2;
		while (i > 0 && s[i].getKey() > s[parent].getKey()) {
			swap(i, parent);
			i = parent;
			parent = (i - 1) / 2;
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
		Node temp=s[i];
		s[i]=s[j];
		s[j]=temp; 
	
	}
	
	public Node deleteMin(){
		if (isEmpty()) {
			return null; // return null if the heap is empty
		}
		Node minNode = s[0];
		s[0] = s[n-1]; // replace the root with the last node in the heap
		s[n-1] = null; // set the last node to null
		n--; // decrement the number of nodes in the heap
		int i = 0;
		while (i < n) {
			int left = 2*i + 1;
			int right = 2*i + 2;
			int min = i;
		
			if (left < n && s[left].getKey() < s[min].getKey()) {
				min = left;
			}
	
			if (right < n && s[right].getKey() < s[min].getKey()) {
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

public void printHeap(){
	
	
	
	if (n>0){
		for(int i=0; i<n; i++){
			int childL= 2*i+1; 
			int childR=2*i+2; 
			System.out.println(i+" "+s[i].getKey()); 
			if (s[childL] != null)
				System.out.print("Left: " + s[childL].getKey() + " ");
			else
				System.out.print("Left: null ");
			if (s[childR] != null)
				System.out.println("Right: " + s[childR].getKey() + " ");
			else
				System.out.println("Right: null ");
			
			
			
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
		
		
	}
	
	
