class Animal{
    Animal(){
        System.out.println("Hello");
    }
}
class Dog extends Animal{
     Dog() {
        super();  
    }
    void sound(){
        System.out.println("Hi");

    }
}
class Code5{
    public static void main(String[] args){
    Dog dg=new Dog();
    dg.sound();
}
}