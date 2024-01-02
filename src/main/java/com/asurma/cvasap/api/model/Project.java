package com.asurma.cvasap.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "projects")
@Getter
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String role;

    private String imageUrl;

    private LocalDate startDate;

    private LocalDate endDate;

    @ElementCollection
    @CollectionTable(name = "achievements_or_deliverables", joinColumns = @JoinColumn(name = "project_id"))
    @Column(name = "achievement")
    private List<String> achievementsOrDeliverables;

    @ElementCollection
    @CollectionTable(name = "artifact_examples", joinColumns = @JoinColumn(name = "project_id"))
    private List<ArtifactExample> artifactExamples;

    @ElementCollection
    @CollectionTable(name = "technologies_or_tools", joinColumns = @JoinColumn(name = "project_id"))
    @Column(name = "technology_or_tool")
    private List<String> technologiesOrTools;

    // Getters and Setters, Constructors, etc.
}
