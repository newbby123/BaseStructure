package base.common;


import base.common.entity.ResultValue;

public class ResultBuilder {
    public static ResultValue success(Object object) {
        ResultValue resultValue = new ResultValue();
        resultValue.setData(object);
        resultValue.setCode(200);
        resultValue.setMsg("请求成功");
        return resultValue;
    }

    public static ResultValue success() {
        return success(null);
    }

    public static ResultValue error(Integer code, String msg) {
        ResultValue resultValue = new ResultValue();
        resultValue.setCode(code);
        resultValue.setMsg(msg);
        return resultValue;
    }
}
