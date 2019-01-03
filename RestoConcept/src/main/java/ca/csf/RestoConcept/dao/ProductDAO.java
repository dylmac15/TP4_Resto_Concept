package ca.csf.RestoConcept.dao;

import ca.csf.RestoConcept.entity.Product;
import ca.csf.RestoConcept.model.PaginationResult;
import ca.csf.RestoConcept.model.ProductInfo;

public interface ProductDAO {



    public Product findProduct(String code);

    public ProductInfo findProductInfo(String code) ;


    public PaginationResult<ProductInfo> queryProducts(int page,
                                                       int maxResult, int maxNavigationPage  );

    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                                                       int maxNavigationPage, String likeName);

    public void save(ProductInfo productInfo);

}