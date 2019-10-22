package vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.Instant;
import java.time.ZonedDateTime;

/**
 * @package: com.zjbdos.springcloud.common.core.vo
 * @description: ResponseResult
 * @author: zhupengfei
 * @date: 2019-09-12 01:24
 **/
@ApiModel(description = "rest请求的返回模型，所有rest正常都返回该类的对象")
public class ResponseResult<T> implements Serializable {

    public static final String SUCCESSFUL_CODE = "000000";
    public static final String SUCCESSFUL_MESG = "处理成功";

    @ApiModelProperty(value = "处理结果code", required = true)
    private String code;
    @ApiModelProperty(value = "处理结果描述信息")
    private String msg;
    @ApiModelProperty(value = "请求结果生成时间戳")
    private Instant timestamp;
    @ApiModelProperty(value = "处理结果数据信息")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;


    public ResponseResult() {
        this.timestamp = ZonedDateTime.now().toInstant();
    }



    public ResponseResult(String code, String message){
        this.code = code;
        this.msg = message;
    }

    public ResponseResult(  String message){
        this.code = code;
        this.msg = message;
    }
    public ResponseResult(T data) {
        this.code = SUCCESSFUL_CODE;
        this.msg = SUCCESSFUL_MESG;
        this.data = data;
    }

    /**
     * 内部使用，用于构造成功的结果
     *
     * @param code 编码
     * @param mesg 异常信息
     * @param data 数据
     */
    private ResponseResult(String code, String mesg, T data) {
        this.code = code;
        this.msg = mesg;
        this.data = data;
        this.timestamp = ZonedDateTime.now().toInstant();
    }

    /**
     * 快速创建成功结果并返回结果数据
     *
     * @param data 数据
     * @return ResponseResult
     */
    public static <T> ResponseResult<T> success(T data) {
        return new ResponseResult<>(SUCCESSFUL_CODE, SUCCESSFUL_MESG, data);
    }


    /**
     * 快速创建成功结果
     *
     * @return ResponseResult
     */
    public static ResponseResult success() {
        return success(null);
    }
    public static ResponseResult fail(String message) {
        return success(null);
    }

    /**
     * 成功code=000000
     *
     * @return true/false
     */
    @JsonIgnore
    public boolean isSuccess() {
        return SUCCESSFUL_CODE.equals(this.code);
    }

    /**
     * 失败
     *
     * @return true/false
     */
    @JsonIgnore
    public boolean isFail() {
        return !isSuccess();
    }

    public static String getSuccessfulCode() {
        return SUCCESSFUL_CODE;
    }

    public static String getSuccessfulMesg() {
        return SUCCESSFUL_MESG;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
