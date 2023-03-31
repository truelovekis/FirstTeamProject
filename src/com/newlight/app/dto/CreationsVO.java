package com.newlight.app.dto;

import java.util.List;

import com.newlight.app.dto.CreationsFileDTO;

public class CreationsVO {
	int creationNumber;
	String creationTitle;
	String creationContent;
	String creationCode;
	String creationName;
	String creationWriteday;
	int memberNumber;
	String memberNickname;
	String memberPfp;
	List<CreationsFileDTO> files;
	
	public CreationsVO() {
		
	}

	public int getCreationNumber() {
		return creationNumber;
	}

	public void setCreationNumber(int creationNumber) {
		this.creationNumber = creationNumber;
	}

	public String getCreationTitle() {
		return creationTitle;
	}

	public void setCreationTitle(String creationTitle) {
		this.creationTitle = creationTitle;
	}

	public String getCreationContent() {
		return creationContent;
	}

	public void setCreationContent(String creationContent) {
		this.creationContent = creationContent;
	}

	public String getCreationCode() {
		return creationCode;
	}

	public void setCreationCode(String creationCode) {
		this.creationCode = creationCode;
	}

	public String getCreationName() {
		return creationName;
	}

	public void setCreationName(String creationName) {
		this.creationName = creationName;
	}

	public String getCreationWriteday() {
		return creationWriteday;
	}

	public void setCreationWriteday(String creationWriteday) {
		this.creationWriteday = creationWriteday;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public List<CreationsFileDTO> getFiles() {
		return files;
	}

	public void setFiles(List<CreationsFileDTO> files) {
		this.files = files;
	}

	public String getMemberNickname() {
		return memberNickname;
	}
	
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}
	
	public String getMemberPfp() {
		return memberPfp;
	}

	public void setMemberPfp(String memberPfp) {
		this.memberPfp = memberPfp;
	}

	@Override
	public String toString() {
		return "CreationsVO [creationNumber=" + creationNumber + ", creationTitle=" + creationTitle
				+ ", creationContent=" + creationContent + ", creationCode=" + creationCode + ", creationName="
				+ creationName + ", creationWriteday=" + creationWriteday + ", memberNumber=" + memberNumber
				+ ", memberNickname=" + memberNickname + ", memberPfp=" + memberPfp + ", files=" + files + "]";
	}
	
}