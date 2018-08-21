package com.seeyon.apps.autonum.clocked.service;

import com.seeyon.apps.autonum.clocked.dao.AutoNumberAssetsDao;
import com.seeyon.apps.autonum.common.exception.DAOExcuteException;
import com.seeyon.apps.autonum.common.exception.ProcessingException;
import com.seeyon.apps.autonum.common.jdbc.DAOContext;
import com.seeyon.apps.autonum.common.jdbc.JdbcWorkUnit;
import com.seeyon.apps.autonum.common.jdbc.JdbcWorker;

public class AutoNumberAssetsService {

	/**
	 * 根据日期查询自增编号
	 * @param type
	 * @param date
	 * @return
	 * @throws ProcessingException
	 */
	public Integer findAutoNumByDate(final String type, final String date) throws ProcessingException {
		return JdbcWorker.wrapNotInTransaction(new JdbcWorkUnit<Integer>() {
			public Integer execute(DAOContext daoContext) throws ProcessingException {
				AutoNumberAssetsDao dao = new AutoNumberAssetsDao(daoContext);
				return dao.findAutoNumByDate(type, date);
			}
		});
	}

	/**
	 * 新增当日编号
	 * @param type
	 * @param date
	 * @param num
	 * @return
	 * @throws ProcessingException
	 */
	public Integer insertAutoNumber(final String type, final String date, final Integer num) throws ProcessingException {
		return JdbcWorker.wrapInTransaction(new JdbcWorkUnit<Integer>() {
			public Integer execute(DAOContext daoContext) throws ProcessingException {
				AutoNumberAssetsDao dao = new AutoNumberAssetsDao(daoContext);
				return dao.insertAutoNumber(type, date, num);
			}
		});
	}

	/**
	 * 修改当日编号
	 * @param type
	 * @param date
	 * @param num
	 * @return
	 * @throws ProcessingException
	 */
	public Integer updateAutoNumber(final String type, final String date, final Integer num) throws ProcessingException {
		return JdbcWorker.wrapInTransaction(new JdbcWorkUnit<Integer>() {
			public Integer execute(DAOContext daoContext) throws ProcessingException {
				AutoNumberAssetsDao dao = new AutoNumberAssetsDao(daoContext);
				return dao.updateAutoNumber(type, date, num);
			}
		});
	}

	/**
	 * 更新原辅料引进流程单编号
	 * @param number
	 * @param id
	 * @return
	 * @throws ProcessingException
	 */
	public Integer updateYFLYJAutoNumber(final String number, final String id) throws ProcessingException {
		return JdbcWorker.wrapInTransaction(new JdbcWorkUnit<Integer>() {
			public Integer execute(DAOContext daoContext) throws ProcessingException {
				AutoNumberAssetsDao dao = new AutoNumberAssetsDao(daoContext);
				return dao.updateYFLYJAutoNumber(number,id);
			}
		});
	}
	
	/**
	 * 更新OEM产品、包材引进流程单编号
	 * @param number
	 * @param id
	 * @return
	 * @throws ProcessingException
	 */
	public Integer updateOEMYJAutoNumber(final String number, final String id) throws ProcessingException {
		return JdbcWorker.wrapInTransaction(new JdbcWorkUnit<Integer>() {
			public Integer execute(DAOContext daoContext) throws ProcessingException {
				AutoNumberAssetsDao dao = new AutoNumberAssetsDao(daoContext);
				return dao.updateOEMYJAutoNumber(number,id);
			}
		});
	}

	/**
	 * 查询当前门店序号
	 * @param type
	 * @return
	 * @throws DAOExcuteException
	 */
	public Integer findXDQYAutoNum(final String type) throws ProcessingException {
		return JdbcWorker.wrapInTransaction(new JdbcWorkUnit<Integer>() {
			public Integer execute(DAOContext daoContext) throws ProcessingException {
				AutoNumberAssetsDao dao = new AutoNumberAssetsDao(daoContext);
				return dao.findXDQYAutoNum(type);
			}
		});
	}

	/**
	 * 新增门店序号
	 * @param type
	 * @param num
	 * @return
	 * @throws DAOExcuteException
	 */
	public Integer insertXDQYAutoNumber(final String type, final Integer num) throws ProcessingException {
		return JdbcWorker.wrapInTransaction(new JdbcWorkUnit<Integer>() {
			public Integer execute(DAOContext daoContext) throws ProcessingException {
				AutoNumberAssetsDao dao = new AutoNumberAssetsDao(daoContext);
				return dao.insertXDQYAutoNumber(type, num);
			}
		});
	}

	/**
	 * 修改门店序号
	 * @param type
	 * @param num
	 * @return
	 * @throws DAOExcuteException
	 */
	public Integer updateXDQYAutoNumber(final String type, final Integer num) throws ProcessingException {
		return JdbcWorker.wrapInTransaction(new JdbcWorkUnit<Integer>() {
			public Integer execute(DAOContext daoContext) throws ProcessingException {
				AutoNumberAssetsDao dao = new AutoNumberAssetsDao(daoContext);
				return dao.updateXDQYAutoNumber(type, num);
			}
		});
	}

	/**
	 * 更新华东门店序号
	 * @param number
	 * @param id
	 * @return
	 * @throws DAOExcuteException
	 */
	public Integer updateXDQYHDAutoNumber(final Integer number, final String id) throws ProcessingException {
		return JdbcWorker.wrapInTransaction(new JdbcWorkUnit<Integer>() {
			public Integer execute(DAOContext daoContext) throws ProcessingException {
				AutoNumberAssetsDao dao = new AutoNumberAssetsDao(daoContext);
				return dao.updateXDQYHDAutoNumber(number, id);
			}
		});
	}

	/**
	 * 更新华南门店序号
	 * @param number
	 * @param id
	 * @return
	 * @throws DAOExcuteException
	 */
	public Integer updateXDQYHNAutoNumber(final Integer number, final String id) throws ProcessingException {
		return JdbcWorker.wrapInTransaction(new JdbcWorkUnit<Integer>() {
			public Integer execute(DAOContext daoContext) throws ProcessingException {
				AutoNumberAssetsDao dao = new AutoNumberAssetsDao(daoContext);
				return dao.updateXDQYHNAutoNumber(number, id);
			}
		});
	}
	
}
