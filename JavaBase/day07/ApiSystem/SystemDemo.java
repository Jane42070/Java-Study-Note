package JavaBase.day07.ApiSystem;

/**
 * @author qilin
 */
public class SystemDemo {
    public static void main(String[] args) {
        // public static void exit(int status) 终止当前运行的Java虚拟机，非0表示异常终止
        System.out.println(111);
        // System.exit(0);
        // public static long currentTimeMillis() 返回当前时间（以毫秒为单位）
        long start = System.currentTimeMillis();
        // for (int i = 0; i < 10000; i++) {
        // System.out.println(i);
        // }
        StringBuilder sb = new StringBuilder();
        // String str = new String();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
            // str += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(sb);
        System.out.println(end - start);
        // arraycopy(数据源数组，起始索引，目的地数组，起始索引，拷贝个数) 数组copy
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = new int[10];
        // System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        // for (int i : arr2) {
            // System.out.println(i);
        // }
        // 拷贝 arr1 最后两个元素 到 arr2 最后两个索引上
        System.arraycopy(arr1, arr1.length - 2, arr2, arr2.length - 2, 2);
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
