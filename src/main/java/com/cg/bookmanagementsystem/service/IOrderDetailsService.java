package com.cg.bookmanagementsystem.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cg.bookmanagementsystem.entity.OrderDetails;
import com.cg.bookmanagementsystem.exception.ResourceNotFoundException;

public interface IOrderDetailsService {
	public OrderDetails orderDetails(String orderId,OrderDetails orderDetails) throws ResourceNotFoundException;
	public List<OrderDetails> getAllOrderDetailsByOrderId(String orderId);
    public ResponseEntity<?> deleteImage(String orderId) throws ResourceNotFoundException;
	public List<OrderDetails> getOrderDetailsBySellerId(Long sellerId);
	   public ResponseEntity<OrderDetails> updateSeller(Long orderDetailsId,
		         OrderDetails orderDetails) throws ResourceNotFoundException ;
	public List<OrderDetails> getOrderDetailsByBookId(Long bookId);
}

