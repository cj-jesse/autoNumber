package com.seeyon.apps.autonum.clocked.dao;

import java.util.Map;

import com.seeyon.apps.autonum.common.exception.DAOExcuteException;
import com.seeyon.apps.autonum.common.exception.ProcessingException;
import com.seeyon.apps.autonum.common.jdbc.DAOContext;
import com.seeyon.apps.autonum.common.jdbc.JdbcDAO;
import com.seeyon.apps.autonum.common.jdbc.JdbcDaoUtil;
import com.seeyon.apps.autonum.common.parameter.SqlParameter;

public class AutoNumberAssetsDao  extends JdbcDAO{

	public AutoNumberAssetsDao() {
		super();
	}

	public AutoNumberAssetsDao(DAOContext context) {
		super(context);
	}
	
	/**
	 * 根据日期查询自增编号
	 * @param type
	 * @param date
	 * @return
	 * @throws ProcessingException
	 */
	public Integer findAutoNumByDate(String type, String date) throws DAOExcuteException {
		String sql = "select num,num_type,auto_date from auto_number where num_type = ? and auto_date = ?";
		Map<String, String> result = JdbcDaoUtil.findAsMapStringString(this.context, sql, new SqlParameter(type), new SqlParameter(date));
		int count = result.get("NUM")==null || "".equals(result.get("NUM"))?0:Integer.valueOf(result.get("NUM"));
		return count;
	}

	/**
	 * 新增当日编号
	 * @param type
	 * @param date
	 * @param num
	 * @return
	 * @throws ProcessingException
	 */
	public Integer insertAutoNumber(String type, String date, Integer num) throws DAOExcuteException {
		String sql = "insert into auto_number values (?, ? ,?)";
		return JdbcDaoUtil.singleExecute(this.context, sql, new SqlParameter(type), new SqlParameter(date), new SqlParameter(num));
	}

	/**
	 * 修改当日编号
	 * @param type
	 * @param date
	 * @param num
	 * @return
	 * @throws ProcessingException
	 */
	public Integer updateAutoNumber(String type, String date, Integer num) throws DAOExcuteException {
		String sql = "update auto_number set num = ? where num_type = ? and auto_date = ?";
		return JdbcDaoUtil.singleExecute(this.context, sql, new SqlParameter(num), new SqlParameter(type), new SqlParameter(date));
	}

	/**
	 * 更新原辅料引进流程单编号
	 * @param number
	 * @param id
	 * @return
	 * @throws ProcessingException
	 */
	public Integer updateYFLYJAutoNumber(String number, String id) throws DAOExcuteException {
		String sql = "update formmain_4020 set field0012 = ? where id = ?";
		return JdbcDaoUtil.singleExecute(this.context, sql, new SqlParameter(number), new SqlParameter(id));
	}
	
	/**
	 * 更新OEM产品、包材引进流程单编号
	 * @param number
	 * @param id
	 * @return
	 * @throws ProcessingException
	 */
	public Integer updateOEMYJAutoNumber(String number, String id) throws DAOExcuteException {
		String sql = "update formmain_4021 set field0012 = ? where id = ?";
		return JdbcDaoUtil.singleExecute(this.context, sql, new SqlParameter(number), new SqlParameter(id));
	}

	/**
	 * 查询当前门店序号
	 * @param type
	 * @return
	 * @throws DAOExcuteException
	 */
	public Integer findXDQYAutoNum(String type) throws DAOExcuteException {
		String sql = "select num from auto_number where num_type = ?";
		Map<String, String> result = JdbcDaoUtil.findAsMapStringString(this.context, sql, new SqlParameter(type));
		int count = result.get("num")==null || "".equals(result.get("num"))?0:Integer.valueOf(result.get("num"));
		return count;
	}

	/**
	 * 新增门店序号
	 * @param type
	 * @param num
	 * @return
	 * @throws DAOExcuteException
	 */
	public Integer insertXDQYAutoNumber(String type, Integer num) throws DAOExcuteException {
		String sql = "insert into auto_number values (?, ? ,?)";
		return JdbcDaoUtil.singleExecute(this.context, sql, new SqlParameter(type), new SqlParameter(""), new SqlParameter(num));
	}

	/**
	 * 修改门店序号
	 * @param type
	 * @param num
	 * @return
	 * @throws DAOExcuteException
	 */
	public Integer updateXDQYAutoNumber(String type, Integer num) throws DAOExcuteException {
		String sql = "update auto_number set num = ? where num_type = ?";
		return JdbcDaoUtil.singleExecute(this.context, sql, new SqlParameter(num), new SqlParameter(type));
	}

	/**
	 * 更新华东门店序号
	 * @param number
	 * @param id
	 * @return
	 * @throws DAOExcuteException
	 */
	public Integer updateXDQYHDAutoNumber(Integer number, String id) throws DAOExcuteException {
		String sql = "update formmain_4021 set field0012 = ? where id = ?";
		return JdbcDaoUtil.singleExecute(this.context, sql, new SqlParameter(number), new SqlParameter(id));
	}

	/**
	 * 更新华南门店序号
	 * @param number
	 * @param id
	 * @return
	 * @throws DAOExcuteException
	 */
	public Integer updateXDQYHNAutoNumber(Integer number, String id) throws DAOExcuteException {
		String sql = "update formmain_4021 set field0012 = ? where id = ?";
		return JdbcDaoUtil.singleExecute(this.context, sql, new SqlParameter(number), new SqlParameter(id));
	}
	
}
