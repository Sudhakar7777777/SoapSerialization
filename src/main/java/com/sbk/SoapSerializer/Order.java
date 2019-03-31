package com.sbk.SoapSerializer;

public class Order
{
    String id;
    int value;
    String payment_method;
    Customer customer;


    /*
    <order>
        <id>S12345</id>
        <value>1250</value>
        <payment_method>CC</payment_method>
        <customer>
            <name part="first">Nancy</name>
            <name part="last">Smith</name>
            <address>
                <street line="1">41 Earnest Road</street>
                <street line="2">Rotamonte Park</street>
                <city>Koregon</city>
                <postalcode>12345</postalcode>
                <country>UK</country>
            </address>
        </customer>
    </order>
     */
}
