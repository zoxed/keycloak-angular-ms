package org.sid.supplierservice.repositories;

import org.sid.supplierservice.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SupplierRepository extends JpaRepository<Supplier,Long> {
}
