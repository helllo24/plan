package demo.controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import demo.service.UserService;

import java.util.List;

@RestController
public class UserController {

    private final UserService service;


    @Autowired
  public  UserController (UserService service){
      this.service = service;
  }

@PostMapping("/user")
public String postUser(@RequestBody User user){
    return    service.addUser(user);


}

@GetMapping("/user")
    public List<User> getUser(){
      return  service.getUser();
}

@PutMapping("/user/{id}")
    public String putUser(@PathVariable("id") int id, @RequestBody User UpdateUser){
      return  service.updateUser(id,UpdateUser);

}


}
