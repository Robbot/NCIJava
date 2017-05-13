package w10;
public class Rectangle extends Shape {
        private double width; private double height;
        public Rectangle(String shapeName, double width,double height)
            {
               super(shapeName);
                this.width = width;
                this.height = height;
              }
        public void computeArea() {
               area = width * height;
                }
}