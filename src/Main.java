import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Network vodafone = new Network("Vodafone");

        vodafone.addPhone("380992177560");
        vodafone.addPhone("380992177561");

        System.out.println(Arrays.toString(vodafone.getPhones()));


        Phone iphone = new Phone("7", 600, "380991231231");
        iphone.register(vodafone);

        System.out.println(Arrays.toString(vodafone.getPhones()));


        System.out.println(iphone.call("380992177562"));
        System.out.println(iphone.call("380992177564"));




    }
}
