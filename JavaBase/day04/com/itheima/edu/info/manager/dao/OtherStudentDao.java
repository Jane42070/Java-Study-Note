package JavaBase.day04.com.itheima.edu.info.manager.dao;

import JavaBase.day04.com.itheima.edu.info.manager.domain.Student;

import java.util.ArrayList;

public class OtherStudentDao implements BaseStudentDao {
    // 创建集合容器
    private static ArrayList<Student> students = new ArrayList<>();

    static {
        Student stu1 = new Student("2018211922", "张三", 22, "20000112");
        Student stu2 = new Student("2018211923", "李四", 22, "20000624");
        Student stu3 = new Student("2018211921", "蹇棋林", 22, "20000420");
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
    }

    public boolean addStudent(Student stu) {
        students.add(stu);
        return true;
    }

    public Student[] findAllStudent() {
        Student[] stu = new Student[students.size()];
        for (int i = 0; i < students.size(); i++) {
            stu[i] = students.get(i);
        }
        return stu;
    }

    public void deleteStudentById(String id) {
        // 1. 查找id在容器中所在的索引位置
        // 2. 将该索引位置，使用null元素进行覆盖
        int index = getIndex(id);
        students.remove(index);
    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student != null && student.getId().equals(id)) {
                index = i;
                return index;
            }
        }
        return index;
    }

    public void updateStudent(String updateId, Student newStu) {
        int index = getIndex(updateId);
        // 集合的修改方法
        students.set(index, newStu);
    }
}
