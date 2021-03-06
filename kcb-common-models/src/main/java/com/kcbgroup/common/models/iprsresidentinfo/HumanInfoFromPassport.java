//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.03 at 10:54:08 PM EAT 
//


package com.kcbgroup.common.models.iprsresidentinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HumanInfoFromPassport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HumanInfoFromPassport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/IPRSManager}HumanInfoCommon">
 *       &lt;sequence>
 *         &lt;element name="Date_of_Birth_from_Passport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date_of_Expiry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date_of_Issue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Passport_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Photo_from_Passport" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HumanInfoFromPassport", namespace = "http://schemas.datacontract.org/2004/07/IPRSManager", propOrder = {
    "dateOfBirthFromPassport",
    "dateOfExpiry",
    "dateOfIssue",
    "passportNumber",
    "photoFromPassport"
})
public class HumanInfoFromPassport
    extends HumanInfoCommon
{

    @XmlElementRef(name = "Date_of_Birth_from_Passport", namespace = "http://schemas.datacontract.org/2004/07/IPRSManager", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateOfBirthFromPassport;
    @XmlElementRef(name = "Date_of_Expiry", namespace = "http://schemas.datacontract.org/2004/07/IPRSManager", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateOfExpiry;
    @XmlElementRef(name = "Date_of_Issue", namespace = "http://schemas.datacontract.org/2004/07/IPRSManager", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateOfIssue;
    @XmlElementRef(name = "Passport_Number", namespace = "http://schemas.datacontract.org/2004/07/IPRSManager", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passportNumber;
    @XmlElementRef(name = "Photo_from_Passport", namespace = "http://schemas.datacontract.org/2004/07/IPRSManager", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> photoFromPassport;

    /**
     * Gets the value of the dateOfBirthFromPassport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateOfBirthFromPassport() {
        return dateOfBirthFromPassport;
    }

    /**
     * Sets the value of the dateOfBirthFromPassport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateOfBirthFromPassport(JAXBElement<String> value) {
        this.dateOfBirthFromPassport = value;
    }

    /**
     * Gets the value of the dateOfExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateOfExpiry() {
        return dateOfExpiry;
    }

    /**
     * Sets the value of the dateOfExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateOfExpiry(JAXBElement<String> value) {
        this.dateOfExpiry = value;
    }

    /**
     * Gets the value of the dateOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateOfIssue() {
        return dateOfIssue;
    }

    /**
     * Sets the value of the dateOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateOfIssue(JAXBElement<String> value) {
        this.dateOfIssue = value;
    }

    /**
     * Gets the value of the passportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassportNumber() {
        return passportNumber;
    }

    /**
     * Sets the value of the passportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassportNumber(JAXBElement<String> value) {
        this.passportNumber = value;
    }

    /**
     * Gets the value of the photoFromPassport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getPhotoFromPassport() {
        return photoFromPassport;
    }

    /**
     * Sets the value of the photoFromPassport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setPhotoFromPassport(JAXBElement<byte[]> value) {
        this.photoFromPassport = value;
    }

}
