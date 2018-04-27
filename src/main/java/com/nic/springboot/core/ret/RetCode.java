package com.nic.springboot.core.ret;

/**
 * Created by james on 2018/4/26 0026.
 */
public enum RetCode {

	SUCCESS(200),
	FAIL(400),
	UNAUTHORIZED(401),
	NOT_FOUND(404),
	INTERNAL_SERVER_ERROR(500);

	public int code;

	RetCode(int code) {
		this.code = code;
	}
}
