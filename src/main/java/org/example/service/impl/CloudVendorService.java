package org.example.service.impl;

import org.example.exception.CloudVendorNotFoundException;
import org.example.model.CloudVendor;
import org.example.repository.CloudVendorRepository;
import org.example.service.CloudVendorInterface;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorService implements CloudVendorInterface {
    CloudVendorRepository cloudVendorRepository;
    public CloudVendorService(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "createCloudVendor method is success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "updateCloudVendor is success";
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        cloudVendorRepository.deleteById(vendorId);
        return "deleteCloudVendor is success";
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {

        if (cloudVendorRepository.findById(vendorId).isEmpty())
            throw new CloudVendorNotFoundException("The requested cloud vendor is not present in the db");
        return cloudVendorRepository.findById(vendorId).get();
    }
}
