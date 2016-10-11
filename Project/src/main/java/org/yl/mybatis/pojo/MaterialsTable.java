package org.yl.mybatis.pojo;

public class MaterialsTable {
	 private Integer id;

	    private String code;

	    private String name;

	    private String model;

	    private String unit;

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

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name == null ? null : name.trim();
	    }

	    public String getModel() {
	        return model;
	    }

	    public void setModel(String model) {
	        this.model = model == null ? null : model.trim();
	    }

	    public String getUnit() {
	        return unit;
	    }

	    public void setUnit(String unit) {
	        this.unit = unit == null ? null : unit.trim();
	    }
}
