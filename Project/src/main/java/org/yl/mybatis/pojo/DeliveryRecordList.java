package org.yl.mybatis.pojo;

public class DeliveryRecordList {
	 private Integer id;

	    private String deliveryRecordId;

	    private String materialsId;

	    private String number;

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getDeliveryRecordId() {
	        return deliveryRecordId;
	    }

	    public void setDeliveryRecordId(String deliveryRecordId) {
	        this.deliveryRecordId = deliveryRecordId == null ? null : deliveryRecordId.trim();
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
