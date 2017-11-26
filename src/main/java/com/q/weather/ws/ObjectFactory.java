
package com.q.weather.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.q.weather.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCityWeatherResponse_QNAME = new QName("http://ws.weather.q.com/", "getCityWeatherResponse");
    private final static QName _GetCityWeather_QNAME = new QName("http://ws.weather.q.com/", "getCityWeather");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.q.weather.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCityWeather }
     * 
     */
    public GetCityWeather createGetCityWeather() {
        return new GetCityWeather();
    }

    /**
     * Create an instance of {@link GetCityWeatherResponse }
     * 
     */
    public GetCityWeatherResponse createGetCityWeatherResponse() {
        return new GetCityWeatherResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCityWeatherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.weather.q.com/", name = "getCityWeatherResponse")
    public JAXBElement<GetCityWeatherResponse> createGetCityWeatherResponse(GetCityWeatherResponse value) {
        return new JAXBElement<GetCityWeatherResponse>(_GetCityWeatherResponse_QNAME, GetCityWeatherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCityWeather }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.weather.q.com/", name = "getCityWeather")
    public JAXBElement<GetCityWeather> createGetCityWeather(GetCityWeather value) {
        return new JAXBElement<GetCityWeather>(_GetCityWeather_QNAME, GetCityWeather.class, null, value);
    }

}
