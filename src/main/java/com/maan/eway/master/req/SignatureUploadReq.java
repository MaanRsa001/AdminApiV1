package com.maan.eway.master.req;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.ToString;
@Data
@ToString
public class SignatureUploadReq {

	@JsonProperty("CompanyId")
	private String CompanyId;
	
	@JsonProperty("LoginId")
	private String loginId;

}
