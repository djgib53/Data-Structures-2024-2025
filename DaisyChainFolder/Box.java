public class Box
{   
    int data;
    Box next;
    
    public Box(int inputData, Box inputBoxNext){
        this.data = inputData;
        this.next = inputBoxNext;
    }
    
    public int getBoxData(){
        return data;
    }
    
    public void setBoxData(int num){
        data = num;
    }
    
    public Box getBox(){
        return next;
    }
    
    public void setBoxNext(Box newBox){
        next = newBox;
    }
}