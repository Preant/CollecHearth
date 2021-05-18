package com.sirocco.collechearth.utils;

public class CardInfo {
    private final String cardClass;
    private final String expansion;
    private final String name;
    private final String rarity;
    private final String id;
    private boolean foil;

    public CardInfo(String gatheredData) {
        String [] split = gatheredData.split("/");
        this.expansion = split[0];
        this.cardClass = split[1];
        this.name = split[2];
        this.rarity = split[3];
        this.id = split[4];
        this.foil = false;
    }

    public CardInfo(String gatheredData, boolean foil) {
        String [] split = gatheredData.split("/");
        this.expansion = split[0];
        this.cardClass = split[1];
        this.name = split[2];
        this.rarity = split[3];
        this.id = split[4];
        this.foil = foil;
    }

    public CardInfo(CardInfo another) {
        this.expansion = another.getExpansion();
        this.cardClass = another.getCardClass();
        this.name = another.getName();
        this.rarity = another.getRarity();
        this.id = another.getId();
        this.foil = another.getFoil();
    }

    public String getCardClass() {
        return (this.cardClass);
    }

    public String getExpansion() {
        return (this.expansion);
    }

    public String getName() {
        return (this.name);
    }

    public String getRarity() {
        return (this.rarity);
    }

    public String getId() {
        return (this.id);
    }

    public boolean getFoil() {
        return (this.foil);
    }

    public void setFoil(boolean foil) {
        this.foil = foil;
    }
}
