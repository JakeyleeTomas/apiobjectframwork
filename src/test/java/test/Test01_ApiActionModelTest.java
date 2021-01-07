package test;


import com.apiobject.framwork.actions.ApiActionModel;
import com.apiobject.framwork.global.GlobalVariable;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author guji
 * @description 对ApiAction对象实现的单元测试
 * @date 2021/1/6 6:33
 */
public class Test01_ApiActionModelTest {
    public static final Logger logger = LoggerFactory.getLogger(Test01_ApiActionModelTest.class);
    @Test
    void runTest(){
        ArrayList<String> acturalParameter = new ArrayList<>();
        acturalParameter.add("ww08701ecf7ef7ffc5");
        acturalParameter.add("9BBxJMslOULZsy5xrjwo6JC8jjQ7PzmC2w5Q1CwbIok");
        ApiActionModel apiActionModel = new ApiActionModel();
        apiActionModel.setUrl("https://qyapi.weixin.qq.com/cgi-bin/${x}");
        HashMap<String,String> globalVariables = new HashMap<>();
        globalVariables.put("x","gettoken");
        GlobalVariable.setGlobalVariables(globalVariables);
        ArrayList<String> formalParameter = new ArrayList<>();
        formalParameter.add("corpid");
        formalParameter.add("corpsecret");
        apiActionModel.setFormalParam(formalParameter);

        HashMap<String,String> query = new HashMap<>();
        query.put("corpid","${corpid}");
        query.put("corpsecret","${corpsecret}");
        apiActionModel.setQuery(query);
        Response response = apiActionModel.run(acturalParameter);
    }

}
