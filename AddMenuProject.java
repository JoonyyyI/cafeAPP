/**
 * PROJ : 스타벅스 제주 신메뉴 추가 
 * NAME : AddMenuProject.java
 * DESC : 추가할 제주 신메뉴 정보(Data)
 * 
 * @author : 2205_n4_정시준
 */
package model;

public class AddMenuProject {
	
    
    /** 추가될 메뉴 카테고리 **/
    private String addMenuCategory;
    
    /** 추가될 메뉴 **/
    private String addMenu;
    
    /** 판매될 카페 장소 **/
    private Cafe addCafeLocation;
    
    /** 판매될 카페에서 가장 많이 팔리는 메뉴 **/
    private CafeMenu topSellingCafeMenu; 
    
    /** 프로젝트 시작일 **/
    private String startDate;
    
    /** 프로젝트 종료일 **/
    private String endDate;
    
    /** 진행되는 project의 상세 내용 **/
    private String addMenuProjectDetail;
    
    public AddMenuProject() {
    	super();
    }
    public AddMenuProject(String addMenuCategory, String addMenu, Cafe addCafeLocation, CafeMenu topSellingCafeMenu, 
    		String startDate, String endDate, String addMenuProjectDetail) {
    	super();
    	this.addMenuCategory = addMenuCategory;
    	this.addMenu = addMenu;
    	this.addCafeLocation = addCafeLocation;
    	this.topSellingCafeMenu = topSellingCafeMenu;
    	this.startDate = startDate;
    	this.endDate = endDate;
    	this.addMenuProjectDetail = addMenuProjectDetail;
    }
    
    public String getAddMenuCategory() {
    	return addMenuCategory;
    }
    
    public void setAddMenuCategory() {
    	this.addMenuCategory = addMenuCategory;
    }
    
    public String getAddMenu() {
    	return addMenu;
    }
    
    public void setAddMenu() {
    	this.addMenu = addMenu;
    }
    
    public Cafe getAddCafeLocation() {
    	return addCafeLocation;
    }
    
    public void setAddCafeLocation() {
    	this.addCafeLocation = addCafeLocation;
    }
    
    public CafeMenu getTopSellingCafeMenu() {
    	return topSellingCafeMenu;
    }
    
    public void setTopSellingCafeMenu() {
    	this.topSellingCafeMenu = topSellingCafeMenu;
    }
    
    public String getStartDate() {
    	return startDate;
    }
    
    public void setStartDate() {
    	this.startDate = startDate;
    }
    
    public String getEndDate() {
    	return endDate;    	
    }
    
    public void setEndDate() {
    	this.endDate = endDate;
    }
    
    public String getAddMenuProjectDetail() {
    	return addMenuProjectDetail;
    }
    
    public void setAddMenuProjectDetail() {
    	this.addMenuProjectDetail = addMenuProjectDetail;
    }
    
    @Override
    public String toString() {
    	StringBuilder builder = new StringBuilder();
        builder.append("추가될 메뉴 카테고리 : ");
        builder.append(addMenuCategory);
        builder.append("\n");
        
     	builder.append("추가될 메뉴 : ");
        builder.append(addMenu);
        builder.append("\n");
        
        builder.append("판매되는 카페 : ");
        builder.append(addCafeLocation);
        builder.append("\n");
        
        builder.append("카페에서 가장 많이 팔리는 메뉴 : ");
        builder.append(topSellingCafeMenu);
        builder.append("\n");
        
        builder.append("메뉴 추가일 : ");
        builder.append(startDate);
        builder.append("\n");
        
        builder.append("메뉴 추가 종료일");
        builder.append(endDate);
        builder.append("\n");
        
        builder.append("추가되는 프로젝트 상세 내용 : ");
        builder.append(addMenuProjectDetail);
        builder.append("\n");
        return builder.toString();
    }
    

}
