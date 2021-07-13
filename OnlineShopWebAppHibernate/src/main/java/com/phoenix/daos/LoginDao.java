package com.phoenix.daos;
//author: raja.kumar@stltech.in
import java.util.List;

import com.phoenix.data.User;
//author:raja.kumar@stltech.in
//version:2.0

public interface LoginDao {
     
	List<User>getAllUser();
	User getUserById(String username);
	
	void insert(User user);
	void update(User user);
	void delete(User user);
}
