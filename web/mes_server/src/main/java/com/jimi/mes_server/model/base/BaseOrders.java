package com.jimi.mes_server.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseOrders<M extends BaseOrders<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setZhidan(java.lang.String zhidan) {
		set("zhidan", zhidan);
		return (M)this;
	}
	
	public java.lang.String getZhidan() {
		return getStr("zhidan");
	}

	public M setAlias(java.lang.String alias) {
		set("alias", alias);
		return (M)this;
	}
	
	public java.lang.String getAlias() {
		return getStr("alias");
	}

	public M setSoftModel(java.lang.String softModel) {
		set("soft_model", softModel);
		return (M)this;
	}
	
	public java.lang.String getSoftModel() {
		return getStr("soft_model");
	}

	public M setVersion(java.lang.String version) {
		set("version", version);
		return (M)this;
	}
	
	public java.lang.String getVersion() {
		return getStr("version");
	}

	public M setProductNo(java.lang.String productNo) {
		set("product_no", productNo);
		return (M)this;
	}
	
	public java.lang.String getProductNo() {
		return getStr("product_no");
	}

	public M setCustomerNumber(java.lang.String customerNumber) {
		set("customer_number", customerNumber);
		return (M)this;
	}
	
	public java.lang.String getCustomerNumber() {
		return getStr("customer_number");
	}

	public M setCustomerName(java.lang.String customerName) {
		set("customer_name", customerName);
		return (M)this;
	}
	
	public java.lang.String getCustomerName() {
		return getStr("customer_name");
	}

	public M setOrderDate(java.util.Date orderDate) {
		set("order_date", orderDate);
		return (M)this;
	}
	
	public java.util.Date getOrderDate() {
		return get("order_date");
	}

	public M setQuantity(java.lang.Integer quantity) {
		set("quantity", quantity);
		return (M)this;
	}
	
	public java.lang.Integer getQuantity() {
		return getInt("quantity");
	}

	public M setDeliveryDate(java.util.Date deliveryDate) {
		set("delivery_date", deliveryDate);
		return (M)this;
	}
	
	public java.util.Date getDeliveryDate() {
		return get("delivery_date");
	}

	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}
	
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	public M setOrderStatus(java.lang.Integer orderStatus) {
		set("order_status", orderStatus);
		return (M)this;
	}
	
	public java.lang.Integer getOrderStatus() {
		return getInt("order_status");
	}

	public M setDeleteReason(java.lang.String deleteReason) {
		set("delete_reason", deleteReason);
		return (M)this;
	}
	
	public java.lang.String getDeleteReason() {
		return getStr("delete_reason");
	}

	public M setOrderCreator(java.lang.Integer orderCreator) {
		set("order_creator", orderCreator);
		return (M)this;
	}
	
	public java.lang.Integer getOrderCreator() {
		return getInt("order_creator");
	}

	public M setOrderCreateTime(java.util.Date orderCreateTime) {
		set("order_create_time", orderCreateTime);
		return (M)this;
	}
	
	public java.util.Date getOrderCreateTime() {
		return get("order_create_time");
	}

	public M setOrderModifier(java.lang.Integer orderModifier) {
		set("order_modifier", orderModifier);
		return (M)this;
	}
	
	public java.lang.Integer getOrderModifier() {
		return getInt("order_modifier");
	}

	public M setOrderModifyTime(java.util.Date orderModifyTime) {
		set("order_modify_time", orderModifyTime);
		return (M)this;
	}
	
	public java.util.Date getOrderModifyTime() {
		return get("order_modify_time");
	}

	public M setIsRework(java.lang.Boolean isRework) {
		set("is_rework", isRework);
		return (M)this;
	}
	
	public java.lang.Boolean getIsRework() {
		return get("is_rework");
	}

	public M setDeletePerson(java.lang.Integer deletePerson) {
		set("delete_person", deletePerson);
		return (M)this;
	}
	
	public java.lang.Integer getDeletePerson() {
		return getInt("delete_person");
	}

	public M setDeleteTime(java.util.Date deleteTime) {
		set("delete_time", deleteTime);
		return (M)this;
	}
	
	public java.util.Date getDeleteTime() {
		return get("delete_time");
	}

}