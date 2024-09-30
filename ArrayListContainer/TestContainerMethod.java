public class TestContainerMethod
{
    public static void main(String[] args){
        DonaldContainer data = new DonaldContainer();

        data.add("Alice");
        data.add("Ben");
        data.add("Steven");
        
        System.out.println("Add: " + data);
        
        data.add(1, "Nick");
        
        System.out.println("Add at index: " + data);
        
        data.replace(0, "Eve");
        
        System.out.println("Replace: " + data);
        
        data.remove(2);
        
        System.out.println("Remove at index: " + data);
        
        data.addFirst("Frank");
        
        System.out.println("Add first: " + data);
        
        data.removeFirst();
        
        System.out.println("Remove first: " + data);
        
        data.removeLast();
        
        System.out.println("Remove last: " + data);
        
        System.out.println("Size: " + data.size());
        
        System.out.println("Is empty?: " + data.isEmpty());
        
        System.out.println("Contains Nick? " + data.contains("Nick"));
        
        System.out.println("Index of Nick? " + data.indexOf("Nick"));
        
        System.out.println("Value at Position 0: " + data.getPosition(0));
        
        data.clear();
        
        System.out.println("Clear: " + data);
        System.out.println("Is empty?: " + data.isEmpty());
    }
}
