package com.cuddlepuddle.cuddlePuddle.Models;



public class ArtProjects{
    private String artTitle;
    private String artCategory;
    private String artItemDescription;
    private double artCost;
    private int id;

    public ArtProjects(int id, String artTitle, String artCategory, String artItemDescription, double artCost){
        this.id = id;
        this.artTitle = artTitle;
        this.artCategory = artCategory;
        this.artItemDescription = artItemDescription;
        this.artCost = artCost;
    }

    @Override
    public String toString(){return artTitle;}

    public String getArtTitle(){return artTitle;}

    public String getArtCategory(){return artCategory;}

    public String getArtItemDescription(){return artItemDescription;}

    public double getArtCost(){return artCost;}

    public int getId(){return  id;}


}