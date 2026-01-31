class Animal{
    void sound(){
        System.out.println("kitty");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("puppy");

    }
}
class Code4{
    public static void main(String[] args){
    Dog dg=new Dog();
    dg.sound();
}
}
