@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@Valid @RequestBody UserDTO dto) {
        User created = userService.createUser(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }
}
