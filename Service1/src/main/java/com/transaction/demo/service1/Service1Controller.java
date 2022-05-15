package com.transaction.demo.service1;

import com.transaction.demo.interceptor.TransactionDTO;
import com.transaction.demo.interceptor.TransactionLocal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("service1/v1")
public class Service1Controller {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/bye")
    public String bye(@RequestHeader String trx_id){
        Map<String, TransactionDTO> transaction = TransactionLocal.getInstance().getTransaction();
        System.out.println("transaction "+transaction);
        TransactionDTO transactionDTO  = transaction.get(trx_id);
        System.out.println("transactionDTO "+transactionDTO);
        return "Bye Bye !";

    }
}
