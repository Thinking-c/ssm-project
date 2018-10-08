
package ocpp.cp._2012._06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the SendLocalList.req PDU
 * 
 * <p>SendLocalListRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SendLocalListRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="updateType" type="{urn://Ocpp/Cp/2012/06/}UpdateType"/&gt;
 *         &lt;element name="listVersion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="localAuthorisationList" type="{urn://Ocpp/Cp/2012/06/}AuthorisationData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendLocalListRequest", propOrder = {
    "updateType",
    "listVersion",
    "localAuthorisationList",
    "hash"
})
public class SendLocalListRequest {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected UpdateType updateType;
    protected int listVersion;
    protected List<AuthorisationData> localAuthorisationList;
    protected String hash;

    /**
     * 获取updateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UpdateType }
     *     
     */
    public UpdateType getUpdateType() {
        return updateType;
    }

    /**
     * 设置updateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateType }
     *     
     */
    public void setUpdateType(UpdateType value) {
        this.updateType = value;
    }

    /**
     * 获取listVersion属性的值。
     * 
     */
    public int getListVersion() {
        return listVersion;
    }

    /**
     * 设置listVersion属性的值。
     * 
     */
    public void setListVersion(int value) {
        this.listVersion = value;
    }

    /**
     * Gets the value of the localAuthorisationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localAuthorisationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalAuthorisationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorisationData }
     * 
     * 
     */
    public List<AuthorisationData> getLocalAuthorisationList() {
        if (localAuthorisationList == null) {
            localAuthorisationList = new ArrayList<AuthorisationData>();
        }
        return this.localAuthorisationList;
    }

    /**
     * 获取hash属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHash() {
        return hash;
    }

    /**
     * 设置hash属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHash(String value) {
        this.hash = value;
    }

}
