public class DonaldContainer
{
    private String[] data;
    private int currentPosition;
    
    public DonaldContainer(){
        data = new String[10];
        currentPosition = 0;
    }

    public void add(String value){
        if (currentPosition >= data.length){
            resize();
        }
        data[currentPosition] = value;
        currentPosition++;
        }

    public void add(int position, String value){
        if (currentPosition >= data.length){
            resize();
        }
        for (int i = currentPosition; i > position; i--){
            data[i] = data[i - 1];
        }
        data[position] = value;
        currentPosition++;
    }

    public void replace(int position, String value){
        data[position] = value;
    }

    public void addFirst(String value){
        add(0, value);
    }

    public void remove(int position){
        for (int i = position; i < currentPosition; i++){
            data[i] = data[i + 1];
        }
        data[currentPosition - 1] = null;
        currentPosition--;
    }

    public void removeFirst(){
        remove(0);
    }

    public void removeLast(){
        if (currentPosition > 0){
            data[currentPosition - 1] = null;
            currentPosition--;
        }
    }

    public void clear(){
        data = new String[10];
        currentPosition = 0;
    }
    
    public int size(){
        return currentPosition;
    }

    public boolean isEmpty(){
        return currentPosition == 0;
    }

    public boolean contains(String value){
        for (int i = 0; i < currentPosition; i++){
            if (data[i] != null && data[i].equals(value)){
            return true;
            }
        }
        return false;
    }

    public int indexOf(String value){
        for (int i = 0; i < currentPosition; i++){
            if (data[i] != null && data[i].equals(value)){
                return i;
            }
        }
        System.out.println("This value is not in the array");
        return -777;
    }

    public String getPosition(int position){
        return data[position];
    }
    
    public String toString(){
        String result = "[";
        for (int i = 0; i < currentPosition; i++){
            result += data[i];
            if (i < currentPosition - 1){
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
    
    public void resize(){
        String[] newData = new String[data.length * 2];
        for (int i = 0; i < data.length; i++){
            newData[i] = data[i];
        }
        data = newData;
        }
    }
