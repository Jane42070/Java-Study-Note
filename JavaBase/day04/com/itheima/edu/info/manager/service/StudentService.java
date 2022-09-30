package JavaBase.day04.com.itheima.edu.info.manager.service;

import JavaBase.day04.com.itheima.edu.info.manager.dao.BaseStudentDao;
import JavaBase.day04.com.itheima.edu.info.manager.dao.OtherStudentDao;
import JavaBase.day04.com.itheima.edu.info.manager.dao.StudentDao;
import JavaBase.day04.com.itheima.edu.info.manager.domain.Student;
import JavaBase.day04.com.itheima.edu.info.manager.factory.StudentDaoFactory;

public class StudentService {
    // 创建库管对象 StudentDao
    // private OtherStudentDao studentDao = new OtherStudentDao();
    // 通过学生库管工厂类，获取库管对象
    private BaseStudentDao studentDao = StudentDaoFactory.getStudentDao();

    public boolean addStudent(Student stu) {
        // 传入接收的学生对象
        return studentDao.addStudent(stu);
    }

    public boolean isExists(String id) {
        Student[] students = studentDao.findAllStudent();
        // 遍历数组，获取学生对象，进行判断
        for (Student student : students) {
            if (student != null && student.getId().equals(id)) {
                // id 在数组中存在
                return true;
            }
        }
        // id 在数组中不存在
        return false;
    }

    public Student[] findAllStudent() {
        // 1. 调用库管对象的 findAllStudent 获取学生对象数组
        Student[] students = studentDao.findAllStudent();
        // 2. 判断数组中是否有学生信息（有：返回地址， 没有：返回null）
        // 思路：数组中只要存在一个不是null的元素，就代表有学生信息
        boolean flag = false;
        for (Student student : students) {
            if (student != null) {
                flag = true;
                break;
            }
        }
        if (flag) {
            // 有信息
            return students;
        } else {
            return null;
        }
    }

    public void deleteStudentById(String id) {
        studentDao.deleteStudentById(id);
    }

    public void UpdateStudent(String updateId, Student newStu) {
        studentDao.updateStudent(updateId, newStu);
    }
}
