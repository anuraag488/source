package p000;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lf3 extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ mf3 f24000a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        mf3 mf3Var = this.f24000a;
        try {
            n81 n81Var = n81.f25514c;
            Mac mac = (Mac) n81Var.f25518a.mo3139g((String) mf3Var.f24860c);
            mac.init((SecretKeySpec) mf3Var.f24861d);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
