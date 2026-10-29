package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nz3 {

    /* JADX INFO: renamed from: a */
    public final e73 f26222a;

    /* JADX INFO: renamed from: b */
    public final e73 f26223b;

    /* JADX INFO: renamed from: c */
    public final e73 f26224c;

    public nz3(e73 e73Var, e73 e73Var2, e73 e73Var3) {
        this.f26222a = e73Var;
        this.f26223b = e73Var2;
        this.f26224c = e73Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz3)) {
            return false;
        }
        nz3 nz3Var = (nz3) obj;
        return z62.m13387o(this.f26222a, nz3Var.f26222a) && z62.m13387o(this.f26223b, nz3Var.f26223b) && z62.m13387o(this.f26224c, nz3Var.f26224c);
    }

    public final int hashCode() {
        return this.f26224c.hashCode() + ((this.f26223b.hashCode() + (this.f26222a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SectionPadding(externalPadding=" + this.f26222a + ", contentPadding=" + this.f26223b + ", extraContentPadding=" + this.f26224c + ")";
    }
}
