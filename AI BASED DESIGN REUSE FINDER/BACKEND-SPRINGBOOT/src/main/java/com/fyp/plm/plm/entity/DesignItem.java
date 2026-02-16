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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public List<DesignRevision> getRevisions() {
        return revisions;
    }

    public void setRevisions(List<DesignRevision> revisions) {
        this.revisions = revisions;
    }

    @OneToMany(mappedBy = "designItem", cascade = CascadeType.ALL)
    private List<DesignRevision> revisions;
}
