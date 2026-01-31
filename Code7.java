abstract class shape{
    abstract void draw();
    void message(){
        System.out.println("Hello");
    }
}
class circle extends shape{
    void draw(){
        System.out.println("Drawing");
    }
}
class Code7{
    public static void main(String[] args){
        circle cl=new circle();
        cl.draw();
        cl.message();
        
    }
}