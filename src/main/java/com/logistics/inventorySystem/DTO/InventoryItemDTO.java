package com.logistics.inventorySystem.DTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record InventoryItemDTO ( Long id,
                                 @NotBlank String itemName,
                                 @Min(0) int quantity,
                                 @NotBlank String location,
                                 @NotBlank String status)
{}




