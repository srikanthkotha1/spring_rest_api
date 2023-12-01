package org.example.service.impl;

import org.example.model.CloudVendor;
import org.example.repository.CloudVendorRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

//import static org.junit.jupiter.api.Assertions.*;

class CloudVendorServiceTest {

    @Mock
    private CloudVendorRepository cloudVendorRepository;
    private CloudVendorService cloudVendorService;
    AutoCloseable autoCloseable;
    CloudVendor cloudVendor;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createCloudVendor() {
    }

    @Test
    void updateCloudVendor() {
    }

    @Test
    void deleteCloudVendor() {
    }

    @Test
    void getAllCloudVendors() {
    }

    @Test
    void getCloudVendor() {
    }
}