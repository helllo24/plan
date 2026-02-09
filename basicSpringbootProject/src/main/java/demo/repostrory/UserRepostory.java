package demo.repostrory;

import model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository  // it responsible of data access , not contains business logic
            // It like page class - only action and locators
public class UserRepostory {

    private List<User> users = new ArrayList<>();

    public void saveUser(){
        boolean b = users.addAll(users);
    }

    public List<User> getAlluser() {
        return users;
    }


}



