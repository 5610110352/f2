public class Adder{
    private double sum;
    public Adder(){
        sum = 0.0;
    }
    public void add(double v){
        sum = sum + v;
    }
    public double getVal(){
        return sum;
    }
    public void reset(){
        sum = 0.0;
    }
    public void addFrom(Adder another){
        val += another.getVal();
    }
    public void setValue(double u){
        sum = u;
    }
}