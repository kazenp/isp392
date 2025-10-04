package com.isp392.dto.request;

import com.isp392.enums.Role;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StaffCreationRequest {
    @Size(min = 3, message = "USERNAME_INVALID")
     String username;

    @Size(min = 8, message = "PASSWORD_INVALID")
     String password;

     String staffName;

     String staffPhone;

     String staffEmail;

     Role role;

}
