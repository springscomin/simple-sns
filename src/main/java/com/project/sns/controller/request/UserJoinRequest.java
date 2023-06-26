package com.project.sns.controller.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class UserJoinRequest {
    private String userName;
    private String password;
}
