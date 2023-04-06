package space.bumtiger.customLogout.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table(name = "users")
public class User {
	@Id
	private Integer id;

	private String login;

	private String password;

	private String role;

	private String language;
}
