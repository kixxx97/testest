package ph.com.alliance.service;

import java.util.List;

import ph.com.alliance.entity.User2;

public interface ModuleService {

	public String addTwoNumbers(String firstNumber, String secondNumber);

	public List<User2> getAllUsers();

	public void addUser(User2 user);

	public User2 getUser(String uid);

	public void editUser(User2 user);

	public void deleteUsers(String[] userIdList);
}
