import java.awt.Point;
import java.util.HashMap;

public class Board {  
  private int finishPos;
  private HashMap<Integer, Integer> tunnels = new HashMap<>();
  

  public Board(int finishPos) {
    this.finishPos = finishPos;
    prepareTunnels();
    
  }

  public int getFinishPos() {
    return finishPos;
  }

  public Integer getTunnelOutPos(int pos){
    return tunnels.get(pos);
  }

  

  public Point getRefLocationForPos(int pos){
    //800*500
    int row = ((pos - 1) / 10);
    int x;    
    if(row % 2 == 1){
      x = 82 * ((pos - 1) % 10);
    }else{
      x = 820 - ((pos - (row * 10)) * 82);
    }
    return new Point(x,  448 - (row * 64));
  }

  private void prepareTunnels(){
    tunnels.put(26, 3);
    tunnels.put(27, 37);
    tunnels.put(31, 8);
    tunnels.put(51, 33);
    tunnels.put(38, 57);
    tunnels.put(68, 46);
    tunnels.put(62, 76);
  }
  
}