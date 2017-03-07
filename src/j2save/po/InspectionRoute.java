/**   
 * Copyright © 2015 北京恒泰实达科技发展有限公司. All rights reserved.
 * 项目名称： 垃圾发电项目
 * 描述信息: 
 * 创建日期：2015-09-26
 * @author  王胜强
 * @version 
*/
package j2save.po;

/***
 * 巡检路线方案-JavaBean
 */
//@Entity
//@Table(name = "inspection_route")
public class InspectionRoute{

    /***
     * 循环字段，生成对应的属性
     */
	private java.lang.String rid;
	private java.lang.String rname;//
	private java.lang.String stationName;//岗位名称
	private java.lang.Integer orderNum;//序号
	private java.lang.String ptitleId;//
	//方便巡检路线查询
	private java.lang.String rAreaName;//
	private java.lang.String rEname;//
	private java.lang.String rElementname;//
	private java.lang.String rElementcontent;//
    	
    /***
     * 生成对应的getter和setter方法
     */
//	@Id
//	@GeneratedValue(generator = "system-uuid")
//	@GenericGenerator(name = "system-uuid", strategy = "uuid")
//	@Column(name = "r_id",length = 32)
	public java.lang.String getRid() {
		return rid;
	}
	public void setRid(java.lang.String rid) {
		this.rid = rid;
	}
	
	
//	@Column(name = "r_name",length = 200)
	public java.lang.String getRname() {
	    return this.rname;
	}
	public void setRname(java.lang.String value) {
	    this.rname = value;
	}
//	@Column(name = "order_num",length = 10)
	public java.lang.Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(java.lang.Integer orderNum) {
		this.orderNum = orderNum;
	}
//	@Column(name = "r_parentid",length = 32)
	public java.lang.String getPtitleId() {
		return ptitleId;
	}
	public void setPtitleId(java.lang.String ptitleId) {
		this.ptitleId = ptitleId;
	}
//	@Column(name = "station_name",length = 100)
	public java.lang.String getStationName() {
		return stationName;
	}
	public void setStationName(java.lang.String stationName) {
		this.stationName = stationName;
	}
	public java.lang.String getrAreaName() {
		return rAreaName;
	}
	public void setrAreaName(java.lang.String rAreaName) {
		this.rAreaName = rAreaName;
	}
	public java.lang.String getrEname() {
		return rEname;
	}
	public void setrEname(java.lang.String rEname) {
		this.rEname = rEname;
	}
	public java.lang.String getrElementname() {
		return rElementname;
	}
	public void setrElementname(java.lang.String rElementname) {
		this.rElementname = rElementname;
	}
	public java.lang.String getrElementcontent() {
		return rElementcontent;
	}
	public void setrElementcontent(java.lang.String rElementcontent) {
		this.rElementcontent = rElementcontent;
	}
}

