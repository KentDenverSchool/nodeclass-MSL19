public class driver {
    //BIG RESPECT TO MR. CLEMENT and MX HAYNES FOR HOLDING MY HAND THROUGH THIS
    public static void main(String[] args){
        //NOTE TO SELF
        //THE MEME HERE IS THAT POINTING DOES NOT CHANGE THE DATA
        //THE MEME HERE IS THAT YOU HAVE TO LIKE USE THE POINTING FOR COOL STUFF LIKE
        //COMPRESSION AND TRESS AND STUFF
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
