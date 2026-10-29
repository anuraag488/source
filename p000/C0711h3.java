package p000;

/* JADX INFO: renamed from: h3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0711h3 extends AbstractC0597e3 {

    /* JADX INFO: renamed from: q */
    public static C0711h3 f20291q;

    /* JADX INFO: renamed from: r */
    public static final oo3 f20292r = oo3.f26926b;

    /* JADX INFO: renamed from: s */
    public static final oo3 f20293s = oo3.f26925a;

    /* JADX INFO: renamed from: o */
    public jl4 f20294o;

    /* JADX INFO: renamed from: p */
    public i14 f20295p;

    @Override // p000.AbstractC0597e3
    /* JADX INFO: renamed from: a */
    public final int[] mo4905a(int i) {
        int iM13246e;
        if (m4907d().length() > 0 && i < m4907d().length()) {
            try {
                i14 i14Var = this.f20295p;
                if (i14Var == null) {
                    z62.m13366Y("node");
                    throw null;
                }
                jl3 jl3VarM6546g = i14Var.m6546g();
                int iRound = Math.round(jl3VarM6546g.f22399d - jl3VarM6546g.f22397b);
                if (i <= 0) {
                    i = 0;
                }
                jl4 jl4Var = this.f20294o;
                if (jl4Var == null) {
                    z62.m13366Y("layoutResult");
                    throw null;
                }
                int iM13245d = jl4Var.f22401b.m13245d(i);
                jl4 jl4Var2 = this.f20294o;
                if (jl4Var2 == null) {
                    z62.m13366Y("layoutResult");
                    throw null;
                }
                float fM13247f = jl4Var2.f22401b.m13247f(iM13245d) + iRound;
                jl4 jl4Var3 = this.f20294o;
                if (jl4Var3 == null) {
                    z62.m13366Y("layoutResult");
                    throw null;
                }
                yu2 yu2Var = jl4Var3.f22401b;
                float fM13247f2 = yu2Var.m13247f(yu2Var.f35537f - 1);
                jl4 jl4Var4 = this.f20294o;
                if (fM13247f < fM13247f2) {
                    if (jl4Var4 == null) {
                        z62.m13366Y("layoutResult");
                        throw null;
                    }
                    iM13246e = jl4Var4.f22401b.m13246e(fM13247f);
                } else {
                    if (jl4Var4 == null) {
                        z62.m13366Y("layoutResult");
                        throw null;
                    }
                    iM13246e = jl4Var4.f22401b.f35537f;
                }
                return m4906b(i, m6205n(iM13246e - 1, f20293s) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // p000.AbstractC0597e3
    /* JADX INFO: renamed from: m */
    public final int[] mo4913m(int i) {
        int iM13246e;
        if (m4907d().length() > 0 && i > 0) {
            try {
                i14 i14Var = this.f20295p;
                if (i14Var == null) {
                    z62.m13366Y("node");
                    throw null;
                }
                jl3 jl3VarM6546g = i14Var.m6546g();
                int iRound = Math.round(jl3VarM6546g.f22399d - jl3VarM6546g.f22397b);
                int length = m4907d().length();
                if (length <= i) {
                    i = length;
                }
                jl4 jl4Var = this.f20294o;
                if (jl4Var == null) {
                    z62.m13366Y("layoutResult");
                    throw null;
                }
                int iM13245d = jl4Var.f22401b.m13245d(i);
                jl4 jl4Var2 = this.f20294o;
                if (jl4Var2 == null) {
                    z62.m13366Y("layoutResult");
                    throw null;
                }
                float fM13247f = jl4Var2.f22401b.m13247f(iM13245d) - iRound;
                if (fM13247f > 0.0f) {
                    jl4 jl4Var3 = this.f20294o;
                    if (jl4Var3 == null) {
                        z62.m13366Y("layoutResult");
                        throw null;
                    }
                    iM13246e = jl4Var3.f22401b.m13246e(fM13247f);
                } else {
                    iM13246e = 0;
                }
                if (i == m4907d().length() && iM13246e < iM13245d) {
                    iM13246e++;
                }
                return m4906b(m6205n(iM13246e, f20292r), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final int m6205n(int i, oo3 oo3Var) {
        jl4 jl4Var = this.f20294o;
        if (jl4Var == null) {
            z62.m13366Y("layoutResult");
            throw null;
        }
        int iM7180f = jl4Var.m7180f(i);
        jl4 jl4Var2 = this.f20294o;
        if (jl4Var2 == null) {
            z62.m13366Y("layoutResult");
            throw null;
        }
        oo3 oo3VarM7181g = jl4Var2.m7181g(iM7180f);
        jl4 jl4Var3 = this.f20294o;
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
