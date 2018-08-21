package com.seeyon.apps.autonum.oa.dao;

import java.util.List;
import java.util.Map;

import com.seeyon.apps.autonum.common.exception.ProcessingException;
import com.seeyon.apps.autonum.common.jdbc.DAOContext;
import com.seeyon.apps.autonum.common.jdbc.JdbcWorkUnit;
import com.seeyon.apps.autonum.common.jdbc.JdbcWorker;
import com.seeyon.apps.autonum.common.parameter.SqlParameter;
import com.seeyon.apps.autonum.oa.util.AutoNumberDiBiaoUtil;
import com.seeyon.ctp.form.bean.FormBean;
import com.seeyon.ctp.form.bean.FormTableBean;

public class AutoNumberFormDataReadDao {

	private Long formRecordId;

	// 表单定义
	private FormBean formBean;

	public AutoNumberFormDataReadDao(FormBean formBean, Long formRecordId) {
		this.formBean = formBean;
		this.formRecordId = formRecordId;
	}

	public Map<String, Object> loadMasterTableData() throws ProcessingException {
		final String sql = "select * from " + formBean.getMasterTableBean().getTableName() + " where ID=?";
		return JdbcWorker.wrapNotInTransaction(new JdbcWorkUnit<Map<String, Object>>() {
			public Map<String, Object> execute(DAOContext daoContext) throws ProcessingException {

				return AutoNumberFormDaoUtil.findAsMap(daoContext, sql, new SqlParameter(AutoNumberFormDataReadDao.this.formRecordId));
			}
		});
	}

	public List<Map<String, Object>> getChildTableData(String theChildTableName) throws ProcessingException {
		final String sql = "select * from " + theChildTableName + " where formmain_id=?";
		return JdbcWorker.wrapNotInTransaction(new JdbcWorkUnit<List<Map<String, Object>>>() {
			public List<Map<String, Object>> execute(DAOContext daoContext) throws ProcessingException {
				return AutoNumberFormDaoUtil.findAsList(daoContext, sql, new SqlParameter(AutoNumberFormDataReadDao.this.formRecordId));
			}
		});
	}



	public List<Map<String, Object>> getChildTableDataByDisplayName(String theDisplayname) throws ProcessingException {
		String tmpTablename = AutoNumberDiBiaoUtil.getTableName(theDisplayname, formBean);
		if (tmpTablename != null) {
			return getChildTableData(tmpTablename);
		}
		return null;

	}

	public List<Map<String, Object>> getChildTableData(int index) throws ProcessingException {
		String theChildTableName = null;
		List<FormTableBean> tmpList = formBean.getSubTableBean();
		if (tmpList != null && tmpList.size() > 0) {
			if (tmpList.size() < (index - 1)) {
				return null;
			}
			theChildTableName = tmpList.get(index).getTableName();
			final String sql = "select * from " + theChildTableName + " where formmain_id=?";
			return JdbcWorker.wrapNotInTransaction(new JdbcWorkUnit<List<Map<String, Object>>>() {
				public List<Map<String, Object>> execute(DAOContext daoContext) throws ProcessingException {
					return AutoNumberFormDaoUtil.findAsList(daoContext, sql, new SqlParameter(AutoNumberFormDataReadDao.this.formRecordId));
				}
			});
		}
		return null;

	}

}
