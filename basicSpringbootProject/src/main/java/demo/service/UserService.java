package demo.service;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import demo.repostrory.UserRepostory;

import java.util.ArrayList;
import java.util.List;

@Service  // It is our business layer  , here we do what to do date recieved from repoatory , like common resuable methods
public class UserService {
    private  final UserRepostory repo;
    private final List<User>users = new ArrayList<>();


    //constructor
    @Autowired
    public UserService(UserRepostory repo) {
        this.repo = repo;
        // "this"  means access  this class function , we create constructor via acccesind UserRepostory class

    }

    public String addUser(User user){
        users.add(user);

        return "new User successfully created";

    }

    public List<User> getUser(){
        return users;
    }

    public String updateUser(int id, User updateUser){

      List<User> users =  repo.getAlluser();

        for (User user : users) {
            if(user.getId() == id){
                user.setName(updateUser.getName());
                user.setEmail(updateUser.getEmail());
                return "Update Sucessfull";
            }
        }
        return "user not found";





    }

}
