package JavaBase.day16.InetAddressDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author qilin
 */
public class Demo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("192.168.0.30");
        String hostAddress = address.getHostAddress();
        System.out.println(hostAddress);
        String hostName = address.getHostName();
        System.out.println(hostName);
    }
}
