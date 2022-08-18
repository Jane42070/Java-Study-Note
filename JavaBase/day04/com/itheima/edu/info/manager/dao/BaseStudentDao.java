package JavaBase.day04.com.itheima.edu.info.manager.dao;

import JavaBase.day04.com.itheima.edu.info.manager.domain.Student;

public interface BaseStudentDao {
    public abstract boolean addStudent(Student stu);

    public abstract Student[] findAllStudent();

    public abstract void deleteStudentById(String id);

    public abstract int getIndex(String id);

    public abstract void updateStudent(String updateId, Student stu);
}
