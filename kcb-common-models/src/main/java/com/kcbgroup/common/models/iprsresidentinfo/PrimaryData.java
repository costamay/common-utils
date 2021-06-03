/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcbgroup.common.models.iprsresidentinfo;

/**
 *
 * @author jgnjeru
 */
public class PrimaryData {

    /**
     * Serial version UID
     */
    private static final long serialVersionUID = -8478981958316046120L;

    private String businessKey;
    private String businessKeyType;

    public PrimaryData() {
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    public String getBusinessKeyType() {
        return businessKeyType;
    }

    public void setBusinessKeyType(String businessKeyType) {
        this.businessKeyType = businessKeyType;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PrimaryData [businessKey=");
        builder.append(businessKey);
        builder.append(", businessKeyType=");
        builder.append(businessKeyType);
        builder.append("]");
        return builder.toString();
    }
}
