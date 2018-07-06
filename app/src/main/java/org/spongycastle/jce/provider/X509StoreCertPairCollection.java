package org.spongycastle.jce.provider;

import java.util.Collection;
import org.spongycastle.util.CollectionStore;
import org.spongycastle.util.Selector;
import org.spongycastle.x509.X509CollectionStoreParameters;
import org.spongycastle.x509.X509StoreParameters;
import org.spongycastle.x509.X509StoreSpi;

public class X509StoreCertPairCollection extends X509StoreSpi {
    private CollectionStore a;

    public void a(X509StoreParameters x509StoreParameters) {
        if (x509StoreParameters instanceof X509CollectionStoreParameters) {
            this.a = new CollectionStore(((X509CollectionStoreParameters) x509StoreParameters).a());
            return;
        }
        throw new IllegalArgumentException("Initialization parameters must be an instance of " + X509CollectionStoreParameters.class.getName() + ".");
    }

    public Collection a(Selector selector) {
        return this.a.a(selector);
    }
}
