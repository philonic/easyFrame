package me.frame.base;

import java.io.Serializable;
import java.util.Date;

import me.frame.utils.StringUtil;
import me.frame.utils.UuidUtil;

public abstract class BaseEntity<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8068148600018663074L;

	public BaseEntity()
	{
		this.isNew = false;
	}
	
	public BaseEntity(String id)
	{
		this.id = id;
		this.isNew = false;
	}
	private String id;
	private boolean isNew;

	private Date createDate;
	private Date updateDate;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public boolean isNew() {
		return StringUtil.isNullOrEmpty(id);
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public void preUpdate()
	{
		updateDate = new Date();
	}
	
	public void preInsert()
	{
		this.id = UuidUtil.uuid();
		createDate = new Date();
	}
}
