package fr.karim.form;

import lombok.Data;

@Data
public class FormAccount {
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private String typeProject;
    private String description;
}
