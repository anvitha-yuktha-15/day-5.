class Animal{
    void sound(){
        System.out.println("kitty");
    }
}
class Mammel extends Animal{
    void hambha(){
        System.out.println("cow");
    }
}
class Human extends Mammel{
    void speak(){
        System.out.println("ash");
    }
}
class Code2{
    public static void main(String[] args){
    Mammel ml=new Mammel();
    Human hm=new Human();
    hm.sound();
    hm.hambha();
    hm.speak();
   }
}