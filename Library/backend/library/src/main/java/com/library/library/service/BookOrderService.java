package com.library.library.service;

import com.library.library.dto.BookOrderDto;
import com.library.library.model.BookOrder;
import org.springframework.stereotype.Service;

import java.util.Collection;

public interface BookOrderService {
    public Collection<BookOrderDto> getAllOrders();
    public BookOrderDto getOrderById(Integer id);
    public void delete(Integer id);
    public BookOrderDto postOrder(BookOrderDto bookOrderDto);
    public BookOrderDto updateOrder(BookOrderDto bookOrderDto, Integer id);
}
