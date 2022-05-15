package com.transaction.demo.interceptor;

import org.springframework.core.annotation.Order;
import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Order(0)
public class TransactionInterceptor implements HandlerInterceptor {

    private ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

        String trxId = request.getHeader("trx_id");
        if(trxId == null || trxId.isEmpty()){
            System.out.println("Transaction id is null create a new connection object ...");
            TransactionDTO dto = new TransactionDTO("12345678", "Connection Object");
            Map<String, Object> data = new HashMap<>();
            data.put(dto.getTransactionId(),dto);
            threadLocal.set(data);
            System.out.println("Transaction data in thread local  "+data);
        }else{
            Map<String, Object> data = threadLocal.get();
            System.out.println("Transaction id is available  data is "+data);
        }
        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           @Nullable ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception exception) throws Exception {

    }

}
