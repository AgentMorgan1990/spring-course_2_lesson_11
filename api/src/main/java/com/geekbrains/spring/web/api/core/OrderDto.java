package com.geekbrains.spring.web.api.core;

import java.math.BigDecimal;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Модель Заказа")
public class OrderDto {
    @Schema(description = "Id заказа", required = true, example = "1")
    private Long id;
    @Schema(description = "Имя клиента", required = true, example = "Bob")
    private String username;
    @Schema(description = "List OrderItem", required = true)
    private List<OrderItemDto> items;
    @Schema(description = "Общая цена за заказ", required = true, example = "1000.00")
    private BigDecimal totalPrice;
    @Schema(description = "Адрес", required = true, example = "Ленина 12")
    private String address;
    @Schema(description = "Телефон", required = true, example = "8916******")
    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<OrderItemDto> getItems() {
        return items;
    }

    public void setItems(List<OrderItemDto> items) {
        this.items = items;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public OrderDto() {
    }

    public OrderDto(Long id, String username, List<OrderItemDto> items, BigDecimal totalPrice, String address, String phone) {
        this.id = id;
        this.username = username;
        this.items = items;
        this.totalPrice = totalPrice;
        this.address = address;
        this.phone = phone;
    }
}
