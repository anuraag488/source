package p000;

/* JADX INFO: renamed from: ep */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0620ep extends AbstractC0696gp {

    /* JADX INFO: renamed from: a */
    public final i73 f18346a;

    public C0620ep(i73 i73Var) {
        this.f18346a = i73Var;
    }

    @Override // p000.AbstractC0696gp
    /* JADX INFO: renamed from: a */
    public final i73 mo4634a() {
        return this.f18346a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0620ep) && z62.m13387o(this.f18346a, ((C0620ep) obj).f18346a);
    }

    public final int hashCode() {
        i73 i73Var = this.f18346a;
        if (i73Var == null) {
            return 0;
        }
        return i73Var.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.f18346a + ')';
    }
}
