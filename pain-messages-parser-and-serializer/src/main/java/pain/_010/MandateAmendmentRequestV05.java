
package pain._010;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MandateAmendmentRequestV05 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MandateAmendmentRequestV05">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.010.001.05}GroupHeader47"/>
 *         &lt;element name="UndrlygAmdmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:pain.010.001.05}MandateAmendment5" maxOccurs="unbounded"/>
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:pain.010.001.05}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateAmendmentRequestV05", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.010.001.05", propOrder = {
    "grpHdr",
    "undrlygAmdmntDtls",
    "splmtryData"
})
public class MandateAmendmentRequestV05 {

    @XmlElement(name = "GrpHdr", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.010.001.05", required = true)
    protected GroupHeader47 grpHdr;
    @XmlElement(name = "UndrlygAmdmntDtls", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.010.001.05", required = true)
    protected List<MandateAmendment5> undrlygAmdmntDtls;
    @XmlElement(name = "SplmtryData", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.010.001.05")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader47 }
     *     
     */
    public GroupHeader47 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader47 }
     *     
     */
    public void setGrpHdr(GroupHeader47 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the undrlygAmdmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygAmdmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygAmdmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MandateAmendment5 }
     * 
     * 
     */
    public List<MandateAmendment5> getUndrlygAmdmntDtls() {
        if (undrlygAmdmntDtls == null) {
            undrlygAmdmntDtls = new ArrayList<MandateAmendment5>();
        }
        return this.undrlygAmdmntDtls;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

}
