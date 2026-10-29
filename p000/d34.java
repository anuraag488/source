package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d34 {

    /* JADX INFO: renamed from: a */
    public i34 f16763a;

    /* JADX INFO: renamed from: b */
    public C0533cn f16764b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d34)) {
            return false;
        }
        d34 d34Var = (d34) obj;
        return this.f16763a.equals(d34Var.f16763a) && this.f16764b.equals(d34Var.f16764b);
    }

    public final int hashCode() {
        return this.f16764b.hashCode() + ((this.f16763a.hashCode() + (jb1.f22147b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + jb1.f22147b + ", sessionData=" + this.f16763a + ", applicationInfo=" + this.f16764b + ')';
    }
}
