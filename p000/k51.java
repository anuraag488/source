package p000;

import java.security.spec.ECParameterSpec;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k51 {

    /* JADX INFO: renamed from: c */
    public static final k51 f22897c = new k51("NIST_P256", k71.f22950a);

    /* JADX INFO: renamed from: d */
    public static final k51 f22898d = new k51("NIST_P384", k71.f22951b);

    /* JADX INFO: renamed from: e */
    public static final k51 f22899e = new k51("NIST_P521", k71.f22952c);

    /* JADX INFO: renamed from: a */
    public final String f22900a;

    /* JADX INFO: renamed from: b */
    public final ECParameterSpec f22901b;

    public k51(String str, ECParameterSpec eCParameterSpec) {
        this.f22900a = str;
        this.f22901b = eCParameterSpec;
    }

    public final String toString() {
        return this.f22900a;
    }
}
