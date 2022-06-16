package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDAo() {
	return new SellerDaoJDBC();
	}
}
