package ph.com.alliance.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ph.com.alliance.entity.User2;

public interface ModuleDao {

	public List<User2> getAllUsers(EntityManager em);

	public void addUser(User2 user, EntityManager em);

	public User2 getUser(String uid, EntityManager em);

	public void editUser(User2 user, EntityManager em);

	public void deleteUsers(String[] userIdList, EntityManager em);
}
