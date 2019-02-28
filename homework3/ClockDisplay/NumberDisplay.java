public class NumberDisplay
{
    private int currValue;
    private int maxValue;     // number at which currValue goes back to 0


    public NumberDisplay(int max){ 
        maxValue = max;
        currValue = 0;
    }
    public void setValue(int newValue){
        if ((newValue >= 0) && (newValue < maxValue))
        currValue = newValue;
    }
    public int getValue(){          
        return currValue; 
    }
    public String getDisplayValue(){
        if (currValue < 10)
            return "0" + currValue;  //pad string with leading 0
        else
            return "" + currValue;
    }
    public void increment(){        
        currValue = (currValue + 1) % maxValue; 
    }

}  // end of NumberDisplay class

