package org.spongycastle.asn1.cms;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;

public class RecipientIdentifier extends ASN1Object implements ASN1Choice {
    private ASN1Encodable a;

    public ASN1Primitive a() {
        return this.a.a();
    }
}
