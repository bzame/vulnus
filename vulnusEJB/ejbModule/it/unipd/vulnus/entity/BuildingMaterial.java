/**
 * 
 */
package it.unipd.vulnus.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import it.unipd.vulnus.dto.BuildingMaterialDTO;

/**
 * A building material is the material of which a building is made.
 * This class is the Entity representation of such thing.
 * 
 * @author Zamengo Bruno
 */
@Entity
@Table(name="building_material")
@NamedQueries({
    @NamedQuery(name="BuildingMaterial.findAll", query="SELECT bm FROM BuildingMaterial bm")
    , @NamedQuery(name="BuildingMaterial.findById", query="SELECT bm FROM BuildingMaterial bm WHERE bm.id = :id")
    , @NamedQuery(name="BuildingMaterial.findByName", query="SELECT bm FROM BuildingMaterial bm WHERE bm.name = :name")
})
public class BuildingMaterial implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Database unique identifier.
     */
    @Id
    @Column(name="id")
    private long id;
    /**
     * Name of the material.
     * For instance "BRICK"
     */
    @Column(name="name", unique=true)
    private String name;
    /**
     * Longer description of the material.
     * For instance "A brick is building material used to make walls, pavements and other elements in masonry construction.".
     */
    @Column(name="description")
    private String description;
    
    /**
     * The resistance of a material to breaking under compression.
     * Measured in MPa (Mega Pascal).
     */
    @Column(name="compressive_strenght")
    private double compressiveStrenght;
    /**
     * The resistance of a material to breaking under tension.
     * Measured in MPa (Mega Pascal).
     */
    @Column(name="tensile_strenght")
    private double tensileStrenght;
    /**
     * The quantity of mass per unit volume of a substance.
     * Measured in Kg/m^3 (Kilograms per cubic-meter)
     */
    @Column(name="density")
    private double density;
    
    public BuildingMaterial() {
        super();
    }
    

    public BuildingMaterial(BuildingMaterialDTO dto) {
        super();
        this.id = dto.getId();
        this.name = dto.getName();
        this.description = dto.getDescription();
        this.compressiveStrenght = dto.getCompressiveStrenght();
        this.tensileStrenght = dto.getTensileStrenght();
        this.density = dto.getDensity();
    }
    



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
    
    public BuildingMaterialDTO toDTO() {
        BuildingMaterialDTO dto = new BuildingMaterialDTO();
        dto.setId(id);
        dto.setName(name);
        dto.setDescription(description);
        dto.setCompressiveStrenght(compressiveStrenght);
        dto.setTensileStrenght(tensileStrenght);
        dto.setDensity(density);
        return dto;
    }
    
    public void fromDTO(BuildingMaterialDTO dto) {
        setId(dto.getId());
        setName(dto.getName());
        setDescription(dto.getDescription());
        setCompressiveStrenght(dto.getCompressiveStrenght());
        setTensileStrenght(dto.getTensileStrenght());
        setDensity(dto.getDensity());
    }
    
    public static List<BuildingMaterialDTO> toDTOList(List<BuildingMaterial> buildingMaterialList) {
        List<BuildingMaterialDTO> out = new ArrayList<BuildingMaterialDTO>(buildingMaterialList.size());
        for(BuildingMaterial material : buildingMaterialList) {
            out.add(material.toDTO());
        }
        return out;
    }
    
}
