    public class Rectangle {
      public int lenght;
      public int width;
      

      public Rectangle(int length, int width)  {
        this.length = lenght;
        this.width = width;
      }

      public int getArea() {
        return lenght * width;
      }

      public int get Perimeter() {
        return 2 * (length + width);
      }
    }
