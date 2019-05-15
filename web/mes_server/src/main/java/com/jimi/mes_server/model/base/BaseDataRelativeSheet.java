package com.jimi.mes_server.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseDataRelativeSheet<M extends BaseDataRelativeSheet<M>> extends Model<M> implements IBean {

	public M setSN(java.lang.String SN) {
		set("SN", SN);
		return (M)this;
	}
	
	public java.lang.String getSN() {
		return getStr("SN");
	}

	public M setIMEI1(java.lang.String IMEI1) {
		set("IMEI1", IMEI1);
		return (M)this;
	}
	
	public java.lang.String getIMEI1() {
		return getStr("IMEI1");
	}

	public M setIMEI2(java.lang.String IMEI2) {
		set("IMEI2", IMEI2);
		return (M)this;
	}
	
	public java.lang.String getIMEI2() {
		return getStr("IMEI2");
	}

	public M setIMEI3(java.lang.String IMEI3) {
		set("IMEI3", IMEI3);
		return (M)this;
	}
	
	public java.lang.String getIMEI3() {
		return getStr("IMEI3");
	}

	public M setIMEI4(java.lang.String IMEI4) {
		set("IMEI4", IMEI4);
		return (M)this;
	}
	
	public java.lang.String getIMEI4() {
		return getStr("IMEI4");
	}

	public M setIMEI5(java.lang.String IMEI5) {
		set("IMEI5", IMEI5);
		return (M)this;
	}
	
	public java.lang.String getIMEI5() {
		return getStr("IMEI5");
	}

	public M setIMEI6(java.lang.String IMEI6) {
		set("IMEI6", IMEI6);
		return (M)this;
	}
	
	public java.lang.String getIMEI6() {
		return getStr("IMEI6");
	}

	public M setIMEI7(java.lang.String IMEI7) {
		set("IMEI7", IMEI7);
		return (M)this;
	}
	
	public java.lang.String getIMEI7() {
		return getStr("IMEI7");
	}

	public M setIMEI8(java.lang.String IMEI8) {
		set("IMEI8", IMEI8);
		return (M)this;
	}
	
	public java.lang.String getIMEI8() {
		return getStr("IMEI8");
	}

	public M setIMEI9(java.lang.String IMEI9) {
		set("IMEI9", IMEI9);
		return (M)this;
	}
	
	public java.lang.String getIMEI9() {
		return getStr("IMEI9");
	}

	public M setIMEI10(java.lang.String IMEI10) {
		set("IMEI10", IMEI10);
		return (M)this;
	}
	
	public java.lang.String getIMEI10() {
		return getStr("IMEI10");
	}

	public M setIMEI11(java.lang.String IMEI11) {
		set("IMEI11", IMEI11);
		return (M)this;
	}
	
	public java.lang.String getIMEI11() {
		return getStr("IMEI11");
	}

	public M setIMEI12(java.lang.String IMEI12) {
		set("IMEI12", IMEI12);
		return (M)this;
	}
	
	public java.lang.String getIMEI12() {
		return getStr("IMEI12");
	}

	public M setIMEI13(java.lang.String IMEI13) {
		set("IMEI13", IMEI13);
		return (M)this;
	}
	
	public java.lang.String getIMEI13() {
		return getStr("IMEI13");
	}

	public M setZhiDan(java.lang.String ZhiDan) {
		set("ZhiDan", ZhiDan);
		return (M)this;
	}
	
	public java.lang.String getZhiDan() {
		return getStr("ZhiDan");
	}

	public M setTestTime(java.util.Date TestTime) {
		set("TestTime", TestTime);
		return (M)this;
	}
	
	public java.util.Date getTestTime() {
		return get("TestTime");
	}

	public M setMaskFromV2(byte[] MaskFromV2) {
		set("_MASK_FROM_V2", MaskFromV2);
		return (M)this;
	}
	
	public byte[] getMaskFromV2() {
		return get("_MASK_FROM_V2");
	}

	public M setSimEffectiveDate(java.lang.String SimEffectiveDate) {
		set("SimEffectiveDate", SimEffectiveDate);
		return (M)this;
	}
	
	public java.lang.String getSimEffectiveDate() {
		return getStr("SimEffectiveDate");
	}

}
