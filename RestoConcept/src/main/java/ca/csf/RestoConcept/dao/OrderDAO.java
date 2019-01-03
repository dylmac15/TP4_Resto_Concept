package ca.csf.RestoConcept.dao;

import java.util.List;

import ca.csf.RestoConcept.model.CartInfo;
import ca.csf.RestoConcept.model.OrderDetailInfo;
import ca.csf.RestoConcept.model.OrderInfo;
import ca.csf.RestoConcept.model.PaginationResult;

public interface OrderDAO {

    public void saveOrder(CartInfo cartInfo);

    public PaginationResult<OrderInfo> listOrderInfo(int page,
                                                     int maxResult, int maxNavigationPage);

    public OrderInfo getOrderInfo(String orderId);

    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}