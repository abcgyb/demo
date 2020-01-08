package com.example.demoshiro.dto;

import java.math.BigDecimal;

/**
 * @ClassName: CashReceiveQmqRequest
 * @Description: 平台到款通知qmq消息请求如入参
 * @Author: GaoYueBin
 * @Date: 2019-10-17 14:30
 * @Version 1.0
 **/
public class CashReceiveQmqRequest {

    /**
     * 收款单号
     */
    private Integer receId;

    /**
     * 结算方式
     */
    private String settlementType;

    /**
     * 到款金额
     */
    private BigDecimal receAmount;

    /**
     * 是否存着被结清批次
     */
    private Boolean wheatherFinish;

    /**
     * 被结清的批次
     */
    private Integer accCheckId;

    /**
     * 被结清的主账户
     */
    private Integer accountId;

    /**
     * 信用额度余额
     */
    private BigDecimal limitedBalance;

    /**
     * 账户余额
     */
    private BigDecimal balance;


}
