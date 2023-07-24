package com.ruoyi.system.service;

import com.ruoyi.system.domain.Dorm;

import java.util.List;

/**
 * 宿舍信息Service接口
 *
 * @author ruoyi
 * @date 2023-04-25
 */
public interface IDormService {
    /**
     * 查询宿舍信息
     *
     * @param id 宿舍信息主键
     * @return 宿舍信息
     */
    public Dorm selectDormById(String id);

    /**
     * 查询宿舍信息列表
     *
     * @param dorm 宿舍信息
     * @return 宿舍信息集合
     */
    public List<Dorm> selectDormList(Dorm dorm);

    /**
     * 新增宿舍信息
     *
     * @param dorm 宿舍信息
     * @return 结果
     */
    public int insertDorm(Dorm dorm);

    /**
     * 修改宿舍信息
     *
     * @param dorm 宿舍信息
     * @return 结果
     */
    public int updateDorm(Dorm dorm);

    /**
     * 批量删除宿舍信息
     *
     * @param ids 需要删除的宿舍信息主键集合
     * @return 结果
     */
    public int deleteDormByIds(String ids);

    /**
     * 删除宿舍信息信息
     *
     * @param id 宿舍信息主键
     * @return 结果
     */
    public int deleteDormById(String id);
}
