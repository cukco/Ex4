class Rectangle{
    private double width;
    private double height;
    public Rectangle(double width,double height){
        this.height=height;
        this.width=width;
    }
    double getArea(){
        return width*height;
    }
    double getPerimeter(){
        return 2*(width+height);
    }
    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }
    String pr(){
        return  "Rectangle(width= "+width+", height= "+height+ ", area= "+getArea()+", perimeter= " +getPerimeter()+")";
    }
}
public class Ex74 {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(5, 2);
        Rectangle r3 = new Rectangle(4.5, 3.5);
        System.out.println(r1.pr());
        System.out.println(r2.pr());
        System.out.println(r3.pr());
        Rectangle[] arr={r1,r2,r3};
        double max=-1;
        for(int i=0;i<3;i++){
            if(max<arr[i].getArea()) max=arr[i].getArea();
        }
        System.out.println("Largest area: "+max);
        for(int i=0;i<3;i++){
            if(max==arr[i].getArea())
                System.out.println(arr[i].pr());
        }
    }
}
