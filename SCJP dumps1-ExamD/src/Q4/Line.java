package Q4;

public class Line {
    public static class Point{}
}

class Triangle{
    public Triangle(){

        //cannot use this
//       Line l=new Line();
//       l.Point p=new l.Point();

        Line.Point p=new Line.Point();
    }
}
