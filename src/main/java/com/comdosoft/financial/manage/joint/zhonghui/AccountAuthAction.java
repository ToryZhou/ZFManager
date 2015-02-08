package com.comdosoft.financial.manage.joint.zhonghui;

import java.io.File;
import java.util.Map;

import com.comdosoft.financial.manage.joint.AbstractHandler;
import com.google.common.collect.Maps;

public class AccountAuthAction extends RequireLoginAction {
	private String bankDeposit;
	private String accountNo;
	private String name;
	private String unionBankNo;
	private File card;
	private String reqNo;

	public AccountAuthAction(String bankDeposit, String accountNo, String name,
			String unionBankNo, File card, String reqNo) {
		this.bankDeposit = bankDeposit;
		this.accountNo = accountNo;
		this.name = name;
		this.unionBankNo = unionBankNo;
		this.card = card;
		this.reqNo = reqNo;
	}

	@Override
	public Map<String, String> params() {
		Map<String, String> params = createParams();
		params.put("name", name);
		params.put("bankDeposit", bankDeposit);
		params.put("accountNo", accountNo);
		params.put("unionBankNo", unionBankNo);
		params.put("reqNo", reqNo);
		return params;
	}

	@Override
	public Map<String, File> fileParams() {
		Map<String, File> params = Maps.newHashMap();
		params.put("card", card);
		return params;
	}

	@Override
	public AbstractHandler handler() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub

	}

	@Override
	public String url() {
		return "/user/accountAuth";
	}
}