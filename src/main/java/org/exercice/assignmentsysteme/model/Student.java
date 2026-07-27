package org.exercice.assignmentsysteme.model;

import org.hibernate.mapping.List;

public class Students {
    private int id;
    private String name;
    private String email;
    private double average;
    private List<Project> projects;
}
