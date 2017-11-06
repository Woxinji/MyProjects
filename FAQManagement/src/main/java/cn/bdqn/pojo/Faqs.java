package cn.bdqn.pojo;

import java.util.Date;

/**
 * TODO(常见问题表）
 * @author win
 *
 */
public class Faqs {

	
	
	
	
	public Faqs() {
		super();
	}
	private Integer	id            ;  
	private String 	title         ;  
	private Date createdate       ;  
	private String 	content       ;  
	public Integer 	classid       ;
	
	public String cname;//类别名称
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getClassid() {
		return classid;
	}
	public void setClassid(Integer classid) {
		this.classid = classid;
	}  
	
	
}
