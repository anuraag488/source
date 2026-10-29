package p000;

/* JADX INFO: renamed from: eu */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0626eu extends wc1 {

    /* JADX INFO: renamed from: a */
    public C0587du f18482a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wc1) {
            return this.f18482a.equals(((C0626eu) ((wc1) obj)).f18482a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18482a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f18482a + "}";
    }
}
