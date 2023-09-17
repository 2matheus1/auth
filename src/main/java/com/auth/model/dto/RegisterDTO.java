package com.auth.model.dto;

import com.auth.model.user.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
