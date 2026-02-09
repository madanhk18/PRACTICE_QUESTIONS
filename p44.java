interface addition{
    void add(int a,int b);
}
class B{
    public static void main(String[] args) {
        addition Z=(a,b) -> System.out.println("Sum is="+(a+b));
        Z.add(5,6);
    }
}