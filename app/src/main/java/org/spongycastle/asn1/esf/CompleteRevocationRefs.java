package org.spongycastle.asn1.esf;

import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;

public class CompleteRevocationRefs extends ASN1Object {
    private ASN1Sequence a;

    public ASN1Primitive a() {
        return this.a;
    }
}
