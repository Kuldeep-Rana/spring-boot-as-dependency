package com.transaction.demo.interceptor;

public class TransactionDTO {

    private String transactionId;
    private Object connection;

    public TransactionDTO(String transactionId, Object connection) {
        this.transactionId = transactionId;
        this.connection = connection;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Object getConnection() {
        return connection;
    }

    public void setConnection(Object connection) {
        this.connection = connection;
    }

    @Override
    public String toString() {
        return "TransactionDTO{" +
                "transactionId='" + transactionId + '\'' +
                ", connection=" + connection +
                '}';
    }
}
