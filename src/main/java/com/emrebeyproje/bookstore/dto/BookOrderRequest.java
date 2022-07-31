package com.emrebeyproje.bookstore.dto;

import lombok.Data;
import java.util.List;
/**
 * @author Emre YILDIZ
 */
@Data
public class BookOrderRequest
{
    private List<Integer> bookIdList;
    private String userName;
}
