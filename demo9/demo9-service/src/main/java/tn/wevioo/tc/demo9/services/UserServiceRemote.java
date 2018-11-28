package tn.wevioo.tc.demo9.services;

import javax.ejb.Remote;

import tn.wevioo.tc.demo9.entities.User;
import tn.wevioo.tc.demo9.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}
