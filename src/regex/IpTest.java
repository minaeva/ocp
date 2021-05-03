package regex;

import java.util.regex.Pattern;

public class IpTest {

    void checkIp(String ip) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";

        //25[0-5] -> 250-255
        //2[0-4]\d -> 200 201 ... 209 210 ... 219 220 ... 229 ... 249
        //[01]?\d?\d -> 0 1 2 3 ...9 00 01 02 .. 09 10 11 .. 19 .. 99 000 001 .. 099 100.. 199
        System.out.println(ip + " is ok? " + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {
        String ip1 = "255.38.192.99";
        String ip2 = "25.262.91.05";
        IpTest ipTest = new IpTest();
        ipTest.checkIp(ip1);
        ipTest.checkIp(ip2);
    }

}
