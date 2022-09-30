package JavaBase.day14.convertDemo;

import java.io.Serial;
import java.io.Serializable;

/**
 * 如果想要这个类的对象能被序列化
 * 那么这个类必须要实现一个接口
 * Serializable
 *
 * @author qilin
 */
public class User implements Serializable {
    // serialVersionUID 序列号
    // 如果我们自己没有定义，那么虚拟机会根据类中的信息自动计算出一个序列号

    // 第一步：把User对象序列化到本地
    // 第二步：修改了 JavaBean 类，导致 类中的序列号改变
    // 第三步：把文件中的对象读到内存，本地中的序列号和类中的序列号不一致
    // 解决？
    // 不让虚拟机帮我们计算，自己手动给出，而且这个值不要变


    @Serial
    private static final long serialVersionUID = 1L;
    private String username;
    private transient String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
