package app.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "users")
public class User {
    private String userId;
    private String ipAddress;
    private String userName;
}