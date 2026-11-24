/**
 * A rectangle with a width and a height.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a rectangle with the given dimensions.
   *
   * @param width the width of the rectangle
   * @param height the height of the rectangle
   */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /**
   * Returns the area of this rectangle.
   *
   * @return the width multiplied by the height
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales both dimensions of this rectangle by the given factor.
   *
   * @param factor the amount to multiply the width and height by
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Returns whether this rectangle has a larger area than another rectangle.
   *
   * @param other the rectangle to compare with
   * @return true if this rectangle's area is strictly larger than other's
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
