package com.stg.exception;

import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

//@RestControllerAdvice
//@Slf4j
public class GlobalExceptionTranslator {
	/*
	 * @ExceptionHandler(InsufficientAuthenticationException.class) public
	 * BaseResponse<Object> handleError(InsufficientAuthenticationException e) {
	 * log.error("Permission Denied", e); return BaseResponse .builder()
	 * .code(ResultCode.INTERNAL_SERVER_ERROR.getCode()) .msg(e.getMessage())
	 * .data(null) .build(); }
	 */
}