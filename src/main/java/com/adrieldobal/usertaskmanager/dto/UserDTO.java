public class UserDTO {
    @NotBlank(message = "El nombre de usuario es obligatorio.")
    private String username;

    @Email(message = "El email no tiene formato válido.")
    private String email;

    @NotBlank(message = "La contraseña es obligatoria.")

    private String password;

    // Getters & Setters
}
