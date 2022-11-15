package web.springboot.pp_3_1_2.service;



import web.springboot.pp_3_1_2.model.User;

import java.util.List;

public interface UserService {

    public void add(User user);
    public List<User> getList();
    public User getUser(long id);
    public void deleteUser(long id);
    public void editUser(User user);
}
