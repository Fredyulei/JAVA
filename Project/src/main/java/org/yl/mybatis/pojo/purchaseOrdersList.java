package org.yl.mybatis.pojo;

public class purchaseOrdersList {
	 private Integer id;

	    private String purchaseOrdersId;

	    private String materialsId;

	    private String number;

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getPurchaseOrdersId() {
	        return purchaseOrdersId;
	    }

	    public void setPurchaseOrdersId(String purchaseOrdersId) {
	        this.purchaseOrdersId = purchaseOrdersId == null ? null : purchaseOrdersId.trim();
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
