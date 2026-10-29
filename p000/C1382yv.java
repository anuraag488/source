package p000;

/* JADX INFO: renamed from: yv */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1382yv extends hz2 {

    /* JADX INFO: renamed from: a */
    public Object f35544a;

    /* JADX INFO: renamed from: b */
    public long f35545b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1382yv)) {
            return false;
        }
        C1382yv c1382yv = (C1382yv) obj;
        return this.f35544a.equals(c1382yv.f35544a) && this.f35545b == c1382yv.f35545b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f35545b) + (this.f35544a.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.f35544a + ", compositeKey=" + this.f35545b + ')';
    }
}
