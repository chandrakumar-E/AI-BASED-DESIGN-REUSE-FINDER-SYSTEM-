package com.fyp.plm.plm.service.Impl;

import com.fyp.plm.plm.entity.DesignRevision;
import com.fyp.plm.plm.repository.DesignRevisionRepository;
import com.fyp.plm.plm.service.DesignRevisionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service

public class DesignRevisionServiceImpl implements DesignRevisionService {

    private final DesignRevisionRepository repo;

    public DesignRevisionServiceImpl(DesignRevisionRepository repo) {
        this.repo = repo;
    }

    @Override
    public DesignRevision createRevision(DesignRevision revision) {
        return repo.save(revision);
    }
}
