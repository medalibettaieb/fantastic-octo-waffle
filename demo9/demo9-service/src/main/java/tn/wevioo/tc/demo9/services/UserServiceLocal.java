package tn.wevioo.tc.demo9.services;

import javax.ejb.Local;

import tn.wevioo.tc.demo9.entities.User;
import tn.wevioo.tc.demo9.utilities.IGenericDAO;

@Local
public interface UserServiceLocal extends IGenericDAO<User> {

	User login(String login, String password);

}
