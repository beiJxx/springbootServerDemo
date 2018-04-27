package com.nic.springboot.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "SYSTEM_LOG")
public class SystemLog {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "METHOD")
    private String method;

    @Column(name = "LOG_TYPE")
    private String logType;

    @Column(name = "REQUEST_IP")
    private String requestIp;

    @Column(name = "EXCEPTION_CODE")
    private String exceptionCode;

    @Column(name = "EXCEPTION_DETAIL")
    private String exceptionDetail;

    @Column(name = "PARAMS")
    private String params;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * @return METHOD
     */
    public String getMethod() {
        return method;
    }

    /**
     * @param method
     */
    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    /**
     * @return LOG_TYPE
     */
    public String getLogType() {
        return logType;
    }

    /**
     * @param logType
     */
    public void setLogType(String logType) {
        this.logType = logType == null ? null : logType.trim();
    }

    /**
     * @return REQUEST_IP
     */
    public String getRequestIp() {
        return requestIp;
    }

    /**
     * @param requestIp
     */
    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp == null ? null : requestIp.trim();
    }

    /**
     * @return EXCEPTION_CODE
     */
    public String getExceptionCode() {
        return exceptionCode;
    }

    /**
     * @param exceptionCode
     */
    public void setExceptionCode(String exceptionCode) {
        this.exceptionCode = exceptionCode == null ? null : exceptionCode.trim();
    }

    /**
     * @return EXCEPTION_DETAIL
     */
    public String getExceptionDetail() {
        return exceptionDetail;
    }

    /**
     * @param exceptionDetail
     */
    public void setExceptionDetail(String exceptionDetail) {
        this.exceptionDetail = exceptionDetail == null ? null : exceptionDetail.trim();
    }

    /**
     * @return PARAMS
     */
    public String getParams() {
        return params;
    }

    /**
     * @param params
     */
    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    /**
     * @return USER_ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}