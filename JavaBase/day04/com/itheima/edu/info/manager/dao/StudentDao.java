package JavaBase.day04.com.itheima.edu.info.manager.dao;

import JavaBase.day04.com.itheima.edu.info.manager.domain.Student;

public class StudentDao {
    // 创建学生对象数组
    private static Student[] students = new Student[5];

    static {
        Student stu1 = new Student("2018211922", "张三", 22, "20000112");
        Student stu2 = new Student("2018211923", "李四", 22, "20000624");
        Student stu3 = new Student("2018211921", "蹇棋林", 22, "20000420");
        students[0] = stu1;
        students[1] = stu2;
        students[2] = stu3;
    }

    public boolean addStudent(Student stu) {
        // 添加学生到数组
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                index = i;
                // 如果为 null，让 index 变量记录当前索引位置，使用 break 结束循环遍历
                break;
            }
        }
        // 检查是否添加成功
        if (index == -1) {
            // 装满了
            return false;
        } else {
            // 没有装满，正常添加，返回 true
            students[index] = stu;
            return true;
        }
    }

    public Student[] findAllStudent() {
        return students;
    }

    public void deleteStudentById(String id) {
        // 1. 查找id在容器中所在的索引位置
        // 2. 将该索引位置，使用null元素进行覆盖
        int index = getIndex(id);
        students[index] = null;
    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student != null && student.getId().equals(id)) {
                index = i;
                return index;
            }
        }
        return index;
    }

    public void updateStudent(String updateId, Student newStu) {
        int index = getIndex(updateId);
        students[index] = newStu;
    }
}
