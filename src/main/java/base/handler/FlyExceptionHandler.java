package base.handler;

import base.common.ResultBuilder;
import base.common.entity.ResultValue;
import base.exception.FlyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class FlyExceptionHandler {
    @ExceptionHandler(value = FlyException.class)
    @ResponseBody
    public ResultValue handlerFlyException(FlyException e) {
        return ResultBuilder.error(e.getCode(), e.getMessage());
    }
}
