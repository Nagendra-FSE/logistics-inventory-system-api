package com.logistics.inventorySystem.services;

import com.logistics.inventorySystem.DTO.InventoryItemDTO;
import com.logistics.inventorySystem.inventoryRepo.InventoryRepository;
import com.logistics.inventorySystem.models.InventoryItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    InventoryRepository inventoryRepo;

    public List<InventoryItem> getInventories() {
        System.out.println(inventoryRepo.findAll());
        return inventoryRepo.findAll();
    }

    public InventoryItem createData(InventoryItemDTO data) {
        InventoryItem item = new InventoryItem();
        item.setItemName(data.itemName());
        item.setLocation(data.location());
        item.setQuantity(data.quantity());
        item.setStatus(data.status());

       return inventoryRepo.save(item);
    }
}
