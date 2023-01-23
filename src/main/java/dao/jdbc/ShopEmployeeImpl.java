package dao.jdbc;

import dao.IShopEmployee;
import models.ShopEmployee;
import utils.MySqlDao;

public class ShopEmployeeImpl extends MySqlDao implements IShopEmployee {

	public void insertEntity(ShopEmployee t) {

	}

	public ShopEmployee readEntityById(int id) {
		return null;
	}

	@Override
	public void deleteEntityById(int id) {

	}

	@Override
	public void updateEntityById(int id, ShopEmployee t) {

	}

}
