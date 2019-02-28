public class Dice{
    private int dice1;
    public Dice(){
        dice1 = 1;
    }
    public void roll(){
        dice1 = (int)(Math.random()*6)+1;
    }
    public int getValue(){
        return dice1;
    }
}