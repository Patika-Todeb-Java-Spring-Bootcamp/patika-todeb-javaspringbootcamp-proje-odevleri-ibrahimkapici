package com.getused.second.controller;

import com.getused.second.model.dto.UserDataDTO;
import com.getused.second.model.dto.UserLoginDTO;
import com.getused.second.model.entity.User;
import com.getused.second.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;
import java.util.List;

    @Validated
    @RestController
    @RequestMapping("/users")
    public class UserController {

        @Autowired
        private UserService userService;

        @PreAuthorize("hasRole('ROLE_ADMIN') OR hasRole('ROLE_USER')")
        @GetMapping
        public List<User> getAllUsers() {
            return userService.getAll();
        }

        @PostMapping("/signin")
        public String login(@Valid @RequestBody UserLoginDTO userLoginDTO) {
            return userService.signin(userLoginDTO.getUsername(), userLoginDTO.getPassword());
        }

        @PostMapping("/signup")
        public String signup(@RequestBody @Valid UserDataDTO userDataDTO) {
            User user = new User();
            user.setUsername(userDataDTO.getUsername());
            user.setEmail(userDataDTO.getEmail());
            user.setPassword(userDataDTO.getPassword());
//        return userService.signup(modelMapper.map(user, User.class));
            return userService.signup(user, false);
        }

        //    @PreAuthorize("hasRole('ROLE_ADMIN')")
        @RolesAllowed("ROLE_ADMIN")
        @DeleteMapping(value = "/delete/{username}")
        public String delete(@PathVariable String username) {
            userService.delete(username);
            return username;
        }
}
