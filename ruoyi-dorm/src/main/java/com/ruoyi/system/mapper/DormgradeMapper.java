package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Dormgrade;

/**
 * 宿舍卫生Mapper接口
 * 
 * @author ruoyi
 * @date 2023-04-26
 */
public interface DormgradeMapper 
{
    /**
     * 查询宿舍卫生
     * 
     * @param id 宿舍卫生主键
     * @return 宿舍卫生
     */
    public Dormgrade selectDormgradeById(String id);

    /**
     * 查询宿舍卫生列表
     * 
     * @param dormgrade 宿舍卫生
     * @return 宿舍卫生集合
     */
    public List<Dormgrade> selectDormgradeList(Dormgrade dormgrade);

    /**
     * 新增宿舍卫生
     * 
     * @param dormgrade 宿舍卫生
     * @return 结果
     */
    public int insertDormgrade(Dormgrade dormgrade);

    /**
     * 修改宿舍卫生
     * 
     * @param dormgrade 宿舍卫生
     * @return 结果
     */
    public int updateDormgrade(Dormgrade dormgrade);

    /**
     * 删除宿舍卫生
     * 
     * @param id 宿舍卫生主键
     * @return 结果
     */
    public int deleteDormgradeById(String id);

    /**
     * 批量删除宿舍卫生
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDormgradeByIds(String[] ids);
}
