package com.logistics.inventorySystem.inventoryRepo;

import com.logistics.inventorySystem.models.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<InventoryItem, Long> {
}
