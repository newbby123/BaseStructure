package base.common.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel
public class ResultValue<T> implements Serializable {
    private static final long serialVersionUID = 8960474786737581150L;

    @ApiModelProperty(value = "错误码",dataType="Integer",name="错误码")
    private Integer code;

    @ApiModelProperty(value = "提示信息",dataType="String",name="提示信息")
    private String msg;

    @ApiModelProperty(value = "具体内容",dataType="String",name="具体内容")
    private T data;
}
