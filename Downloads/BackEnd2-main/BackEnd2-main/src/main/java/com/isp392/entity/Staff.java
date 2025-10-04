package com.isp392.entity;

import com.isp392.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "Staff")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int staffId;
    @Column(name = "staffName", nullable = false, length = 100)
    String staffName;
    @Column(name = "staffEmail", nullable = true, length = 100, unique = true)
    String staffEmail;
    @Column(name = "staffPhone", nullable = false, length = 15)
    String staffPhone;
    @Column(name = "username", nullable = false, length = 50, unique = true)
    String username;
    @Column(name = "password", nullable = false, length = 100)
    String password;
    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false, length = 10)
    Role role;

}
