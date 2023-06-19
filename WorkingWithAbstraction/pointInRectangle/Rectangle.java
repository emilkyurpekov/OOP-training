package pointInRectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public void setTopRight(Point topRight) {
        this.topRight = topRight;
    }

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }
    public boolean Contains(Point point){
        boolean isInsideX = point.getX() >= bottomLeft.getX() && point.getX() <= topRight.getX();
        boolean isInsideY = point.getY() >= bottomLeft.getY() && point.getY() <= topRight.getY();
        return  isInsideX && isInsideY;
    }

}
