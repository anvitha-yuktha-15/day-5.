class Animal{
    void sound(){
        System.out.println("kitty");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("puppy");
    }
}
class Code1{
    public static void main(String[] args){
    Dog dg=new Dog();
    dg.bark();
    dg.sound();
    }
}