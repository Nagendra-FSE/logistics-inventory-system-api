package com.logistics.inventorySystem.inventoryRepo;

import com.logistics.inventorySystem.models.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InventoryRepository extends JpaRepository<InventoryItem, Long> {
}
