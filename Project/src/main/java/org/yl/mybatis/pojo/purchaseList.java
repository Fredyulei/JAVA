package org.yl.mybatis.pojo;

public class purchaseList {
	 private Integer id;

	    private String purchaseId;

	    private String materialsId;

	    private String number;

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getPurchaseId() {
	        return purchaseId;
	    }

	    public void setPurchaseId(String purchaseId) {
	        this.purchaseId = purchaseId == null ? null : purchaseId.trim();
	    }

	    public String getMaterialsId() {
	        return materialsId;
	    }

	    public void setMaterialsId(String materialsId) {
	        this.materialsId = materialsId == null ? null : materialsId.trim();
	    }

	    public String getNumber() {
	        return number;
	    }

	    public void setNumber(String number) {
	        this.number = number == null ? null : number.trim();
	    }
}
