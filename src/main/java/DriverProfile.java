public class DriverProfile {
    public int age;
    public int flag;

    public void setAge(int age) {
        this.age = age;
    }


    public void verify_can_drive(){
        flag = (age >= 16)? 1:0;
    }
    public void build_and_print(){
        //using flag we will now either append that they can or can't drive then print
        StringBuilder b = new StringBuilder();
        String Response = (flag == 1)? "You are old enough to legally drive.":"You are not old enough to legally drive.";
        b.append(Response);
        System.out.println(b);

    }

}
