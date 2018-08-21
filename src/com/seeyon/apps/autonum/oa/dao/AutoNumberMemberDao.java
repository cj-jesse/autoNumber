package com.seeyon.apps.autonum.oa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.seeyon.apps.autonum.common.exception.DAOExcuteException;
import com.seeyon.apps.autonum.common.jdbc.DAOContext;
import com.seeyon.apps.autonum.common.jdbc.JdbcDAO;
import com.seeyon.apps.autonum.common.jdbc.RowGetter;
import com.seeyon.apps.autonum.common.parameter.IParameter;
import com.seeyon.apps.autonum.common.parameter.SqlParameter;
import com.seeyon.apps.autonum.oa.entity.AutoNumberMember;

public class AutoNumberMemberDao extends JdbcDAO implements RowGetter<AutoNumberMember> {

	public AutoNumberMemberDao() {
		super();
	}

	public AutoNumberMemberDao(DAOContext context) {
		super(context);
	}

	public AutoNumberMember readByCode(String thecode) throws DAOExcuteException {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT ORG_MEMBER.ID,");
		sql.append("       ORG_MEMBER.NAME,");
		sql.append("       ORG_MEMBER.CODE,");
		sql.append("       ORG_MEMBER.ORG_DEPARTMENT_ID AS deptid,");
		sql.append("       ORG_UNIT.NAME                AS deptname,");
		sql.append("       ORG_UNIT.PATH,");
		sql.append("       ORG_PRINCIPAL.LOGIN_NAME     AS loginname");
		sql.append("  FROM ORG_MEMBER");
		sql.append(" INNER JOIN ORG_UNIT");
		sql.append("    ON ORG_MEMBER.ORG_DEPARTMENT_ID = ORG_UNIT.ID");
		sql.append(" INNER JOIN ORG_PRINCIPAL");
		sql.append("    ON ORG_MEMBER.ID = ORG_PRINCIPAL.MEMBER_ID");
		sql.append("   where ORG_MEMBER.CODE=?");
		IParameter tmpParameter = null;
		// id;
		tmpParameter = new SqlParameter(thecode);
		return super.read(sql.toString(), this, tmpParameter);
	}

	public AutoNumberMember read(long theKey) throws DAOExcuteException {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT ORG_MEMBER.ID,");
		sql.append("       ORG_MEMBER.NAME,");
		sql.append("       ORG_MEMBER.CODE,");
		sql.append("       ORG_MEMBER.ORG_DEPARTMENT_ID AS deptid,");
		sql.append("       ORG_UNIT.NAME                AS deptname,");
		sql.append("       ORG_UNIT.PATH,");
		sql.append("       ORG_PRINCIPAL.LOGIN_NAME     AS loginname");
		sql.append("  FROM ORG_MEMBER");
		sql.append(" INNER JOIN ORG_UNIT");
		sql.append("    ON ORG_MEMBER.ORG_DEPARTMENT_ID = ORG_UNIT.ID");
		sql.append(" INNER JOIN ORG_PRINCIPAL");
		sql.append("    ON ORG_MEMBER.ID = ORG_PRINCIPAL.MEMBER_ID");
		sql.append("   where ORG_MEMBER.ID=?");
		IParameter tmpParameter = null;
		// id;
		tmpParameter = new SqlParameter(theKey);
		return super.read(sql.toString(), this, tmpParameter);
	}

	public AutoNumberMember convertResultSet(ResultSet rs) throws SQLException {
		int index = 0;
		AutoNumberMember tmpModel = new AutoNumberMember();
		// id;
		index++;
		tmpModel.setId(rs.getLong(index));
		// name;
		index++;
		tmpModel.setName(rs.getString(index));
		// code;
		index++;
		tmpModel.setCode(rs.getString(index));
		// deptid;
		index++;
		tmpModel.setDeptid(rs.getLong(index));
		// deptname;
		index++;
		tmpModel.setDeptname(rs.getString(index));
		// path;
		index++;
		tmpModel.setPath(rs.getString(index));
		// loginName;
		index++;
		tmpModel.setLoginName(rs.getString(index));
		return tmpModel;
	}

}