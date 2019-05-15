package com.jimi.mes_server.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseWebUserType<M extends BaseWebUserType<M>> extends Model<M> implements IBean {

	public M setTypeId(java.lang.Integer TypeId) {
		set("TypeId", TypeId);
		return (M)this;
	}
	
	public java.lang.Integer getTypeId() {
		return getInt("TypeId");
	}

	public M setTypeName(java.lang.String TypeName) {
		set("TypeName", TypeName);
		return (M)this;
	}
	
	public java.lang.String getTypeName() {
		return getStr("TypeName");
	}

	public M setTypeDes(java.lang.String TypeDes) {
		set("TypeDes", TypeDes);
		return (M)this;
	}
	
	public java.lang.String getTypeDes() {
		return getStr("TypeDes");
	}

	public M setMaskFromV2(byte[] MaskFromV2) {
		set("_MASK_FROM_V2", MaskFromV2);
		return (M)this;
	}
	
	public byte[] getMaskFromV2() {
		return get("_MASK_FROM_V2");
	}

}
