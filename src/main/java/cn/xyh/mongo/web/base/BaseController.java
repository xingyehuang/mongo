package cn.xyh.mongo.web.base;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import cn.xyh.mongo.pojo.SuccessVo;

import javax.servlet.http.HttpServletRequest;


/**
 * controller基类
 *
 * @author hatim
 */
@Slf4j
public class BaseController {
    public ResponseEntity response(Object data, String method) {
        HttpStatus httpStatus = HttpStatus.OK;
        switch (RequestMethod.valueOf(method)) {
            case GET:
            case PUT:
            case PATCH:
            case DELETE:
                httpStatus = HttpStatus.OK;
                break;
            case POST:
                httpStatus = HttpStatus.CREATED;
                break;
            default:
                break;
        }
        return ResponseEntity.status(httpStatus).body(SuccessVo.builder().data(data).build());
    }

    /**
     * 返回值包装
     *
     * @param request
     * @return
     * @deprecated 已废弃，建议使用response(Object data)
     */
    @Deprecated
    public ResponseEntity response(HttpServletRequest request) {
        return response(null, request);
    }

    /**
     * 返回值包装
     *
     * @param data
     * @param request
     * @return
     * @deprecated 已废弃，建议使用response(Object data)
     */
    @Deprecated
    public ResponseEntity response(Object data, HttpServletRequest request) {
        return response(data, request.getMethod());
    }

    public ResponseEntity response(Object data) {
        // 直接从RequestContextHolder获取
        return response(data, ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getMethod());
    }

    public ResponseEntity response() {
        // 直接从RequestContextHolder获取
        return response(null, ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getMethod());
    }

}
