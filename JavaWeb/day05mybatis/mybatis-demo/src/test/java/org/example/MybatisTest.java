package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.BrandMapper;
import org.example.mapper.UserMapper;
import org.example.pojo.Brand;
import org.example.pojo.User;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class MybatisTest {
    @Test
    public void testSelectAll() throws IOException {
        // 1. 获取 sqlSession 对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2. 获取 sqlSession 对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3. 获取 Mapper 接口的代理对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        // 4. 执行方法
        List<Brand> brands = mapper.selectAll();
        System.out.println(brands);

        List<Brand> brandById = mapper.getBrandById(3);

        System.out.println(brandById);

        // 5. 释放资源
        sqlSession.close();
    }

    @Test
    public void getBrandByCondition() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        String companyName = "公司";
        String brandName = "三只";
        int status = 0;

        // 处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

        Brand brand = new Brand();

        // 封装对象
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);
        brand.setStatus(status);
        // Map 集合
//        Map map = new HashMap();
//        map.put("status", status);
//        map.put("companyName", companyName);
//        map.put("brandName", brandName);

//        List<Brand> brandByCondition = mapper.getBrandByCondition(brandName, companyName, status);
//        List<Brand> brandByCondition = mapper.getBrandByCondition(brand);
//        List<Brand> brandByCondition = mapper.getBrandByCondition(map);
        List<Brand> brandByConditionSingle = mapper.getBrandByConditionSingle(brand);
        System.out.println(brandByConditionSingle);
    }

    @Test
    public void testAdd() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = new Brand();
        brand.setBrandName("菠萝手机");
        brand.setCompanyName("菠萝公司");
        brand.setDescription("美国有苹果，中国有菠萝，菠萝手机");
        brand.setOrdered(1);
        brand.setStatus(4);
        mapper.add(brand);
        // 提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testAdd2() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = new Brand();
        brand.setBrandName("菠萝手机");
        brand.setCompanyName("菠萝公司");
        brand.setDescription("美国有苹果，中国有菠萝，菠萝手机");
        brand.setOrdered(1);
        brand.setStatus(4);
        mapper.add(brand);
        System.out.println(brand.getId());
        // 提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testUpdate() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        Brand brand = new Brand();
        brand.setId(8);
//        brand.setBrandName("菠萝手机11");
//        brand.setCompanyName("菠萝公司11");
//        brand.setDescription("美国有苹果，中国有菠萝，菠萝手机111");
//        brand.setOrdered(100);
        brand.setStatus(9000);
        int i = mapper.updateBrand(brand);
        System.out.println(i);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testDeleteSingle() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        int id = 9;
        mapper.deleteById(id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testDeleteMultiple() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        mapper.deleteByIds(new int[]{5, 6, 7, 8});
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectById() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getById("2");
        System.out.println(user);
    }
}
