package cn.caixiaobai.study.result;

/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2021/03/05
 * time: 16:06
 * describe(描述):
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
public class ResultVo {
    //状态码
    private Integer code;
    private String message;
    private Object obj;

    public static ResultVo make(Integer code,String message,Object obj){
        return new ResultVo(code,message,obj);
    }

    /**
     * 操作成功方法,不带参数
     * @return
     */
    public static ResultVo success(){
        return  new ResultVo(null);
    }


    public ResultVo(Integer code,String message,Object obj){
        this.code=code;
        this.message=message;
        this.obj=obj;
    }

    public ResultVo(Object obj){
        this.code=200;
        this.message="操作成功！";
        this.obj=obj;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
