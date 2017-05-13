package w10;
public class Shape {
        private String shapeName;
        protected double area;
        public Shape(String shapeName)
          {
            this.shapeName = shapeName;
          }
        public void computeArea() {
               area = 0;
        }
        public double getArea(){ return area;}
    }
