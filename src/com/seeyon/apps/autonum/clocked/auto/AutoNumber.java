package com.seeyon.apps.autonum.clocked.auto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.seeyon.apps.autonum.clocked.service.AutoNumberAssetsService;
import com.seeyon.apps.autonum.common.exception.ProcessingException;
import com.seeyon.apps.autonum.oa.AutoNumberFormDataReader;

public abstract class AutoNumber {
	
	// 表单数据读取器
	protected AutoNumberFormDataReader formDataReader = new AutoNumberFormDataReader(true);

	protected AutoNumberAssetsService service = new AutoNumberAssetsService();
	
	// 表单数据
	public Map<String, Object> valuesMap;

	// 子数据
	public List<Map<String, Object>> childDataList;

	public Long formAppId;

	public Long formRecordId;
	
	/**
	 * 获取表单数据
	 */
	public void loadFormDate() {
		boolean flag = formDataReader.loadFormData(formAppId, formRecordId);
		if (flag) {
			valuesMap = formDataReader.getMasterDataMap2();
			childDataList = formDataReader.getChildDataList2(0);
		}
	}
	
	/**
	 * 自动获取编号
	 */
	public abstract void execute();
	
	/**
	 * 获取自增编号
	 * @return
	 * @throws ProcessingException
	 */
	protected String getAutoNumber() throws ProcessingException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String date = sdf.format(new Date());
		Integer num = service.findAutoNumByDate("ypbh",date);
		if(num == null || num == 0){
			num = 1;
			service.insertAutoNumber("ypbh",date,num);
		} else {
			num += 1;
			service.updateAutoNumber("ypbh",date,num);
		}
		return "YP" + date + "-" + num;
	}
	
	/**
	 * 门店签约编号
	 * @return
	 * @throws ProcessingException
	 */
	protected Integer getXDQYAutoNumber() throws ProcessingException {
		Integer num = service.findXDQYAutoNum("mdxh");
		if(num == null || num == 0){
			num = 1;
			service.insertXDQYAutoNumber("mdxh",num);
		} else {
			num += 1;
			service.updateXDQYAutoNumber("mdxh",num);
		}
		return num;
	}
	
	
}
