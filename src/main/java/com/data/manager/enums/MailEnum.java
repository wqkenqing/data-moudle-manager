package com.data.manager.enums;

/**
 * @author wqkenqing
 * @emai wqkenqingto@163.com
 * @time 2020/2/18
 * @desc
 */
public enum MailEnum {
    /**
     * 接收人一
     */
    RECIEVER_ONE("wqkenqingto@163.com");

    MailEnum(String recieve) {
        this.recieve = recieve;
    };

    public String getRecieve() {
        return recieve;
    }

    public void setRecieve(String recieve) {
        this.recieve = recieve;
    }

    private String recieve;
}
