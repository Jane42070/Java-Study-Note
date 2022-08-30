package JavaBase.day05.permissionTest.test2;

import JavaBase.day05.permissionTest.test1.Fu;

public class Son extends Fu{
    public void method() {
        // 默认权限：不同包下，都不能访问
        // super.show();
        // protected 权限：在不同包下子类能被访问
        super.print();
    }
}
