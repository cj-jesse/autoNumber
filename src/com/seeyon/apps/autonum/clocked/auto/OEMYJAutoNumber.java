package com.seeyon.apps.autonum.clocked.auto;

public class OEMYJAutoNumber extends AutoNumber {

	public OEMYJAutoNumber() {
		super();
	}

	public OEMYJAutoNumber(Long formAppId, Long formRecordId) {
		super();
		this.formAppId = formAppId;
		this.formRecordId = formRecordId;
	}

	/**
	 * 更新OEM产品、包材引进流程单编号
	 * @param id
	 */
	@Override
	public void execute(){
		loadFormDate();
		if(valuesMap.get("样品编号") == null || "".equals(valuesMap.get("样品编号") + "")){
			final String id = valuesMap.get("id") + "";
			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(2000l);
						String number = getAutoNumber();
						service.updateOEMYJAutoNumber(number, id);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}).start();
		}
	}
}
