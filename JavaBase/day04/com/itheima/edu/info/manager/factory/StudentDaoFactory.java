package JavaBase.day04.com.itheima.edu.info.manager.factory;

import JavaBase.day04.com.itheima.edu.info.manager.dao.BaseStudentDao;
import JavaBase.day04.com.itheima.edu.info.manager.dao.OtherStudentDao;
import JavaBase.day04.com.itheima.edu.info.manager.dao.StudentDao;

public class StudentDaoFactory {
    public static BaseStudentDao getStudentDao() {
        return new OtherStudentDao();
    }
}
