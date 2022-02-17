package com.geekbrains.spring.web.api.carts;

import java.math.BigDecimal;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Модель товара в корзине")
public class CartItemDto {
    @Schema(description = "Id товара", required = true, example = "12")
    private Long productId;
    @Schema(description = "Название товара", required = true, example = "Молоко")
    private String productTitle;
    @Schema(description = "Количество товаров", required = true, example = "8")
    private int quantity;
    @Schema(description = "цена за товар", required = true, example = "500.00")
    private BigDecimal pricePerProduct;
    @Schema(description = "Общая сумма за все тоары в корзине с этим наименованием", required = true, example = "5000" +
            ".00")
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

    public CartItemDto() {
    }

    public CartItemDto(Long productId, String productTitle, int quantity, BigDecimal pricePerProduct, BigDecimal price) {
        this.productId = productId;
        this.productTitle = productTitle;
        this.quantity = quantity;
        this.pricePerProduct = pricePerProduct;
        this.price = price;
    }
}
