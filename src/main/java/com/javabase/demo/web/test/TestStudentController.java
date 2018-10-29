package com.javabase.demo.web.test;

import com.application.base.common.BaseStringUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.application.base.common.web.BaseCommController;
import com.application.base.common.page.Pagination;

import com.javabase.demo.entity.test.TestStudent;
import com.javabase.demo.service.test.TestStudentService;
import java.util.Map;

/**
 * @desc TestStudentController实现
 * @author 孤狼
 */
@RestController
@RequestMapping("/testStudent")
public class TestStudentController extends BaseCommController {

    @Autowired
    private TestStudentService testStudentService;

    /**
    * 添加对象.
    *
    */
    @RequestMapping(value="/addTestStudent",method = { RequestMethod.POST}, produces = "application/json;charset=UTF-8")
    public void addTestStudent(@RequestBody Map<String,Object> param) {
        // 根据实际情况填写.
        TestStudent object = null;
        String resultStr = successResultJSON(object);
        printJsonWriter(response, resultStr);
    }

    /**
    * 通过主键获得对象.
    *
    */
    @RequestMapping(value="/getTestStudentById",method = { RequestMethod.POST}, produces = "application/json;charset=UTF-8")
    public void getTestStudentById(@RequestBody Map<String,Object> param) {
        // 根据实际情况填写.
        Integer id = BaseStringUtil.intValue(param.get("id"));
        //根据实际情况去验证 objId 的类型的合法性。
        TestStudent object = testStudentService.queryTestStudent(param);
        String resultStr = successResultJSON(object);
        printJsonWriter(response, resultStr);
    }


    /**
    * 通过id修改对象.
    *
    */
    @RequestMapping(value="/updateTestStudentById",method = { RequestMethod.POST}, produces = "application/json;charset=UTF-8")
    public void updateTestStudentById(@RequestBody Map<String,Object> param) {
        // 根据实际情况填写.
        Integer id = BaseStringUtil.intValue(param.get("id"));
        //根据实际情况去验证 objId 的类型的合法性。
        printJsonWriter(response, successResultJSON("通过Id="+id+"修改成功"));
    }


    /**
    * 通过Id删除消息
    *
    */
    @RequestMapping(value="/delTestStudentById",method = { RequestMethod.POST}, produces = "application/json;charset=UTF-8")
    public void delTestStudentById(@RequestBody Map<String,Object> param) {
        // 根据实际情况填写.
        Integer id = BaseStringUtil.intValue(param.get("id"));
        //根据实际情况去验证 objId 的类型的合法性。
        printJsonWriter(response, successResultJSON("通过Id="+id+"删除成功"));
    }


    /**
    * 获得所有消息
    *
    */
    @RequestMapping(value="/getTestStudents",method = { RequestMethod.POST}, produces = "application/json;charset=UTF-8")
    public void getTestStudents(@RequestBody Map<String,Object> param) {
        // 根据实际情况填写.
        printJsonWriter(response, successResultJSON(""));
    }

    /**
    * 分页获得消息
    *
    */
    @RequestMapping(value="/getTestStudentsByPage",method = { RequestMethod.POST}, produces = "application/json;charset=UTF-8")
    public void getTestStudentsByPage(@RequestBody Map<String,Object> param) {
        // 根据实际情况填写.
        int pageNo = BaseStringUtil.intValue(param.get(PAGE_NO));
        int pageSize = BaseStringUtil.intValue(param.get(PAGE_SIZE));
        Pagination<TestStudent> result = null;
        printJsonWriter(response, successResultJSON(result));
    }

}


