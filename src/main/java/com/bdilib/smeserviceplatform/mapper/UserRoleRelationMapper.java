package com.bdilib.smeserviceplatform.mapper;

import com.bdilib.smeserviceplatform.dao.UserRoleRelation;

public interface UserRoleRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_relation
     *
     * @mbggenerated Mon Jan 13 19:14:30 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_relation
     *
     * @mbggenerated Mon Jan 13 19:14:30 CST 2020
     */
    int insert(UserRoleRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_relation
     *
     * @mbggenerated Mon Jan 13 19:14:30 CST 2020
     */
    int insertSelective(UserRoleRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_relation
     *
     * @mbggenerated Mon Jan 13 19:14:30 CST 2020
     */
    UserRoleRelation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_relation
     *
     * @mbggenerated Mon Jan 13 19:14:30 CST 2020
     */
    int updateByPrimaryKeySelective(UserRoleRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_relation
     *
     * @mbggenerated Mon Jan 13 19:14:30 CST 2020
     */
    int updateByPrimaryKey(UserRoleRelation record);
}