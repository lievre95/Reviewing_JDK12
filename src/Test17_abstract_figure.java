class Test17_abstract_figure {
    public static void main(String[] args) {
        Rectangle marina = new Rectangle(4, 5, 5, 5);
        float a = marina.getArea();
        float p = marina.getPerimeter();
        System.out.println(p);
        System.out.println(a);
    }

    static abstract class Figure {
        float x;
        float y;

        Figure(float x, float y) {
            this.x = x;
            this.y = y;
        }

        //abstract method to get the perimeter
        public abstract float getPerimeter();

        //abstract method to get the area
        public abstract float getArea();
    }

   static class Rectangle extends Figure {
        private float width;
        private float height;


        Rectangle(float x, float y, float height, float width) {
            super(x, y);
            this.height = height;
            this.width = width;
        }

        @Override
        public float getPerimeter() {
            return height * 2 + width * 2;
        }

        @Override
        public float getArea() {
            return width * height;
        }
    }


}









