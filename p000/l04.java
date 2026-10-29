package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l04 {

    /* JADX INFO: renamed from: a */
    public final k04 f23668a;

    /* JADX INFO: renamed from: b */
    public final k04 f23669b;

    /* JADX INFO: renamed from: c */
    public final boolean f23670c;

    public l04(k04 k04Var, k04 k04Var2, boolean z) {
        this.f23668a = k04Var;
        this.f23669b = k04Var2;
        this.f23670c = z;
    }

    /* JADX INFO: renamed from: a */
    public static l04 m7761a(l04 l04Var, k04 k04Var, k04 k04Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            k04Var = l04Var.f23668a;
        }
        if ((i & 2) != 0) {
            k04Var2 = l04Var.f23669b;
        }
        l04Var.getClass();
        return new l04(k04Var, k04Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l04)) {
            return false;
        }
        l04 l04Var = (l04) obj;
        return z62.m13387o(this.f23668a, l04Var.f23668a) && z62.m13387o(this.f23669b, l04Var.f23669b) && this.f23670c == l04Var.f23670c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23670c) + ((this.f23669b.hashCode() + (this.f23668a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.f23668a + ", end=" + this.f23669b + ", handlesCrossed=" + this.f23670c + ")";
    }
}
