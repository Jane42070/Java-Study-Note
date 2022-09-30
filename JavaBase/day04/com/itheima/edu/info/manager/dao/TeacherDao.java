package JavaBase.day04.com.itheima.edu.info.manager.dao;

import JavaBase.day04.com.itheima.edu.info.manager.domain.Teacher;

public class TeacherDao {
    private static Teacher[] teachers = new Teacher[5];

    public boolean addTeacher(Teacher teacher) {
        // 将老师添加到数组
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        } else {
            teachers[index] = teacher;
            return true;
        }
    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null && teachers[i].getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public Teacher[] findAllTeacher() {
        return teachers;
    }

    public void deleteTeacherById(String id) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null && teachers[i].getId().equals(id)) {
                teachers[i] = null;
                break;
            }
        }
    }

    public void updateTeacher(Teacher teacher) {
        int index = getIndex(teacher.getId());
        teachers[index] = teacher;
    }
}
