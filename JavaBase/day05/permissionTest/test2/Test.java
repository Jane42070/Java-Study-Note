package JavaBase.day05.permissionTest.test2;

import JavaBase.day05.permissionTest.test1.Fu;

public class Test {
    public static void main(String[] args) {
        // 默认权限，不同包下，被无关类访问
        Fu f = new Fu();
        // f.show();
        // protected 权限，不同包下无关类，不能访问
        // f.print();
    }
}
