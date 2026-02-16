package com.fyp.plm.tc.adapter;

import com.fyp.plm.plm.entity.CadDataset;

public interface TeamcenterDatasetService {

    CadDataset uploadDataset(Long revisionId, CadDataset dataset);

}
