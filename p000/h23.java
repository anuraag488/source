package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h23 implements jc2 {

    /* JADX INFO: renamed from: a */
    public jc2 f20281a;

    /* JADX INFO: renamed from: b */
    public h24 f20282b;

    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        if (iv0Var.mo5387g()) {
            return iv0Var.mo6942b(this.f20281a);
        }
        return null;
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        if (obj != null) {
            g81Var.mo5920d(this.f20281a, obj);
        } else {
            g81Var.mo5919c();
        }
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return this.f20282b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && h23.class == obj.getClass() && z62.m13387o(this.f20281a, ((h23) obj).f20281a);
    }

    public final int hashCode() {
        return this.f20281a.hashCode();
    }
}
