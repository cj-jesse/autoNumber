package com.seeyon.apps.autonum.oa.delegate;

import com.seeyon.apps.autonum.common.exception.ProcessingException;
import com.seeyon.apps.autonum.common.jdbc.DAOContext;
import com.seeyon.apps.autonum.common.jdbc.JdbcWorkUnit;
import com.seeyon.apps.autonum.common.jdbc.JdbcWorker;
import com.seeyon.apps.autonum.oa.dao.AutoNumberMemberDao;
import com.seeyon.apps.autonum.oa.entity.AutoNumberMember;

public class AutoNumberMemberDelegate {

	
	public static AutoNumberMember read(final String theKey) {
		AutoNumberMember temp = null;
		try {
			temp = JdbcWorker.wrapNotInTransaction(new JdbcWorkUnit<AutoNumberMember>() {
				public AutoNumberMember execute(DAOContext daoContext) throws ProcessingException {
					AutoNumberMemberDao dao = new AutoNumberMemberDao(daoContext);
					return dao.read(Long.parseLong(theKey));
				}
			});
		} catch (Exception e) {
			throw new java.lang.IllegalStateException("人员:["+ theKey +"]不存在..."+e.getLocalizedMessage());
		}
		
		if(temp == null){
			throw new java.lang.IllegalStateException("人员:["+ theKey +"]不存在...");
		}
		
		return temp;
	}
}
