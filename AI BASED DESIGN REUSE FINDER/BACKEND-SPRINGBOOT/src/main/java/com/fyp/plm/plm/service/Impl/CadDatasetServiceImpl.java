package com.fyp.plm.plm.service.Impl;

import com.fyp.plm.plm.entity.CadDataset;
import com.fyp.plm.plm.repository.CadDatasetRepository;
import com.fyp.plm.plm.service.CadDatasetService;
import org.springframework.stereotype.Service;

@Service
public class CadDatasetServiceImpl implements CadDatasetService {

    private final CadDatasetRepository repo;

    public CadDatasetServiceImpl(CadDatasetRepository repo) {
        this.repo = repo;
    }

    @Override
    public CadDataset save(CadDataset dataset) {
        return repo.save(dataset);
    }
}
