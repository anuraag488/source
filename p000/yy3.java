package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yy3 {

    /* JADX INFO: renamed from: a */
    public final boolean f35633a;

    /* JADX INFO: renamed from: b */
    public final boolean f35634b;

    /* JADX INFO: renamed from: c */
    public final boolean f35635c;

    /* JADX INFO: renamed from: d */
    public final boolean f35636d;

    public yy3(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f35633a = z;
        this.f35634b = z2;
        this.f35635c = z3;
        this.f35636d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy3)) {
            return false;
        }
        yy3 yy3Var = (yy3) obj;
        return this.f35633a == yy3Var.f35633a && this.f35634b == yy3Var.f35634b && this.f35635c == yy3Var.f35635c && this.f35636d == yy3Var.f35636d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35636d) + zi4.m13611k(zi4.m13611k(Boolean.hashCode(this.f35633a) * 31, 31, this.f35634b), 31, this.f35635c);
    }

    public final String toString() {
        return "SectionContext(firstInSection=" + this.f35633a + ", lastInSection=" + this.f35634b + ", afterHeader=" + this.f35635c + ", firstInList=" + this.f35636d + ")";
    }
}
