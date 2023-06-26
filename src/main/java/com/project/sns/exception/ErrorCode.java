package com.project.sns.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    NOT_IMPLEMENTED(HttpStatus.NOT_IMPLEMENTED, "not implemented"),
    DUPLICATED_USER_NAME(HttpStatus.CONFLICT, "User name is Duplicated"),;

    private final HttpStatus status;
    private final String message;
}
