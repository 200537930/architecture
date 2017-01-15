package controller;

import service.IUserService;
import service.impl.UserService;

/**
 * Created by pg on 17/1/15.
 */
public class UserController {

    private IUserService userService = new UserService();

    public static void main(String[] args) {
        new UserController().userService.sayHi();
    }

}
