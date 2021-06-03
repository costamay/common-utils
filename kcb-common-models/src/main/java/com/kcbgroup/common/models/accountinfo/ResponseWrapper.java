/**
 * 
 */
package com.kcbgroup.common.models.accountinfo;

import java.io.Serializable;

import com.kcbgroup.common.models.ResponseHeader;


/**
 * kcb-common-models
 * Sep 18, 2020
 * ResponseWrapper.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class ResponseWrapper implements Serializable {
	/** Serial version UID */
	private static final long serialVersionUID = 3547641363206949943L;
	
	private ResponseHeader header;
    private AccountInfoResponsePayload responsePayload;

	public ResponseWrapper() {
	}

	public ResponseHeader getHeader() {
		return header;
	}

	public void setHeader(ResponseHeader header) {
		this.header = header;
	}

	public AccountInfoResponsePayload getResponsePayload() {
		return responsePayload;
	}

	public void setResponsePayload(AccountInfoResponsePayload responsePayload) {
		this.responsePayload = responsePayload;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResponseWrapper [header=");
		builder.append(header);
		builder.append(", responsePayload=");
		builder.append(responsePayload);
		builder.append("]");
		return builder.toString();
	}
}
