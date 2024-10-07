public class DaisyChainTester
{
    public static void main (String[] args){
        DonaldDaisyChainConnector djconnect = new DonaldDaisyChainConnector();
        
        djconnect.addFirst(1);
        djconnect.addEnd(2);
        djconnect.addFirst(5);
        djconnect.addFirst(10);
        djconnect.addFirst(13);
        System.out.println("Add first: " + djconnect);
        
        djconnect.addEnd(3);
        System.out.println("Add end: " + djconnect);
        
        djconnect.addAtIndex(1, 5);
        System.out.println("Add at index: " + djconnect);
        
        djconnect.removeFirst();
        System.out.println("Remove first: " + djconnect);
        
        djconnect.removeEnd();
        System.out.println("Remove end: " + djconnect);
        
        djconnect.removeAtIndex(0);
        System.out.println(djconnect);
        
        djconnect.replace(1, 9);
        System.out.println(djconnect);
        
        System.out.println("Get at Indext 1: " + djconnect.get(1));
        System.out.println("Contains 9: " + djconnect.contains(9));
        System.out.println("Get size: " + djconnect.size());
        
        djconnect.clear();
        
        System.out.println("Clear: " + djconnect);
    }
}
