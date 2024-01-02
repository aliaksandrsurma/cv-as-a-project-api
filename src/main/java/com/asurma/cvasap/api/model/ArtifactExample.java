package com.asurma.cvasap.api.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class ArtifactExample {

    private String name;

    private String sampleScreenshot;

    private String description;
}
