package main.java.jp.co.axiz.service;

import java.sql.Connection;
import java.util.List;

import main.java.jp.co.axiz.dao.ProductDao;
import main.java.jp.co.axiz.entity.Product;
import main.java.jp.co.axiz.util.DbUtil;

public class ProductService {

	
	//引数なしコンストラクタ
	public ProductService() {
	}
	
	//product_name, priceを引数に入れてproductDaoのインスタンスメソッドに
	//入れて判定してもらう。

	public List<Product> findById(String product_name, Integer price) {
        try (Connection conn = DbUtil.getConnection()) {
        	
        	//確認用出力プリント文
            System.out.println(product_name);
            System.out.println(price);
            
            Product p = new Product(product_name,price);

        	//ProductDaoのインスタンスを生成
        	ProductDao pd = new ProductDao(conn);
        	//ProductDaoのインスタンスメソッドのfindメソッドを呼び出す
        	List<Product> product = pd.find(p);

            return  product;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
	
}
