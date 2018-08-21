package com.seeyon.apps.autonum.listener;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.seeyon.apps.autonum.clocked.auto.AutoNumber;
import com.seeyon.apps.autonum.clocked.auto.OEMYJAutoNumber;
import com.seeyon.apps.autonum.clocked.auto.XDQYHDAutoNumber;
import com.seeyon.apps.autonum.clocked.auto.XDQYHNAutoNumber;
import com.seeyon.apps.autonum.clocked.auto.YFLYJAutoNumber;
import com.seeyon.apps.collaboration.manager.ColManager;
import com.seeyon.apps.collaboration.po.ColSummary;
import com.seeyon.ctp.common.AppContext;
import com.seeyon.ctp.common.po.template.CtpTemplate;
import com.seeyon.ctp.common.template.manager.TemplateManager;
import com.seeyon.ctp.workflow.event.AbstractWorkflowEvent;
import com.seeyon.ctp.workflow.event.WorkflowEventData;
import com.seeyon.ctp.workflow.event.WorkflowEventResult;


public class AutoNumberWorkflowEventImpl extends AbstractWorkflowEvent {

	private static final Log log = LogFactory.getLog(AutoNumberWorkflowEventImpl.class);

	public String getId() {
		return String.valueOf(getLabel().hashCode());
	}

	public String getLabel() {
		return "自动编号监听器";
	}

	public int sort() {
		return 1;
	}

	@Override //处理前事件
	public WorkflowEventResult onBeforeFinishWorkitem(WorkflowEventData data) {
		return doBeforeFinishWorkitem(data.getSummaryId());
	}
	
	private WorkflowEventResult doBeforeFinishWorkitem(long colSummaryId) {
		WorkflowEventResult workflowEventResult = new WorkflowEventResult();
		ColSummary tmpColSummary = null;
		try {
			ColManager colManager = (ColManager) AppContext.getBean("colManager");
			tmpColSummary = colManager.getColSummaryById(Long.valueOf(colSummaryId));
		} catch (Exception e1) {
			workflowEventResult.setAlertMessage("获取协同表单资料失败:\n" + e1.getLocalizedMessage());
			return workflowEventResult;
		}
		if (tmpColSummary == null) {
			workflowEventResult.setAlertMessage("错误:协同表单资料为空!!!\n");
			return workflowEventResult;
		}

		String tmpTempleteNumber = null;
		try {
			tmpTempleteNumber = getA8FormCode(tmpColSummary);
		} catch (Exception e1) {
			workflowEventResult.setAlertMessage("获取表单模板编号信息失败:\n" + e1.getLocalizedMessage());
			return workflowEventResult;
		}
		if (StringUtils.isBlank(tmpTempleteNumber)) {
			log.info("表单模板编号为空..");
			return null;
		}
		tmpTempleteNumber = tmpTempleteNumber.toUpperCase().trim();
		if (tmpTempleteNumber.startsWith("YFLYJ")) {//原辅料引进流程单
			AutoNumber autoNumber = new YFLYJAutoNumber(tmpColSummary.getFormAppid(), tmpColSummary.getFormRecordid());
			try {
				autoNumber.execute();
			} catch (Exception e) {
			}
		} else if (tmpTempleteNumber.startsWith("OEMYJ")) {//OEM产品、包材引进流程单
			AutoNumber autoNumber = new OEMYJAutoNumber(tmpColSummary.getFormAppid(), tmpColSummary.getFormRecordid());
			try {
				autoNumber.execute();
			} catch (Exception e) {
			}
		} else if (tmpTempleteNumber.startsWith("XDQYHD")) {//华东新店签约
			AutoNumber autoNumber = new XDQYHDAutoNumber(tmpColSummary.getFormAppid(), tmpColSummary.getFormRecordid());
			try {
				autoNumber.execute();
			} catch (Exception e) {
			}
		} else if (tmpTempleteNumber.startsWith("XDQYHN")) {//华南新店签约
			AutoNumber autoNumber = new XDQYHNAutoNumber(tmpColSummary.getFormAppid(), tmpColSummary.getFormRecordid());
			try {
				autoNumber.execute();
			} catch (Exception e) {
			}
		}
		
		return null;
	}

	private String getA8FormCode(ColSummary colSummary) throws Exception {
		if (colSummary == null) {
			return null;
		}
		Long templetId = colSummary.getTempleteId();
		if (templetId == null) {
			return null;
		}
		TemplateManager templateManager = (TemplateManager) AppContext.getBean("templateManager");
		CtpTemplate templete = templateManager.getCtpTemplate(templetId);
		if (templete == null) {
			return null;
		}
		String a8FormCode = templete.getTempleteNumber();
		if (StringUtils.isBlank(a8FormCode)) {
			return null;
		}
		return a8FormCode;
	}

}
