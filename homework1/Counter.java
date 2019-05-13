public class Counter{
    private int val;
    public Counter(){
        val = 0;
    }
    public void inc(){
        val++;
    }
    public int getVal(){
        return val;
    }
    public void reset(){
        val = 0;
    }
}