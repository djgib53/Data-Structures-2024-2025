public class DonaldDaisyChainConnector
{
    private Box head;
    private int size;
    
    public DonaldDaisyChainConnector(){
        this.head = null;
        this.size = 0;
    }
    
    public void addFirst(int data){
        Box newBox = new Box(data, head);
        head = newBox;
        size++;
    }
    
    public void addEnd(int data){
        Box newBox = new Box(data, null);
        if (head == null){
            head = newBox;
        } else {
            Box current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newBox;
        }
        size++;
    }
    
    public void addAtIndex(int index, int data){
        if (index == 0){
            addFirst(data);
        } else if (index == size){
            addEnd(data);
        } else {
            Box newBox = new Box(data, null);
            Box current = head;
            for (int i = 0; i < index - 1; i++){
                current = current.next;
            }
            newBox.next = current.next;
            current.next = newBox;
            size++;
        }
    }
    
    public void removeFirst(){
        head = head.next;
        size--;
    }
    
    public void removeEnd(){
        if (head.next == null){
            head = null;
        } else {
            Box current = head;
            while (current.next != null && current.next.next != null){
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }
    
    public void removeAtIndex(int index){
        if (index == 0){
            removeFirst();
        } else if (index == size){
            removeEnd();
        } else {
            Box current = head;
            for (int i = 0; i < index - 1; i++){
                current = current.next;
            }
            current.next = current.next.next;
            size--;
        }
    }
    
    public void replace(int index, int data){
        Box current = head;
        for (int i = 0; i < index; i++){
            current = current.next;
        }
        current.data = data;
    }
    
    public void clear(){
        head = null;
        size = 0;
    }
    
    public int size(){
        return size;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Box current = head;
        while (current != null){
            sb.append(current.data);
        if (current.next != null){
            sb.append (" -> ");
        }
        current = current.next;
    }
    return sb.toString();
    }
    
    public int get(int index){
        Box current = head;
        for (int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }
    
    public boolean contains(int element){
        Box current = head;
        while (current != null){
            if (current.data == element) {
                return true;
            } 
            current = current.next;
        }
        return false;
    }
}
