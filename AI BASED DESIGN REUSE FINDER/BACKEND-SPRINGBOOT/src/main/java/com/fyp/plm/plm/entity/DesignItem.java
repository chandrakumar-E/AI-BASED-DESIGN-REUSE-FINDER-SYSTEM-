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
@Table(name = "design_item")
public class DesignItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Teamcenter Item ID (e.g., A000123)
    @Column(unique = true, nullable = false)
    private String itemId;

    private String name;

    private String type; // Part, Assembly

    private String owner;

    private LocalDateTime createdDate;

    @OneToMany(mappedBy = "designItem", cascade = CascadeType.ALL)
    private List<DesignRevision> revisions;
}
