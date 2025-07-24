@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(UserDTO dto) {
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword()); // luego podés encriptarla con BCrypt
        return userRepository.save(user);
    }
}
