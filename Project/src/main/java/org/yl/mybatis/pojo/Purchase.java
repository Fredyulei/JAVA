package org.yl.mybatis.pojo;

public class Purchase {
	 private Integer id;

	    private String code;

	    private String describe;

	    private String projectId;

	    private String status;

	    private String mender;

	    private String lastTime;
	    private purchaseOrders orders;
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

		public purchaseOrders getOrders() {
			return orders;
		}

		public void setOrders(purchaseOrders orders) {
			this.orders = orders;
		}
}
