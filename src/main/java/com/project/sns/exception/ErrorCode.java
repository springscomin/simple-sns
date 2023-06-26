package com.project.sns.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    DUPLICATED_USER_NAME(HttpStatus.CONFLICT, "User name is Duplicated"),
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "user not founded"),
    INVALID_PASSWORD(HttpStatus.UNAUTHORIZED, "password is invalid"),
    NOT_IMPLEMENTED(HttpStatus.NOT_IMPLEMENTED, "not implemented"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Interna    l Server Error"),
    ;

    private final HttpStatus status;
    private final String message;
}
