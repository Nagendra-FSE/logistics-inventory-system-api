package com.logistics.inventorySystem.controllers;


import com.logistics.inventorySystem.DTO.InventoryItemDTO;
import com.logistics.inventorySystem.inventoryRepo.InventoryRepository;
import com.logistics.inventorySystem.models.InventoryItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/inventory")
public class InventoryItemController {

    @Autowired
    InventoryRepository inventoryRepo;

    @GetMapping
    public List<InventoryItemDTO> getInventories() {
//       return inventoryRepo.findAll();
    }

    @PostMapping
    public void createItem() {
        System.out.println("createItem");
    }

}
