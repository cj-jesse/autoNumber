package com.seeyon.apps.autonum.oa.dao;

import java.util.List;

import com.seeyon.apps.autonum.common.exception.DAOExcuteException;
import com.seeyon.apps.autonum.common.jdbc.DAOContext;
import com.seeyon.apps.autonum.common.jdbc.JdbcDaoUtil;
import com.seeyon.apps.autonum.common.parameter.SqlParameter;
import com.seeyon.apps.autonum.oa.entity.AutoNumberMasterDataRow;
import com.seeyon.ctp.form.bean.FormBean;

public class AutoNumberDiBiaoDao {

	// private static final Logger LOGGER = Logger.getLogger(TestDAO.class);

	private DAOContext daoContext;

	private FormBean formBean;

	public AutoNumberDiBiaoDao(DAOContext daoContext) {
		this.daoContext = daoContext;
	}

	public FormBean getFormBean() {
		return formBean;
	}

	public void setFormBean(FormBean formBean) {
		this.formBean = formBean;
	}

	public int insertOrUpdateMasterData(AutoNumberMasterDataRow dataRowMap) throws DAOExcuteException {
		if ((dataRowMap == null) || dataRowMap.getId() == null || dataRowMap.getId().longValue() == 0L) {
			return -1;
		}
		// 删除主表数据
		deleteMasterTable(formBean.getMasterTableBean().getTableName(), dataRowMap.getId().longValue());
		// 插入主表数据
		int count = singleInsertMasterTable(dataRowMap);
		return count;
	}

	/**
	 * 插入一条主表数据
	 * 
	 * @param rowDataMap
	 * @return
	 * @throws DAOExcuteException
	 */
	public int singleInsertMasterTable(AutoNumberMasterDataRow rowDataMap) throws DAOExcuteException {
		// 创建SQL
		AutoNumberSQLBuilder.A8xSqlInfo sqlInfo = AutoNumberSQLBuilder.buildMasterTableInsertSql(formBean);
		AutoNumberFormDaoUtil.A8xDataRowMapSetter tmpYRowSetter = new AutoNumberFormDaoUtil.A8xDataRowMapSetter(sqlInfo.getFieldNameList());
		return JdbcDaoUtil.singleExecute(daoContext, sqlInfo.getSql(), rowDataMap, tmpYRowSetter);
	}

	public int batchInsertMasterTable(List<AutoNumberMasterDataRow> rowDataMap) throws DAOExcuteException {
		// 创建SQL
		AutoNumberSQLBuilder.A8xSqlInfo sqlInfo = AutoNumberSQLBuilder.buildMasterTableInsertSql(formBean);
		AutoNumberFormDaoUtil.A8xDataRowMapSetter tmpYRowSetter = new AutoNumberFormDaoUtil.A8xDataRowMapSetter(sqlInfo.getFieldNameList());
		int[] x = JdbcDaoUtil.batchExecute(daoContext, sqlInfo.getSql(), rowDataMap, tmpYRowSetter);
		if (x != null) {
			return x.length;
		} else {
			return -1;
		}
	}

	public int batchUpdateMasterTable(List<AutoNumberMasterDataRow> rowDataMap) throws DAOExcuteException {
		// 创建SQL
		AutoNumberSQLBuilder.A8xSqlInfo sqlInfo = AutoNumberSQLBuilder.buildMasterTableInsertSql(formBean);
		AutoNumberFormDaoUtil.A8xDataRowMapSetter tmpYRowSetter = new AutoNumberFormDaoUtil.A8xDataRowMapSetter(sqlInfo.getFieldNameList());
		int[] x = JdbcDaoUtil.batchExecute(daoContext, sqlInfo.getSql(), rowDataMap, tmpYRowSetter);
		if (x != null) {
			return x.length;
		} else {
			return -1;
		}
	}

	/**
	 * 删除主表数据
	 */
	public int deleteMasterTable(String tableName, long masterDataId) throws DAOExcuteException {
		String sql = "delete from " + tableName + " where id=?";
		return JdbcDaoUtil.singleExecute(daoContext, sql, new SqlParameter(masterDataId));
	}

	/**
	 * 删除重复表数据--根据子表key
	 */
	public int deleteChildTable(String tableName, long childDataId) throws DAOExcuteException {
		String sql = "delete from " + tableName + " where id=?";
		return JdbcDaoUtil.singleExecute(daoContext, sql, new SqlParameter(childDataId));
	}

	/**
	 * 根据主表key,删除子表数据
	 */
	public int deleteChildTableByMasterID(String tableName, long masterDataId) throws DAOExcuteException {
		String sql = "delete from " + tableName + " where formmain_id=?";
		return JdbcDaoUtil.singleExecute(daoContext, sql, new SqlParameter(masterDataId));
	}

}
