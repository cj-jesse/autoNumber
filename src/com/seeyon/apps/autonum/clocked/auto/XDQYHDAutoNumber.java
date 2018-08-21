package com.seeyon.apps.autonum.clocked.auto;

public class XDQYHDAutoNumber extends AutoNumber {

	public XDQYHDAutoNumber() {
		super();
	}

	public XDQYHDAutoNumber(Long formAppId, Long formRecordId) {
		super();
		this.formAppId = formAppId;
		this.formRecordId = formRecordId;
	}
	
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
						Integer number = getXDQYAutoNumber();
						service.updateXDQYHDAutoNumber(number, id);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}).start();
		}
	}
}
