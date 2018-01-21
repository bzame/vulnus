package it.unipd.vulnus.dto;

public class BuildingMaterialDTO {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Database unique identifier.
     */
    private long id;
    /**
     * Name of the material.
     * For instance "BRICK"
     */
    private String name;
    /**
     * Longer description of the material.
     * For instance "A brick is building material used to make walls, pavements and other elements in masonry construction.".
     */
    private String description;
    
    /**
     * The resistance of a material to breaking under compression.
     * Measured in MPa (Mega Pascal).
     */
    private double compressiveStrenght;
    /**
     * The resistance of a material to breaking under tension.
     * Measured in MPa (Mega Pascal).
     */
    private double tensileStrenght;
    /**
     * The quantity of mass per unit volume of a substance.
     * Measured in Kg/m^3 (Kilograms per cubic-meter)
     */
    private double density;
    
    
    /**
     * Returns the unique identifier of this BuildingMaterial. 
     * @return integer code which identifies univocally the BuildingMaterial.
     */
    public long getId() {
        return id;
    }
    
    /**
     * Sets the unique identifier of this BuildingMaterial. 
     * @param id integer code which identifies univocally the BuildingMaterial.
     */
    public void setId(long id) {
        this.id = id;
    }
    
    /**
     * Returns the name of this BuildingMaterial.
     * The name of a material is a short string which describes the material to the user (i.e. "BRICK").
     * @return string name of the material.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the name of this BuildingMaterial.
     * The name of a material is a short string which describes the material to the user (i.e. "BRICK").
     * @param name string name of the material.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Returns a long description of the BuildingMaterial. 
     * The long description is used to give more detailed information about the material 
     * (i.e. "A brick is building material used to make walls, pavements and other elements in masonry construction.").
     * @return a string used as detailed description of the material.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Sets a long description of the BuildingMaterial. 
     * The long description is used to give more detailed information about the material 
     * (i.e. "A brick is building material used to make walls, pavements and other elements in masonry construction.").
     * @param description a string used as detailed description of the material.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Returns the compressive strength of the BuildingMaterial expressed in MPa (Mega Pascal).
     * Compressive strength is the resistance of a material to breaking under compression.
     * @return material compressive strength value.
     */
    public double getCompressiveStrenght() {
        return compressiveStrenght;
    }
    
    /**
     * Sets the compressive strength of the BuildingMaterial expressed in MPa (Mega Pascal).
     * Compressive strength is the resistance of a material to breaking under compression.
     * @param compressiveStrenght material compressive strength value.
     */
    public void setCompressiveStrenght(double compressiveStrenght) {
        this.compressiveStrenght = compressiveStrenght;
    }
    
    /**
     * Returns the tensile strength of the BuildingMaterial expressed in MPa (Mega Pascal).
     * Tensile strength is the resistance of a material to breaking under tension.
     * @return material tensile strength value. 
     */
    public double getTensileStrenght() {
        return tensileStrenght;
    }

    /**
     * Sets the tensile strength of the BuildingMaterial expressed in MPa (Mega Pascal).
     * Tensile strength is the resistance of a material to breaking under tension.
     * @param tensileStrenght material tensile strength value. 
     */
    public void setTensileStrenght(double tensileStrenght) {
        this.tensileStrenght = tensileStrenght;
    }
    
    /**
     * Returns the density of the BuildingMaterial expressed in Kg/m^3 (Kilograms per cubic-meter).
     * Density is the quantity of mass per unit volume of a substance.
     * @return material density value.
     */
    public double getDensity() {
        return density;
    }
    
    /**
     * Sets the density of the BuildingMaterial expressed in Kg/m^3 (Kilograms per cubic-meter).
     * Density is the quantity of mass per unit volume of a substance.
     * @param density material density value.
     */
    public void setDensity(double density) {
        this.density = density;
    }

}
