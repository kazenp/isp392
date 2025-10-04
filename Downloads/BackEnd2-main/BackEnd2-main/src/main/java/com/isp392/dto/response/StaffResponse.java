package com.isp392.dto.response;

import com.isp392.enums.Role;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StaffResponse {
    long staffId;
    String username;
    String password;
    String staffName;
    String staffPhone;
    String staffEmail;
    Role role;
}
