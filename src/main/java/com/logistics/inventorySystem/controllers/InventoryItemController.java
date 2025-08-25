package com.logistics.inventorySystem.controllers;


import com.logistics.inventorySystem.DTO.APIResponse;
import com.logistics.inventorySystem.DTO.InventoryItemDTO;
import com.logistics.inventorySystem.inventoryRepo.InventoryRepository;
import com.logistics.inventorySystem.models.InventoryItem;
import com.logistics.inventorySystem.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/inventory")
@CrossOrigin(origins = "*")
public class InventoryItemController {

    @Autowired
    InventoryService inventoryService;

    @GetMapping
    public APIResponse<InventoryItem> getInventories() {
       return new APIResponse<InventoryItem>(200, inventoryService.getInventories());
    }

    @PostMapping
    public APIResponse createItem(@RequestBody InventoryItemDTO item) {
         inventoryService.createData(item);
       return new APIResponse<>(201, "Inventory item created succesfully");
    }

}
