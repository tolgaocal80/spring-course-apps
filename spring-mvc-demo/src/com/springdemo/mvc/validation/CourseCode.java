package com.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

// @interface is used for creating any kind of annotations on Java
// validatedBy means, logic to validate this annotation is provided by CourseCodeConstraintValidator class
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
// can apply our annotation to a method or a field
@Target({ElementType.METHOD, ElementType.FIELD})
// Retention polict (tutulma politikasi) determines how long this annotation will be held
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	//define default course code
	public String value() default "LUV";
	
	//define default error message
	public String message() default "must start with 'LUV'";
	
	//define default groups
	public Class<?>[] groups() default {};
	
	// define default payloads
	public Class<? extends Payload>[] payload() default {};
	
	
	
}












