package org.example.service;

import org.example.model.CloudVendor;

import java.util.List;

public interface CloudVendorInterface {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String vendorId);
    public List<CloudVendor> getAllCloudVendors();
    public CloudVendor getCloudVendor(String vendorId);
}
