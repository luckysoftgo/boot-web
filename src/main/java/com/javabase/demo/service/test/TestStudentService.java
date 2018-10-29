package com.javabase.demo.service.test;

import com.javabase.demo.entity.test.TestStudent;
import com.application.base.common.page.Pagination;
import java.util.List;
import java.util.Map;


/**
*@desc TestStudent表相关Service基础接口.
*@author admin
*/
public interface TestStudentService {

    /**
    * 添加对象。
    * @param testStudent
    * @return
    */
    int saveTestStudent(TestStudent testStudent);

    /**
    * 修改对象
    * @param testStudent
    * @return
    */
    int updateTestStudent(TestStudent testStudent);

    /**
    * 删除对象
    * @param testStudent
    * @return
    */
    int deleteTestStudent(TestStudent testStudent);

    /**
    * 根据唯一条件查询
    * @param param
    * @return
    */
    TestStudent queryTestStudent(Map<String, Object> param);

    /**
    * 查询满足条件的列表
    * @param param
    * @return
    */
    List<TestStudent> queryTestStudents(Map<String, Object> param);

    /**
    * 分頁查询满足条件的列表
    * @param param
    * @return
    */
    List<TestStudent> queryPageTestStudents(Map<String, Object> param);

    /**
    * 按照条件查询总条数
    * @param param
    * @return
    */
    Integer totalCount(Map<String, Object> param);

    /**
    * 分页查询
    *@param param
    *@param pageNo
    *@param pageSize
    * @return
    */
    Pagination<TestStudent> queryPagePagination(Map<String, Object> param, int pageNo, int pageSize);

}
