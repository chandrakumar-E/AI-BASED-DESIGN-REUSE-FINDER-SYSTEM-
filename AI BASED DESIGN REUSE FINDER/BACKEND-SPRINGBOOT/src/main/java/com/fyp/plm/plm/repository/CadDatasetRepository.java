package com.fyp.plm.plm.repository;

import com.fyp.plm.plm.entity.CadDataset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CadDatasetRepository extends JpaRepository<CadDataset, Long> {
    List<CadDataset> findByRevision_Id(Long revisionId);
}
