package org.bc.asn1;

public class ASN1Boolean
    extends DERBoolean
{
    public ASN1Boolean(boolean value)
    {
        super(value);
    }

    ASN1Boolean(byte[] value)
    {
        super(value);
    }
}
