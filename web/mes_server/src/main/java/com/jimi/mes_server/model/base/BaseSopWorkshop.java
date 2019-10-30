package com.jimi.mes_server.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSopWorkshop<M extends BaseSopWorkshop<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setWorkshopNumber(java.lang.String workshopNumber) {
		set("workshop_number", workshopNumber);
		return (M)this;
	}
	
	public java.lang.String getWorkshopNumber() {
		return getStr("workshop_number");
	}

	public M setWorkshopName(java.lang.String workshopName) {
		set("workshop_name", workshopName);
		return (M)this;
	}
	
	public java.lang.String getWorkshopName() {
		return getStr("workshop_name");
	}

	public M setFactoryId(java.lang.Integer factoryId) {
		set("factory_id", factoryId);
		return (M)this;
	}
	
	public java.lang.Integer getFactoryId() {
		return getInt("factory_id");
	}

}