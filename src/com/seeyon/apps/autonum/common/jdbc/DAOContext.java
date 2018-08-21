package com.seeyon.apps.autonum.common.jdbc;

import java.sql.Connection;

import com.seeyon.apps.autonum.common.exception.DAOTransactionException;

public interface DAOContext {

	public void beginTransaction() throws DAOTransactionException;

	public void commitTransaction() throws DAOTransactionException;

	public void rollbackTransaction();

	public void destory();

	public Connection getConnection();

}