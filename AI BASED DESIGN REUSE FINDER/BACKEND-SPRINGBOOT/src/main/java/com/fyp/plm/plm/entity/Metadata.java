package com.fyp.plm.plm.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "metadata")
public class Metadata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String attributeKey;   // material, weight, process
    private String attributeValue;

    @ManyToOne
    @JoinColumn(name = "revision_id")
    private DesignRevision revision;
}
