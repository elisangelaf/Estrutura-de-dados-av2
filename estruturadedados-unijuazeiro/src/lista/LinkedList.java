package lista;

public class LinkedList implements List{
	
	private Node head;

	
	public void add(int value) {
		
		Node newNode = new Node(value);
		
		if(head==null) {
			head = newNode;
		} else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			
			current.next = newNode;
		}
		
	}

	
	public void remove(int value) {
		if(this.head==null) {
			return;
		}
		
		Node current = this.head, previous = null;
		while(current != null && current.content!= value) {
			previous = current;
			current = current.next;
			
		}
		if(current == null) {
			return;
		}
		
		if(previous == null) {
			this.head = current.next;
		}else{
			previous.next = current.next;
		}
		
		current.next = null;
		
	}

	
	public String show() {
		if(this.head == null) {
			return "Lista vazia";
		}
		
		String out = "";
		
		Node current = this.head;
		
		while(current != null) {
			out += current.content + " ";
			current = current.next;
		}
		
		return out;
	}

	
	public void update(int position, int value) {
		
		if(this.head==null) {
			return;
		}
		
		int maxPosition = this.size();
		if(position < 1 || position > maxPosition) {
			return;  //* para a função na hora
		}
		
		int count = 1;
		
		Node i = this.head;
		while (i != null) {
			
			if(count == position) {
				i.content = value;
				break;  //*break para o loope
				
			}
			count++;
			i = i.next;
		} //* outra de fazer esse codigo roda
		
		
	}

	
	public int size() {
		int count = 0;
		
		Node i = this.head;
		while(i!= null) {
			count++;
			i = i.next;
		}
		
		return count;
		
	}
	public boolean search (int value) {
		Node current=this.head;
		
		while(current != null && current.content != value) {
			current = current.next;
		}
		if(current==null) {
			return false;
		}else {
			return true;
		}
		
		
		
	}
	
	
	
}

