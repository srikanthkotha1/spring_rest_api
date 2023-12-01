package org.example.repository;

import org.example.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CloudVendorRepository extends JpaRepository <CloudVendor,String> {
    public List<CloudVendor> findByVendorName(String VendorName);
}
