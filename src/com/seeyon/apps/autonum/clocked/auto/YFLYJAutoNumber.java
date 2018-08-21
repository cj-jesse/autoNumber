package com.seeyon.apps.autonum.clocked.auto;

public class YFLYJAutoNumber extends AutoNumber{

	public YFLYJAutoNumber() {
		super();
	}

	public YFLYJAutoNumber(Long formAppId, Long formRecordId) {
		super();
		this.formAppId = formAppId;
		this.formRecordId = formRecordId;
	}
	
	/**
	 * 更新原辅料引进流程单编号
	 * @param id
	 */
	@Override
	public void execute(){
		loadFormDate();
		final String id = valuesMap.get("id") + "";
		if(valuesMap.get("样品编号") == null || "".equals(valuesMap.get("样品编号") + "")){
			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(2000l);
						String number = getAutoNumber();
						service.updateYFLYJAutoNumber(number, id);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			}).start();
		}
	}
}
