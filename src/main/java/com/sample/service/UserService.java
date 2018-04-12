package com.sample.service;

import com.sample.model.User;

public interface UserService extends BaseService<User> {

	public User findUserByEmail(String email);

	//public void saveUser(User user);
}
