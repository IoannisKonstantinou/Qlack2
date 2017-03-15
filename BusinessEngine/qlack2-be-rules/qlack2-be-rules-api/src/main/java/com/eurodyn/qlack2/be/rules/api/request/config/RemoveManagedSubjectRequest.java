package com.eurodyn.qlack2.be.rules.api.request.config;

import com.eurodyn.qlack2.fuse.idm.api.signing.QSignedRequest;

public class RemoveManagedSubjectRequest extends QSignedRequest {
	private String subjectId;
	private String resourceId;

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
}