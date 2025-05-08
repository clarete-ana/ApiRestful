package me.dio.projetoApiRest.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String featureIcon;
    private String description;

    public BaseItem(){}

    public BaseItem(String icon, String description) {
        this.featureIcon = icon;
        this.description = description;
    }

    public String getIcon() {
        return featureIcon;
    }

    public void setIcon(String icon) {
        this.featureIcon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
