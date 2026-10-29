package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tz4 {

    /* JADX INFO: renamed from: a */
    public final String f31568a;

    /* JADX INFO: renamed from: b */
    public final qk5 f31569b;

    public tz4(String str, qk5 qk5Var) {
        this.f31568a = str;
        this.f31569b = qk5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz4)) {
            return false;
        }
        tz4 tz4Var = (tz4) obj;
        return this.f31568a.equals(tz4Var.f31568a) && this.f31569b.equals(tz4Var.f31569b);
    }

    public final int hashCode() {
        return this.f31569b.hashCode() + (this.f31568a.hashCode() * 31);
    }

    public final String toString() {
        return this.f31568a;
    }
}
