package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.Brand;

import java.util.List;
import java.util.Map;

/**
 * @author qilin
 */
public interface BrandMapper {
    /**
     * 查询所有
     */
    public List<Brand> selectAll();

    public List<Brand> getBrandById(int id);

    /**
     * 条件查询
     * 参数接收
     * 1. 散装参数：如果方法中有多个参数，需要使用@Param("SQL参数占位符")
     * 2. 对象参数：对象属性名称要和参数占位符一致
     * 3. map 集合参数
     *
     * @param status
     * @param companyName
     * @param brandName
     * @return List<Brand>
     */
    // public List<Brand> getBrandByCondition(@Param("brandName") String brandName, @Param("companyName") String companyName, @Param("status") int status);
    // public List<Brand> getBrandByCondition(Brand brand);
    public List<Brand> getBrandByCondition(Map map);

    /**
     * 单条件动态查询
     *
     * @param brand
     * @return List<Brand>
     */
    public List<Brand> getBrandByConditionSingle(Brand brand);

    /**
     * 添加数据
     */
    public void add(Brand brand);

    /**
     * 修改数据
     *
     * @return affected columns
     */
    public int updateBrand(Brand brand);

    /**
     * 删除数据
     * @param id
     * @return
     * */
    public void deleteById(int id);

    /**
     * 批量删除数据
     * @param ids
     * */
    public void deleteByIds(@Param("ids") int[] ids);
}
