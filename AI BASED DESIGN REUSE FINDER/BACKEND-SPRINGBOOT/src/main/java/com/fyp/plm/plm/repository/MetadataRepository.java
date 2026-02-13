package com.fyp.plm.plm.repository;

import com.fyp.plm.plm.entity.Metadata;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MetadataRepository extends JpaRepository<Metadata, Long> {
    List<Metadata> findByRevision_Id(Long revisionId);
}
