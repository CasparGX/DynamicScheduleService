package ssm.model;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by Caspar on 2017/3/23.
 */
public class Result {
    public String msg;
    public String code;
    public Object data;

    public Result success(Object data) {
        this.msg = "OK";
        this.code = "200";
        this.data = data!=null? data : new JSONObject();
        return this;
    }
}
