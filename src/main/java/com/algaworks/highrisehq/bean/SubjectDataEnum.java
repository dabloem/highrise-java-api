/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.highrisehq.bean;

/**
 *
 * @author duncan
 */
public enum SubjectDataEnum {
    NIEUWSBRIEF("510359"),
    GFM("510360"),
    GPA("510361"),
    DAILY("510362"),
    MARKETUPDATE("510363"),
    MAANDAGALERT("510364"),
    DINSDAGALERT("510365"),
    
    BASISID("520530"), //524003";
    INVESTOR("510339"),//524016";
    HUISBANK("510351"),//"524015";
    MEDEWERKERCATEGORIE("510340"),//524022";
    OMZETCATEGORIE("510322"),//"524025";
    OMZET("510321"),//524029";
    OMVANG("510342"),//524008";
    AFLOOPDATUM("510341"),//524007";
    GESLACHT("510343");//"??";

    
    private String fieldId;

    private SubjectDataEnum(String value) {
        fieldId = value;
    }
    
    public String getFieldId(){
        return fieldId;
    }
}
