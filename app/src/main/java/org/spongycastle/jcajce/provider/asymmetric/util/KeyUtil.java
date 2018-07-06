package org.spongycastle.jcajce.provider.asymmetric.util;

import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;

public class KeyUtil {
    public static byte[] a(AlgorithmIdentifier algorithmIdentifier, ASN1Encodable aSN1Encodable) {
        try {
            return a(new SubjectPublicKeyInfo(algorithmIdentifier, aSN1Encodable));
        } catch (Exception e) {
            return null;
        }
    }

    public static byte[] a(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            return subjectPublicKeyInfo.a("DER");
        } catch (Exception e) {
            return null;
        }
    }

    public static byte[] b(AlgorithmIdentifier algorithmIdentifier, ASN1Encodable aSN1Encodable) {
        try {
            return a(new PrivateKeyInfo(algorithmIdentifier, aSN1Encodable.a()));
        } catch (Exception e) {
            return null;
        }
    }

    public static byte[] a(PrivateKeyInfo privateKeyInfo) {
        try {
            return privateKeyInfo.a("DER");
        } catch (Exception e) {
            return null;
        }
    }
}
