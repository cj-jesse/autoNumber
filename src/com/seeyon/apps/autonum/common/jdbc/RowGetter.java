package com.seeyon.apps.autonum.common.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowGetter<T> {

	public T convertResultSet(ResultSet rs) throws SQLException;

}