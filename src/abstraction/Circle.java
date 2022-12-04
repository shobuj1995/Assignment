package abstraction;

public  class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("This method is called from abstract Shape");
    }
}
