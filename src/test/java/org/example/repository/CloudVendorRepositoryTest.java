package org.example.repository;

import org.example.model.CloudVendor;
import org.example.service.impl.CloudVendorService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class CloudVendorRepositoryTest {

    @Autowired
    private CloudVendorRepository cloudVendorRepository;
    CloudVendor cloudVendor;
    @BeforeEach
    void setUp() {
        cloudVendor = new CloudVendor("1","Amazon","USA","XXX");
        cloudVendorRepository.save(cloudVendor);
    }

    @AfterEach
    void tearDown() {
        cloudVendor= null;
        cloudVendorRepository.deleteAll();
    }

    @Test
    void findByVendorName_found() {
        List<CloudVendor> cloudVendorList = cloudVendorRepository.findByVendorName("Amazon");
        assertThat(cloudVendorList.get(0).getVendorId()).isEqualTo(cloudVendor.getVendorId());
        assertThat(cloudVendorList.get(0).getVendorAddress()).isEqualTo(cloudVendor.getVendorAddress());
    }
    @Test
    void findByVendorName_Not_found() {
        List<CloudVendor> cloudVendorList = cloudVendorRepository.findByVendorName("Amazoon");
        assertThat(cloudVendorList.isEmpty()).isTrue();
        //assertThat(cloudVendorList.get(0).getVendorAddress()).isEqualTo(cloudVendor.getVendorAddress());
    }
}