package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public enum rc6 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* JADX INFO: renamed from: a */
    public final String f29163a;

    rc6(String str) {
        this.f29163a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f29163a;
    }
}
