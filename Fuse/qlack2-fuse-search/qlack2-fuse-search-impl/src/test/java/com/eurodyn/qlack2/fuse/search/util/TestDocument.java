package com.eurodyn.qlack2.fuse.search.util;

public class TestDocument {

	private String name;
	private String surname;

	public TestDocument() {
	}

	public TestDocument(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
