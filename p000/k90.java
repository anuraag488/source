package p000;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k90 {
    /* JADX INFO: renamed from: a */
    public static k90 m7435a(C0825k7 c0825k7, Provider provider) throws GeneralSecurityException {
        k90 k90Var = new k90();
        if (!zi4.m13603c(1)) {
            xy4.m12788q("Cannot use AES-CMAC in FIPS-mode.");
            return null;
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            c0825k7.f22947w.m11250c();
            new SecretKeySpec(((u50) c0825k7.f22946v.f33259b).m11250c(), "AES");
            return k90Var;
        } catch (NoSuchAlgorithmException e) {
            throw new GeneralSecurityException("AES-CMAC not available.", e);
        }
    }
}
