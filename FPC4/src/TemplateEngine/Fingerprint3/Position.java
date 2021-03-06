//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.30 at 07:14:15 AM EST 
//


package TemplateEngine.Fingerprint3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Position.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Position">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="START_OF_PAYLOAD"/>
 *     &lt;enumeration value="END_OF_PAYLOAD"/>
 *     &lt;enumeration value="CURSOR_START"/>
 *     &lt;enumeration value="CURSOR_MAIN"/>
 *     &lt;enumeration value="CURSOR_END"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Position")
@XmlEnum
public enum Position {

    START_OF_PAYLOAD,
    END_OF_PAYLOAD,
    CURSOR_START,
    CURSOR_MAIN,
    CURSOR_END;

    public String value() {
        return name();
    }

    public static Position fromValue(String v) {
        return valueOf(v);
    }

}
