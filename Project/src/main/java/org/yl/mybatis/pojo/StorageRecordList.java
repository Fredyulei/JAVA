package org.yl.mybatis.pojo;

public class StorageRecordList {
	 private Integer id;

	    private String storageRecordId;

	    private String materialsId;

	    private String number;

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getStorageRecordId() {
	        return storageRecordId;
	    }

	    public void setStorageRecordId(String storageRecordId) {
	        this.storageRecordId = storageRecordId == null ? null : storageRecordId.trim();
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
