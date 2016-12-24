package linkedlist;

class Node2 {
	int coeff;
	int x;
	int y;
	int z;
	Node2 next;

	public Node2(int coeff, int x, int y, int z) {
		this.coeff = coeff;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Node2(int coeff, int x, int y, int z,Node2 next) {
		this.coeff = coeff;
		this.x = x;
		this.y = y;
		this.z = z;
		this.next=next;
	}
}

// Represent PolynomialLL using Singly Linked List Structure
class PolynomialLL {
	Node2 head,l0,l1,l2,l3,last;

	public PolynomialLL() {
		head = null;
		//last.next=head;
	}

	 void createlist() {
		head = new Node2( 0, -1, 0, 0);
		l0 = new Node2( 6, 2, 2, 1);
		l1 = new Node2( 4, 0, 1, 5);
		l2 = new Node2( 3, 3, 1, 1);
		l3 = new Node2( 2, 1, 5, 1);
		last = new Node2( 2, 1, 1, 3);
		head.next = l0;
		l0.next=l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = last;
		
	 }
   
	 void displaydata(){
		 last.next=head;//circular linked list	
		System.out.println("\nThe PolynomialLL is:");
		while ((head.next).x != -1) {
			head = head.next;
			System.out.print( head.coeff + "x" + head.x + "y" + head.y + "z" + head.z + " ");
		}
	  }
    static PolynomialLL addTwoPolynomaial(Node2 t1,Node2 t2){   //(PolynomialLL p1, PolynomialLL p2) {
    	PolynomialLL p3 = new PolynomialLL();
    	//Node2 t1=p1.head;
    	//Node2 t2=p2.head;
    	Node2 t3= new Node2(0,-1,0,0);
    	Node2 last=new Node2(0,0,0,0);
    	p3.head=null;
    	 while((t1.next).x != -1 && t2.next.x != -1)
    	    {
    	        t3.next = null;
    	        if(t1.x == t2.x && t1.y == t2.y && t1.z == t2.z)
    	        {
    	            t3.coeff = t1.coeff + t2.coeff;
    	            t3.x = t1.x;
    	            t3.y = t1.y;
    	            t3.z = t1.z;
    	            t1 = t1.next;
    	            t2 = t2.next;
    	        }
    	        else if(t1.x > t2.x)
    	        {   
    	        	t3.coeff = t1.coeff;
    	            t3.x = t1.x;
    	            t3.y = t1.y;
    	            t3.z = t1.z;
    	            t1 = t1.next;
    	        }
    	        else if(t1.x < t2.x)
    	        {       
    	        	t3.coeff = t2.coeff;
    	            t3.x = t2.x;
    	            t3.y = t2.y;
    	            t3.z = t2.z;
    	            t2 = t2.next;
    	        }
    	        else if(t1.y > t2.y)
    	        {    
    	        	t3.coeff = t1.coeff;
    	            t3.x = t1.x;
    	            t3.y = t1.y;
    	            t3.z = t1.z;
    	            t1 = t1.next;
    	        }
    	        else if(t1.y < t2.y)
    	        {    t3.coeff = t2.coeff;
    	            t3.x = t2.x;
    	            t3.y = t2.y;
    	            t3.z = t2.z;
    	            t2 = t2.next;
    	        }
    	        else if(t1.z > t2.z)
    	        {    t3.coeff = t1.coeff;
    	            t3.x = t1.x;
    	            t3.y = t1.y;
    	            t3.z = t1.z;
    	            t1 = t1.next;
    	        }
    	        else if(t1.z < t2.z)
    	        {    t3.coeff = t2.coeff;
    	            t3.x = t2.x;
    	            t3.y = t2.y;
    	            t3.z = t2.z;
    	            t2 = t2.next;
    	        }
    	        if(p3.head == null)
    	            p3.head = t3;
    	        else
    	            last.next = t3;
    	        last = t3;
    	    }
    	    if((t1.next).x == -1)
    	        t3.next = t2;
    	    else
    	        t3.next = t1;
    	    return p3;

    	}

    public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PolynomialLL pol = new PolynomialLL();
//		pol.displayData();
		
		PolynomialLL p1=new PolynomialLL();
		p1.createlist();
		p1.displaydata();
		
		PolynomialLL p2=new PolynomialLL();
		p2.createlist();
		p2.displaydata();
		
		PolynomialLL polySum=new PolynomialLL();
		polySum=PolynomialLL.addTwoPolynomaial(p1.head, p2.head);
		polySum.displaydata();
	}

}
