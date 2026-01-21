import org.code.theater.*;
import org.code.media.*;

public class ThisYear extends Scene {

  // variable for picture and caption 
  // give caption value of I want to travel more 
  private String[] pictures;
  private String[] captions = {
    "I want to travel more"
  };

  //constructor 
  // it loads the image and plays it 
  public ThisYear() {
    pictures = FileReader.toStringArray("pictures_thisyear.txt");
    
    // Just print the loaded pictures
    for (String pic : pictures) {
        System.out.println(pic);
    }
}

  public ThisYear(String[] pictures) {
    this.pictures = pictures;
  }

  // draws scene 
  // creates and pauses scene 
  public void drawScene() {
    // Title Screen
    drawTitleScreen();
    pause(2.0);
    // Images With Captions
    drawImagesWithCaptions();
    // End Screen
    drawEndScreen();
  }

  // scene method 
  // display page size 
  // sets color 
  public void drawTitleScreen() {
    setTitleScreenStyle();
    clear("white");
    drawText("My 2026 Goals", 80, 200);
  }

  public void drawImagesWithCaptions() {
    setCaptionStyle();
    for (int i = 0; i < pictures.length; i++) {
        drawImage(pictures[i], 0, 0, 400, 400, 0.0);
        // caption
        drawText(captions[i], 40, 360);
        // pause so the image stays on screen
        pause(2.0);
    }
}

  public void drawEndScreen() {
    setEndScreenStyle();
    clear("black");
    drawText("Looking Forward", 60, 200);
  }

  //styles 
  // sets font, text color and height 
  public void setTitleScreenStyle() {
    setTextHeight(40);
    setTextColor("green");
    setTextStyle(Font.SANS, FontStyle.BOLD);
  }

  public void setCaptionStyle() {
    setTextHeight(24);
    setTextColor("white");
    setTextStyle(Font.SERIF, FontStyle.BOLD);
  }

  public void setEndScreenStyle() {
    setTextHeight(35);
    setTextColor("white");
    setTextStyle(Font.MONO, FontStyle.BOLD);
  }
}
