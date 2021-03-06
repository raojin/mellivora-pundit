package com.mellivora.pundit.mapper;

import com.mellivora.pundit.entity.MiShop;

import java.util.List;

public interface MiShopMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mi_shop
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mi_shop
     *
     * @mbg.generated
     */
    int insert(MiShop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mi_shop
     *
     * @mbg.generated
     */
    int insertSelective(MiShop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mi_shop
     *
     * @mbg.generated
     */
    MiShop selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mi_shop
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MiShop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mi_shop
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(MiShop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mi_shop
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MiShop record);

    List findAllShop();
}