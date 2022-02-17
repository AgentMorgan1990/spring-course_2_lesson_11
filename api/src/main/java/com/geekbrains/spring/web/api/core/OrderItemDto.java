package com.geekbrains.spring.web.api.core;

import java.math.BigDecimal;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Модель OrderItem")
public class OrderItemDto {
    @Schema(description = "Id продукта", required = true, example = "1")
    private Long productId;
    @Schema(description = "Название продукта", required = true, example = "Молоко")
    private String productTitle;
    @Schema(description = "Количество продукта в заказе", required = true, example = "12")
    private int quantity;
    @Schema(description = "Цена за один продукт", required = true, example = "50.00")
    private BigDecimal pricePerProduct;
    @Schema(description = "Цена за все продукты", required = true, example = "100.00")
    private BigDecimal price;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPricePerProduct() {
        return pricePerProduct;
    }

    public void setPricePerProduct(BigDecimal pricePerProduct) {
        this.pricePerProduct = pricePerProduct;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public OrderItemDto() {
    }

    public OrderItemDto(Long productId, String productTitle, int quantity, BigDecimal pricePerProduct, BigDecimal price) {
        this.productId = productId;
        this.productTitle = productTitle;
        this.quantity = quantity;
        this.pricePerProduct = pricePerProduct;
        this.price = price;
    }
}
