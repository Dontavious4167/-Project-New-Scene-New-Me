import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // Create scene objects
    ThisYear thisYear = new ThisYear();

    // Call top level methods
    thisYear.drawScene();

    // Play scenes (in order of arguments)
    Theater.playScenes(thisYear);
    
  }
} 
