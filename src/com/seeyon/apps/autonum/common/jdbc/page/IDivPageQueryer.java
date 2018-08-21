package com.seeyon.apps.autonum.common.jdbc.page;

import com.seeyon.apps.autonum.common.domain.QueryResult;
import com.seeyon.apps.autonum.common.exception.DAOExcuteException;

public interface IDivPageQueryer {

	public QueryResult query() throws DAOExcuteException;

	public String getLimitSelectSQL();

	public String getSelectCountSQL();

}