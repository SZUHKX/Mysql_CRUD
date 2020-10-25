package com.example.demo.db.mapper;

import com.example.demo.db.entity.Ta1;

public interface Ta1Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ta1 record);

    int insertSelective(Ta1 record);

    Ta1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ta1 record);

    int updateByPrimaryKey(Ta1 record);
}