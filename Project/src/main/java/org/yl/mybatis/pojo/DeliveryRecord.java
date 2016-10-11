package org.yl.mybatis.pojo;

public class DeliveryRecord {
	 private Integer id;

	    private String code;

	    private String describe;

	    private String status;

	    private String mender;

	    private String lastTime;

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getCode() {
	        return code;
	    }

	    public void setCode(String code) {
	        this.code = code == null ? null : code.trim();
	    }

	    public String getDescribe() {
	        return describe;
	    }

	    public void setDescribe(String describe) {
	        this.describe = describe == null ? null : describe.trim();
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status == null ? null : status.trim();
	    }

	    public String getMender() {
	        return mender;
	    }

	    public void setMender(String mender) {
	        this.mender = mender == null ? null : mender.trim();
	    }

	    public String getLastTime() {
	        return lastTime;
	    }

	    public void setLastTime(String lastTime) {
	        this.lastTime = lastTime == null ? null : lastTime.trim();
	    }
}
