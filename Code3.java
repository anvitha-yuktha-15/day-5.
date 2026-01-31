class Animal{
    void sound(){
        System.out.println("animals");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("puppy");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("kitty");
    }
}
class Code3{
    public static void main(String[] args){
    Dog dg=new Dog();
    Cat ct=new Cat();
    dg
    .bark();
    ct.sound();
    ct.meow();
    }
}