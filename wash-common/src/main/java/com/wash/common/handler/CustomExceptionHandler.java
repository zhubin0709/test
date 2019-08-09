package com.wash.common.handler;

import com.wash.common.entity.CommonResponse;
import com.wash.common.exception.ParamValidationException;
import com.wash.common.exception.PermissionDeniedException;
import com.wash.common.exception.ResourceNotFoundException;
import com.wash.common.exception.ServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @ProjectName: yitao-parent
 * @Auther: GERRY
 * @Date: 2019/4/14 14:03
 * @Description:
 */
@ControllerAdvice(annotations = ResponseBody.class)
public class CustomExceptionHandler {
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = Exception.class)
    public CommonResponse commonExceptionHandle(Exception e) {
        CommonResponse commonResponse = CommonResponse.createCommonResponse();
        return commonResponse.fail("系统异常:" + e.getMessage());
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    @ExceptionHandler(value = ServiceException.class)
    public CommonResponse serviceExceptionHandle(Exception e) {
        CommonResponse commonResponse = CommonResponse.createCommonResponse();
        return commonResponse.fail("业务异常:" + e.getMessage());
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(value = PermissionDeniedException.class)
    public CommonResponse permissionDeniedExceptionHandle(Exception e) {
        CommonResponse commonResponse = CommonResponse.createCommonResponse();
        return commonResponse.fail("权限不足");
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = {ParamValidationException.class,
            ServletRequestBindingException.class})
    public CommonResponse paramValidationExceptionHandle(Exception e) {
        CommonResponse commonResponse = CommonResponse.createCommonResponse();
        return commonResponse.fail("参数无效异常:" + e.getMessage());
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = {ResourceNotFoundException.class})
    public CommonResponse resourceNotFoundExceptionHandle(Exception e) {
        CommonResponse commonResponse = CommonResponse.createCommonResponse();
        return commonResponse.fail("资源未找到异常:" + e.getMessage());
    }
}
