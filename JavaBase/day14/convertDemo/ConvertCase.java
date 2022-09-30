package JavaBase.day14.convertDemo;

import java.io.*;
import java.util.ArrayList;

/**
 * @author qilin
 */
public class ConvertCase {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("JavaBase/day14/convertDemo/student.txt", true));
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("蹇棋林", 22));
        list.add(new Student("福瑞婷", 26));
        list.add(new Student("贾余东", 21));
        list.add(new Student("何清华", 23));
        oos.writeObject(list);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("JavaBase/day14/convertDemo/student.txt"));
        ArrayList<Student> list2 = (ArrayList<Student>) ois.readObject();
        for (Student student : list2) {
            System.out.println(student);
        }
        ois.close();
    }
}
