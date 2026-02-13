package com.fyp.plm.tc.adapter;

import com.fyp.plm.plm.entity.DesignRevision;

import java.util.List;
import java.util.Map;

public interface TeamcenterSearchService {

    List<DesignRevision> searchByMetadata(Map<String, String> attributes);

    List<DesignRevision> searchByFileHash(String fileHash);
}
