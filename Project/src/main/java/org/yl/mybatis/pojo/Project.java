package org.yl.mybatis.pojo;

public class Project {
	 private Integer id;

	    private Integer code;

	    private String name;

	    private String time;

	    private String developmentOrganization;

	    private String firstParty;

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public Integer getCode() {
	        return code;
	    }

	    public void setCode(Integer code) {
	        this.code = code;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name == null ? null : name.trim();
	    }

	    public String getTime() {
	        return time;
	    }

	    public void setTime(String time) {
	        this.time = time == null ? null : time.trim();
	    }

	    public String getDevelopmentOrganization() {
	        return developmentOrganization;
	    }

	    public void setDevelopmentOrganization(String developmentOrganization) {
	        this.developmentOrganization = developmentOrganization == null ? null : developmentOrganization.trim();
	    }

	    public String getFirstParty() {
	        return firstParty;
	    }

	    public void setFirstParty(String firstParty) {
	        this.firstParty = firstParty == null ? null : firstParty.trim();
	    }
}
