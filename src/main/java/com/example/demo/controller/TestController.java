package com.example.demo.controller;

import com.example.demo.db.entity.Ta1;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(value ="/save", method = RequestMethod.POST)
    @ResponseBody
    public String save(Ta1 ta1) {
        testService.insertRecord(ta1);
        return "保存成功！";
    }

    @RequestMapping(value ="/saveSeletive", method = RequestMethod.POST)
    @ResponseBody
    public String saveSeletive(Ta1 ta1) {
        testService.insertSeletive(ta1);
        return "保存成功！";
    }

    @RequestMapping(value ="/selectByPrimaryId", method = RequestMethod.POST)
    @ResponseBody
    public Ta1 selectByPrimaryId(int id) {

        return testService.selectByPrimaryKey(id);
    }

    @RequestMapping(value ="/updateByPrimaryKey", method = RequestMethod.POST)
    @ResponseBody
    public int updateByPrimaryKey(Ta1 ta1) {

        return testService.updateByPrimaryKey(ta1);
    }

    @RequestMapping(value ="/updateByPrimaryKeySelective", method = RequestMethod.POST)
    @ResponseBody
    public int updateByPrimaryKeySelective(Ta1 ta1) {

        return testService.updateByPrimaryKeySelective(ta1);
    }


}
