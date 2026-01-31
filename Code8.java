interface payment{
    void pay();
}
class upi implements payment{
    public void pay(){
        System.out.println("Paying");
    }
}
class Code8{
    public static void main(String[] args){
        upi gpay=new upi();
        gpay.pay();
    }
}