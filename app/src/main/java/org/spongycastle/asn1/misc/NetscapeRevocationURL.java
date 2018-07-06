package org.spongycastle.asn1.misc;

import org.spongycastle.asn1.DERIA5String;

public class NetscapeRevocationURL extends DERIA5String {
    public NetscapeRevocationURL(DERIA5String dERIA5String) {
        super(dERIA5String.a_());
    }

    public String toString() {
        return "NetscapeRevocationURL: " + a_();
    }
}
