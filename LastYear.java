import org.code.theater.*;
import org.code.media.*;

public class LastYear extends Scene {

  // variable for pictures and captions
  private String[] pictures;
  private String[] captions = {
    "Basketball Championship",
    "Baseball Game",
    "Hanging Out With Friends"
  };

  // constructor
  public LastYear() {
    pictures = FileReader.toStringArray("pictures_lastyear.txt");

    // Just print the loaded pictures
    for (String pic : pictures) {
        System.out.println(pic);
    }
  }

  public LastYear(String[] pictures) {
    this.pictures = pictures;
  }

  // draws scene
  public void drawScene() {
    drawTitleScreen();
    pause(2.0);
    drawImagesWithCaptions();
    drawEndScreen();
  }

  // scene methods
  public void drawTitleScreen() {
    setTitleScreenStyle();
    clear("white");
    drawText("My 2025 Recap", 80, 200);
  }

  public void drawImagesWithCaptions() {
    setCaptionStyle();
    for (int i = 0; i < pictures.length; i++) {
        drawImage(pictures[i], 0, 0, 400, 400, 0.0);
        drawText(captions[i], 40, 360);
        pause(2.0);
    }
  }

  public void drawEndScreen() {
    setEndScreenStyle();
    clear("black");
    drawText("2025 Complete", 60, 200);
  }

  // styles
  public void setTitleScreenStyle() {
    setTextHeight(40);
    setTextColor("blue");
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
