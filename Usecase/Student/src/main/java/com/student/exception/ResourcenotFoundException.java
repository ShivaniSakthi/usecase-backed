package com.student.exception;

public class ResourcenotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private String resourceNameString;
	private String fieldNameString;
	private Object fieldValueObject;
	
	public ResourcenotFoundException(String resourceNameString, String fieldNameString, Object fieldValueObject) {
		super();
		this.resourceNameString = resourceNameString;
		this.fieldNameString = fieldNameString;
		this.fieldValueObject = fieldValueObject;
	}

	public String getResourceNameString() {
		return resourceNameString;
	}

	public String getFieldNameString() {
		return fieldNameString;
	}

	public Object getFieldValueObject() {
		return fieldValueObject;
	}
}
