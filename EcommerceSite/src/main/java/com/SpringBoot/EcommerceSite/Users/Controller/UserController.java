package com.SpringBoot.EcommerceSite.Users.Controller;


import com.SpringBoot.EcommerceSite.Model.Login;
import com.SpringBoot.EcommerceSite.Model.Register;
import com.SpringBoot.EcommerceSite.Model.Users;
import com.SpringBoot.EcommerceSite.Users.Service.UserService;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class UserController {

private final UserService userService;

@GetMapping("/test")
public String testApi(){
    return "TestApi Works";
}
@PostMapping("/register")
public ResponseEntity<String> Register(@RequestBody Register register){
    return ReponseEntity.ok().body(userService.register(register));
}
@PostMapping("/login")
public ResponseEntity<?> login(@RequestBody Login login){
    return userService.authenticate(login);
}
@PutMapping("/{id}/{role}")
public ResponseEntity<Users> UpdateRole(@PathVariable int id, @PathVariable String role){
    return userService.Update(id,role);
}
}
