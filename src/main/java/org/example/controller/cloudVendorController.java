package org.example.controller;

import io.swagger.annotations.ApiOperation;
import org.example.model.CloudVendor;
import org.example.response.ResponseHandler;
import org.example.service.impl.CloudVendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class cloudVendorController {
    CloudVendorService cloudVendorService;
    public cloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorId}")
    //@ApiOperation(value = "Cloud vendor ID",notes = "Provide Vendor Details",response = ResponseEntity.class)
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
        //return cloudVendorService.getCloudVendor(vendorId);
        return ResponseHandler.responseBuilder("Requested vendore details are here", HttpStatus.OK,cloudVendorService.getCloudVendor(vendorId));
//      return new CloudVendor("C1","Vendor Name1","Address1","0123456789");
    }
    @GetMapping("/")
    public List<CloudVendor> getAllCloudVendorDetails()
    {
        return cloudVendorService.getAllCloudVendors();
//      return new CloudVendor("C1","Vendor Name1","Address1","0123456789");
    }
    @PostMapping("/")
    public  String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Returned Successfully...";
    }
    @PutMapping("/")
    public  String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor details updated Successfully...";
    }
    @DeleteMapping("{vendorId}")
    public  String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
        cloudVendorService.deleteCloudVendor(vendorId) ;
        return "Cloud Vendor details deleted Successfully...";
    }
}
