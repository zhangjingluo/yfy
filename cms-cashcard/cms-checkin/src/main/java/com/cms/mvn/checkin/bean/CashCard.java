package com.cms.mvn.checkin.bean;

import java.math.BigDecimal;

/**
 * @Author lyd
 * @Date 2019/11/24 10:39
 * @Description 卡档案信息
 */

public class CashCard{

    private String cardNo; //卡号
    private Integer cardType;//卡类型
    private BigDecimal cardDenom;//面额
    private String codeInfo;//条码信息
    private String codeInfoCheck;//条码校验
    private String makingTime;//制卡时间
    private String checkInTime;//入库时间
    private Integer status;//状态
    private String usefulLife;//有效期

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public int getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public BigDecimal getCardDenom() {
        return cardDenom;
    }

    public void setCardDenom(BigDecimal cardDenom) {
        this.cardDenom = cardDenom;
    }

    public String getCodeInfo() {
        return codeInfo;
    }

    public void setCodeInfo(String codeInfo) {
        this.codeInfo = codeInfo == null ? null : codeInfo.trim();
    }

    public String getCodeInfoCheck() {
        return codeInfoCheck;
    }

    public void setCodeInfoCheck(String codeInfoCheck) {
        this.codeInfoCheck = codeInfoCheck == null ? null : codeInfoCheck.trim();
    }

    public String getMakingTime() {
        return makingTime;
    }

    public void setMakingTime(String makingTime) {
        this.makingTime = makingTime == null ? null : makingTime.trim();
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime == null ? null : checkInTime.trim();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUsefulLife() {
        return usefulLife;
    }

    public void setUsefulLife(String usefulLife) {
        this.usefulLife = usefulLife == null ? null : usefulLife.trim();
    }
}
