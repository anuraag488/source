package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cs1 implements fs1 {

    /* JADX INFO: renamed from: a */
    public final wf4 f16424a;

    /* JADX INFO: renamed from: b */
    public final boolean f16425b;

    public cs1(wf4 wf4Var, boolean z) {
        this.f16424a = wf4Var;
        this.f16425b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs1)) {
            return false;
        }
        cs1 cs1Var = (cs1) obj;
        return this.f16424a == cs1Var.f16424a && this.f16425b == cs1Var.f16425b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16425b) + (this.f16424a.hashCode() * 31);
    }

    public final String toString() {
        return "Active(direction=" + this.f16424a + ", hold=" + this.f16425b + ")";
    }
}
