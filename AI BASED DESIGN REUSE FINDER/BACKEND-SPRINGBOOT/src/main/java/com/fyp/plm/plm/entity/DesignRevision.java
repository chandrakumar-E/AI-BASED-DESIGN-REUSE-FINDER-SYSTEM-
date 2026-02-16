package com.fyp.plm.plm.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "design_revision")
public class DesignRevision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Teamcenter Revision ID (e.g., A, B)
    private String revisionId;

    private String status; // InWork, Released

    private String description;

    private LocalDateTime createdDate;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private DesignItem designItem;

    @OneToMany(mappedBy = "revision", cascade = CascadeType.ALL)
    private List<CadDataset> datasets;

    @OneToMany(mappedBy = "revision", cascade = CascadeType.ALL)
    private List<Metadata> metadataList;
}
