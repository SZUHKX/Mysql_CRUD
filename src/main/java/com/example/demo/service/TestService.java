package com.example.demo.service;

import com.example.demo.db.entity.Ta1;
import com.example.demo.db.mapper.Ta1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    Ta1Mapper ta1Mapper;

    public void insertRecord(Ta1 ta1){
        ta1Mapper.insert(ta1);
    }

    public void insertSeletive(Ta1 ta1){
        ta1Mapper.insertSelective(ta1);
    }

    public Ta1 selectByPrimaryKey(int id){
        return ta1Mapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKey(Ta1 ta1){
        return ta1Mapper.updateByPrimaryKey(ta1);
    }

    public int updateByPrimaryKeySelective(Ta1 ta1){
        return ta1Mapper.updateByPrimaryKeySelective(ta1);
    }


}
