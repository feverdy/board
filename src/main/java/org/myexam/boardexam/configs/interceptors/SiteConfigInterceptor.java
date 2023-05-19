package org.myexam.boardexam.configs.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * 사이트 설정 유지
 *
 */
@Component
public class SiteConfigInterceptor implements HandlerInterceptor {
    // 공통적인 기능을 유지하기 위해 사용
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        request.setAttribute("cssJsVersion", 1);

        return true;
    }
}
