package com.logistics.inventorySystem.controllers;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/inventory")
public class InventoryItemController {

    @GetMapping
    public List<String> getInventories() {
        List<String> data = new ArrayList<>();
        return data;
    }

    @PostMapping
    public void createItem() {
        System.out.println("createItem");
    }

}
