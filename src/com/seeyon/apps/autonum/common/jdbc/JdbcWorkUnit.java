package com.seeyon.apps.autonum.common.jdbc;

import com.seeyon.apps.autonum.common.exception.ProcessingException;

public interface JdbcWorkUnit<T> {
	T execute(DAOContext context) throws ProcessingException;
}
