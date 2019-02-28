public class AdderTest{
    public static void main(String[] args) {
        Adder a = new Adder();
        a.add(2);
        a.add(3);
        System.out.println(a.getVal());
        a.add(1);
        System.out.println(a.getVal());
        a.reset();
        System.out.println(a.getVal());
        
    }
}