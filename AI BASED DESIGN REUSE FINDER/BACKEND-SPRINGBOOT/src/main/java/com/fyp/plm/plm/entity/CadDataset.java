package com.fyp.plm.plm.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "cad_dataset")
public class CadDataset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;

    private String fileType;

    private String filePath;

    private Long fileSize;

    @ManyToOne
    @JoinColumn(name = "revision_id")
    private DesignRevision revision;
}
