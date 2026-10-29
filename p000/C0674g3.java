package p000;

/* JADX INFO: renamed from: g3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0674g3 extends AbstractC0597e3 {

    /* JADX INFO: renamed from: p */
    public static C0674g3 f19545p;

    /* JADX INFO: renamed from: q */
    public static final oo3 f19546q = oo3.f26926b;

    /* JADX INFO: renamed from: r */
    public static final oo3 f19547r = oo3.f26925a;

    /* JADX INFO: renamed from: o */
    public jl4 f19548o;

    @Override // p000.AbstractC0597e3
    /* JADX INFO: renamed from: a */
    public final int[] mo4905a(int i) {
        int iM13245d;
        if (m4907d().length() > 0 && i < m4907d().length()) {
            jl4 jl4Var = this.f19548o;
            oo3 oo3Var = f19546q;
            if (i < 0) {
                if (jl4Var == null) {
                    z62.m13366Y("layoutResult");
                    throw null;
                }
                iM13245d = jl4Var.f22401b.m13245d(0);
            } else {
                if (jl4Var == null) {
                    z62.m13366Y("layoutResult");
                    throw null;
                }
                int iM13245d2 = jl4Var.f22401b.m13245d(i);
                iM13245d = m5894n(iM13245d2, oo3Var) == i ? iM13245d2 : iM13245d2 + 1;
            }
            jl4 jl4Var2 = this.f19548o;
            if (jl4Var2 == null) {
                z62.m13366Y("layoutResult");
                throw null;
            }
            if (iM13245d < jl4Var2.f22401b.f35537f) {
                return m4906b(m5894n(iM13245d, oo3Var), m5894n(iM13245d, f19547r) + 1);
            }
        }
        return null;
    }

    @Override // p000.AbstractC0597e3
    /* JADX INFO: renamed from: m */
    public final int[] mo4913m(int i) {
        int iM13245d;
        if (m4907d().length() > 0 && i > 0) {
            int length = m4907d().length();
            jl4 jl4Var = this.f19548o;
            oo3 oo3Var = f19547r;
            if (i > length) {
                if (jl4Var == null) {
                    z62.m13366Y("layoutResult");
                    throw null;
                }
                iM13245d = jl4Var.f22401b.m13245d(m4907d().length());
            } else {
                if (jl4Var == null) {
                    z62.m13366Y("layoutResult");
                    throw null;
                }
                int iM13245d2 = jl4Var.f22401b.m13245d(i);
                iM13245d = m5894n(iM13245d2, oo3Var) + 1 == i ? iM13245d2 : iM13245d2 - 1;
            }
            if (iM13245d >= 0) {
                return m4906b(m5894n(iM13245d, f19546q), m5894n(iM13245d, oo3Var) + 1);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final int m5894n(int i, oo3 oo3Var) {
        jl4 jl4Var = this.f19548o;
        if (jl4Var == null) {
            z62.m13366Y("layoutResult");
            throw null;
        }
        int iM7180f = jl4Var.m7180f(i);
        jl4 jl4Var2 = this.f19548o;
        if (jl4Var2 == null) {
            z62.m13366Y("layoutResult");
            throw null;
        }
        oo3 oo3VarM7181g = jl4Var2.m7181g(iM7180f);
        jl4 jl4Var3 = this.f19548o;
        if (oo3Var != oo3VarM7181g) {
            if (jl4Var3 != null) {
                return jl4Var3.m7180f(i);
            }
            z62.m13366Y("layoutResult");
            throw null;
        }
        if (jl4Var3 != null) {
            return jl4Var3.f22401b.m13244c(i, false) - 1;
        }
        z62.m13366Y("layoutResult");
        throw null;
    }
}
