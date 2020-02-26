package base.exception;

import base.enums.ExceptionEnum;
import lombok.Data;

@Data
public class FlyException extends RuntimeException{
    private Integer code;
    private String message;

    public FlyException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMessage());
        this.code = exceptionEnum.getCode();
        this.message = exceptionEnum.getMessage();
    }

    public FlyException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
