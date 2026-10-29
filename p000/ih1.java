package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ih1 {

    /* JADX INFO: renamed from: a */
    public String f21418a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ih1) && z62.m13387o(this.f21418a, ((ih1) obj).f21418a);
    }

    public final int hashCode() {
        String str = this.f21418a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f21418a + ')';
    }
}
