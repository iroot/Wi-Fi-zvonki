package org.spongycastle.asn1;

import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;

public class DERT61UTF8String extends ASN1Primitive implements ASN1String {
    private byte[] a;

    public String a_() {
        return Strings.a(this.a);
    }

    public String toString() {
        return a_();
    }

    boolean i() {
        return false;
    }

    int j() {
        return (StreamUtil.a(this.a.length) + 1) + this.a.length;
    }

    void a(ASN1OutputStream aSN1OutputStream) {
        aSN1OutputStream.a(20, this.a);
    }

    boolean a(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof DERT61UTF8String) {
            return Arrays.a(this.a, ((DERT61UTF8String) aSN1Primitive).a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.a(this.a);
    }
}
