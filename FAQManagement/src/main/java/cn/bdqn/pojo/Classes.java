package cn.bdqn.pojo;

/**
 * 类别信息表
 * @author win
 *
 */
public class Classes {

	public Classes() {
		super();
	}
	public Classes(Integer id, String cname) {
		super();
		this.id = id;
		this.cname = cname;
	}
	private Integer id      ;
	private String  cname   ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	

}
