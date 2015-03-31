package util;

/** Simple utilities for random numbers and random colors.
 */

public class ColorUtils {
  // The official HTML color names.
  private static String[] colors = {
    "aqua", "black", "blue", "fuchsia", "gray", "green", "lime", "maroon",
    "navy", "olive", "purple", "red", "silver", "teal", "white", "yellow" };

  /** One of the official HTML color names, at random. */
  
  public static String randomColor() {
    return(RandomUtils.randomElement(colors));
  }
  
  private ColorUtils() {}  // Uninstantiatable class
  
  public static void main(String[] args) {
    for(int i=0; i<100; i++) {
      System.out.println("Random color: " + randomColor());
    }
  }
}
