class Animal{
    void run(){
        System.out.println("Hello");
    }
}
class Dog extends Animal{
     Dog() {
        super.run();  
    }
    void sound(){
        System.out.println("Hi");

    }
}
class Code6{
    public static void main(String[] args){
    Dog dg=new Dog();
    dg.sound();
}
}