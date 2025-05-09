package me.dio.projetoApiRest.model;

import jakarta.persistence.Entity;
@Entity(name = "tb_feature")
public class Feature extends BaseItem {

    public Feature(){}

    public Feature(String icon, String description) {
        super(icon, description);
    }
}
