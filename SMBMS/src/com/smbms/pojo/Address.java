package com.smbms.pojo;

import java.io.Serializable;
import java.util.Date;
/**
 * �û�������ַ
 * @author YangMr
 *
 */
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;//����ID
    private String contact;//��ϵ������
    private String addressDesc;//�ջ���ַ��ϸ
    private String postCode;//�ʱ�
    private String tel;//��ϵ�˵绰
    private Integer createdBy;//������
    private Date creationDate;//����ʱ��
    private Integer modifyBy;//�޸���
    private Date modifyDate;//�޸�ʱ��
    private Integer userId;//�û�ID
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddressDesc() {
		return addressDesc;
	}
	public void setAddressDesc(String addressDesc) {
		this.addressDesc = addressDesc;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Integer getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
}