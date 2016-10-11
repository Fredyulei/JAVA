package org.yl.mybatis.pojo;

public class UseList {
	private Integer id;

    private String useId;

    private String materialsId;

    private String number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUseId() {
        return useId;
    }

    public void setUseId(String useId) {
        this.useId = useId == null ? null : useId.trim();
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

	@Override
	public String toString() {
		return "UseList [id=" + id + ", useId=" + useId + ", materialsId=" + materialsId + ", number=" + number + "]";
	}
    
}
