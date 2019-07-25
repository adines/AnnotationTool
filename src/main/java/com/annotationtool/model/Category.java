package com.annotationtool.model;

/**
 * Class that defines a category of an image.
 * @author adines
 */
public class Category {
    //**************ATTRIBUTES*************************
    private String name; 
    
    //**************BUILDERS*************************
    /**
     * Builder of category.
     * @param name Name of the category.
     */
    public Category(String name)
    {
        this.name=name;
    }
    
    
    //**************GETTERS-SETTERS*************************
    /**
     * Method that returns the name of the category.
     * @return The name of the category.
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Method that modifies the name of the category.
     * @param name New name of the category.
     */
    public void setName(String name)
    {
        this.name=name;
    }
}