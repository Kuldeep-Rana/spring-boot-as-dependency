package com.transaction.demo.interceptor;

import java.util.Map;

public class TransactionLocal {

    private static TransactionLocal local = new TransactionLocal();
    private ThreadLocal<Map<String, TransactionDTO>> threadLocal = new ThreadLocal();

    private TransactionLocal(){

    }

    public static TransactionLocal getInstance(){
        return local;
    }

    public void setTransaction(Map<String, TransactionDTO> transaction){
        threadLocal.set(transaction);
    }

    public Map<String, TransactionDTO> getTransaction(){
        return threadLocal.get();
    }


}
