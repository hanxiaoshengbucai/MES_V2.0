package com.jimi.mes_server.task;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.jfinal.kit.StrKit;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.jimi.mes_server.entity.Constant;
import com.jimi.mes_server.entity.SQL;
import com.jimi.mes_server.model.Dashboard;
import com.jimi.mes_server.model.Orders;

/**保存看板数据任务
 * @author   HCJ
 * @date     2019年8月1日 上午9:36:28
 */
public class SaveDataTask implements Runnable {

	/**
	 * DEFAULT_NUMBER : 数据填写默认值
	 */
	private static final int DEFAULT_NUMBER = 0;


	@Override
	public void run() {
		saveData();
	}


	private void saveData() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		Date endTime = calendar.getTime();
		calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) - 1);
		Date startTime = calendar.getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		/*
		 * String start = dateFormat.format(startTime); String end =
		 * dateFormat.format(endTime);
		 */
		String start = "2017-01-04 08:34:17.010";
		String end = "2017-01-04 09:34:17.010";
		saveDashboard(Db.find(SQL.SELECT_AUTOTEST_PRODUCTION_BY_TESTTIME, start, end), startTime, endTime, Constant.AUTOTEST_LINEID);
		saveDashboard(Db.find(SQL.SELECT_COUPLETEST_PRODUCTION_BY_TESTTIME, start, end), startTime, endTime, Constant.COUPLETEST_LINEID);
		saveDashboard(Db.find(SQL.SELECT_CARTONTEST_PRODUCTION_BY_TESTTIME, start, end), startTime, endTime, Constant.CARTONTEST_LINEID);
	}


	private void saveDashboard(List<Record> records, Date startTime, Date endTime, Integer lineId) {
		if (records != null && !records.isEmpty()) {
			for (Record record : records) {
				Dashboard dashboard = new Dashboard();
				Orders order = Orders.dao.findFirst(SQL.SELECT_ORDER_BY_ZHIDAN, record.getStr("ZhiDan"));
				if (order != null) {
					if (StrKit.isBlank(order.getRemark())) {
						dashboard.setRemark("-");
					} else {
						dashboard.setRemark(order.getRemark());
					}
					dashboard.setPlanProduction(order.getQuantity());
					dashboard.setActualProduction(record.getInt("Production")).setZhidan(record.getStr("ZhiDan")).setSoftModel(record.getStr("SoftModel"));
					dashboard.setCompletionRate(BigDecimal.valueOf((double) dashboard.getActualProduction() / (double) dashboard.getPlanProduction()).setScale(2, BigDecimal.ROUND_HALF_UP));

					// TODO 测试率
					dashboard.setTestingRate(BigDecimal.valueOf(0));
					dashboard.setStartTime(startTime).setEndTime(endTime).setLine(lineId).save();

				} else {
					dashboard.setRemark("-").setZhidan(record.getStr("ZhiDan")).setSoftModel(record.getStr("SoftModel"));
					dashboard.setCompletionRate(BigDecimal.valueOf(DEFAULT_NUMBER)).setActualProduction(DEFAULT_NUMBER).setPlanProduction(DEFAULT_NUMBER).setTestingRate(BigDecimal.valueOf(DEFAULT_NUMBER));
					dashboard.setStartTime(startTime).setEndTime(endTime).setLine(lineId).save();
				}
			}
		} else {
			Dashboard dashboard = new Dashboard();
			dashboard.setRemark("-").setZhidan("-").setSoftModel("-");
			dashboard.setCompletionRate(BigDecimal.valueOf(DEFAULT_NUMBER)).setActualProduction(DEFAULT_NUMBER).setPlanProduction(DEFAULT_NUMBER).setTestingRate(BigDecimal.valueOf(DEFAULT_NUMBER));
			dashboard.setStartTime(startTime).setEndTime(endTime).setLine(lineId).save();
		}
	}

}
