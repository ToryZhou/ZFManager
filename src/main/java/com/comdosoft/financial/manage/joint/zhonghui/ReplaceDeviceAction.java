package com.comdosoft.financial.manage.joint.zhonghui;

import java.io.InputStream;
import java.util.Map;

import com.comdosoft.financial.manage.joint.JointResult;

public class ReplaceDeviceAction extends RequireLoginAction {
	
	private String ksnNo;
	private String reqNo;
	
	public ReplaceDeviceAction(String ksnNo, String reqNo) {
		super();
		this.ksnNo = ksnNo;
		this.reqNo = reqNo;
	}

	@Override
	public Map<String, String> params() {
		Map<String, String> params = createParams();
		params.put("ksnNo", ksnNo);
		params.put("reqNo", reqNo);
		params.put("model","zfmini");
		return params;
	}

	@Override
	public String url() {
		return "/swiper/change";
	}

	@Override
	public void handle(JointResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	protected JointResult parseResult(Map<String, String> headers,
			InputStream stream) {
		// TODO Auto-generated method stub
		return null;
	}

}
