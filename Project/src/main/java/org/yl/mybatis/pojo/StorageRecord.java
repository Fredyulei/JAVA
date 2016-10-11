package org.yl.mybatis.pojo;

public class StorageRecord {
	 private Integer id;

	    private String code;

	    private String describe;

	    private String projectId;

	    private String purchaseOrdersId;

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

	    public String getProjectId() {
	        return projectId;
	    }

	    public void setProjectId(String projectId) {
	        this.projectId = projectId == null ? null : projectId.trim();
	    }

	    public String getPurchaseOrdersId() {
	        return purchaseOrdersId;
	    }

	    public void setPurchaseOrdersId(String purchaseOrdersId) {
	        this.purchaseOrdersId = purchaseOrdersId == null ? null : purchaseOrdersId.trim();
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
