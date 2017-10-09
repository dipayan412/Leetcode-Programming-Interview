public class LeetCode61 
{	
	public LeetCode61()
	{
		Node root = new Node(1);
		root.next = new Node(2);
		root.next.next = new Node(3);
		root.next.next.next = new Node(4);
		root.next.next.next.next = new Node(5);
		
		printList(rotateList(root, 2));
	}
	
	Node rotateList(Node root, int k)
	{
		int len = getListLength(root);
		int i = len - k;
		Node ptr = root;
		while(i > 0)
		{
			ptr = ptr.next;
			i--;
		}
		Node newHead = ptr;
		while(ptr.next != null)
		{
			ptr = ptr.next;
		}
		
		ptr.next = root;
		ptr = root;
		i = len - k;
		while(i > 1)
		{
			ptr = ptr.next;
			i--;
		}
		ptr.next = null;
		return newHead;
	}
	
	int getListLength(Node root)
	{
		Node ptr = root;
		int count = 0;
		while(ptr != null)
		{
			ptr = ptr.next;
			count++;
		}
		return count;
	}
	
	void printList(Node root)
	{
		Node ptr = root;
		while(ptr != null)
		{
			System.out.print(ptr.data + "->");
			ptr = ptr.next;
		}
		System.out.print("NULL");
	}
}

class Node
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data = data;
		next = null;
	}
}
