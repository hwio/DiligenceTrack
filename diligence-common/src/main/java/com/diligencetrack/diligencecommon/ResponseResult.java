package com.diligencetrack.diligencecommon;

/**
 * Created by admin on 2019/2/18.
 */
public class ResponseResult {
    /**
     * 返回code：成功
     */
    public final static int SUCCESSCODE = 1;

    /**
     * 返回code：失败
     */
    public final static int FAILURECODE = 0;

    private int code;
    private String msg;
    private Object data;

    @Override
    public String toString() {
        return "ResponseResult [code=" + code + ", msg=" + msg + ", data=" + data + "]";
    }

    public ResponseResult(int code, String msg, Object data) {
        super();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseResult(int code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public ResponseResult(int code) {
        super();
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
