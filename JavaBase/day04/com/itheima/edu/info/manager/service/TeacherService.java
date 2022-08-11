package JavaBase.day04.com.itheima.edu.info.manager.service;

import JavaBase.day04.com.itheima.edu.info.manager.dao.TeacherDao;
import JavaBase.day04.com.itheima.edu.info.manager.domain.Teacher;

public class TeacherService {
    private static TeacherDao teacherDao = new TeacherDao();

    public static void updateTeacher(Teacher teacher) {
        teacherDao.updateTeacher(teacher);
    }

    public void addTeacher(Teacher teacher) {
        teacherDao.addTeacher(teacher);
    }

    public boolean isExists(String id) {
        int flag = teacherDao.getIndex(id);
        return flag != -1;
    }

    public Teacher[] findAllTeacher() {
        return teacherDao.findAllTeacher();
    }

    public void deleteTeacherById(String id) {
        teacherDao.deleteTeacherById(id);
    }
}
