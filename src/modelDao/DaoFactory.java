package modelDao;

import jdbc.DB;

public class DaoFactory {
    
    public static SellerDao createSellerDao() {
        return new modelDaoImpl.SellerDaoJDBC(DB.getConnection());
    }
}
