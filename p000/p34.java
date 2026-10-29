package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p34 {

    /* JADX INFO: renamed from: a */
    public String f27343a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p34) && this.f27343a.equals(((p34) obj).f27343a);
    }

    public final int hashCode() {
        return this.f27343a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f27343a + ')';
    }
}
