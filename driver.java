public class driver {
    public static void main(String[] args){
        node num1 = new node("wassssup");
        node num2 = new node("high-five", null);
        System.out.println(num1.getData());
        num1.setData("hey that's pretty good");
        num1.pointMe(num2);
        System.out.println(num1);
        System.out.println(num1.getPointer(0));
        System.out.println(num1.getPointer(0) == num2);
        System.out.println(num1.getData());

    }
}
