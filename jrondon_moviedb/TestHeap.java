public class TestHeap {
    public static void main(String[] args){
	Heap s= new Heap(); 
 
  	Node xNode = new Node("Jane", 123456789);
  	Node yNode = new Node("Joe", 934567890);
  	Node zNode = new Node("Jack", 223452234);
  	Node kNode = new Node("Jill", 934567856);
  	Node aNode = new Node("Abe", 123456788);
  	Node bNode = new Node("Beth", 934567898);
  	Node cNode = new Node("Chuck", 223452238);
  	Node dNode = new Node("Dot", 934567858);
  	Node mNode = new Node("Mike", 723452237);
  	Node nNode = new Node("Nick", 734567857);
  	Node oNode = new Node("Otis", 734562222);
	    
  	s.insert(xNode);
	s.insert(yNode);
	s.insert(zNode);

	System.out.println(s.findMin());
 
}
}