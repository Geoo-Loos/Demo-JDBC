package aplication;



import modelDao.SellerDao;

import modelEntities.Seller;

public class Program {
    public static void main(String[] args) {
        
       

        SellerDao sellerDao = modelDao.DaoFactory.createSellerDao();

        Seller seller= sellerDao.findById(3);
        System.out.println(seller);
       

    }
}
