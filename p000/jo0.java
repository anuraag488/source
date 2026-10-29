package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jo0 extends st2 {

    /* JADX INFO: renamed from: a */
    public uo4 f22460a;

    /* JADX INFO: renamed from: b */
    public xk4 f22461b;

    /* JADX INFO: renamed from: c */
    public uj2 f22462c;

    /* JADX INFO: renamed from: d */
    public boolean f22463d;

    /* JADX INFO: renamed from: e */
    public vi3 f22464e;

    /* JADX INFO: renamed from: f */
    public pk4 f22465f;

    /* JADX INFO: renamed from: g */
    public l12 f22466g;

    /* JADX INFO: renamed from: h */
    public jl1 f22467h;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        uo4 uo4Var = this.f22460a;
        xk4 xk4Var = this.f22461b;
        uj2 uj2Var = this.f22462c;
        boolean z = this.f22463d;
        vi3 vi3Var = this.f22464e;
        pk4 pk4Var = this.f22465f;
        l12 l12Var = this.f22466g;
        jl1 jl1Var = this.f22467h;
        mo0 mo0Var = new mo0();
        mo0Var.f25072q = uo4Var;
        mo0Var.f25073r = xk4Var;
        mo0Var.f25074s = uj2Var;
        mo0Var.f25075t = z;
        mo0Var.f25076u = vi3Var;
        mo0Var.f25077v = pk4Var;
        mo0Var.f25078w = l12Var;
        mo0Var.f25079x = jl1Var;
        ko0 ko0Var = new ko0((byte) 4);
        ko0Var.f23270b = mo0Var;
        VarHandle.storeStoreFence();
        pk4Var.f27698f = ko0Var;
        return mo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jo0) {
            jo0 jo0Var = (jo0) obj;
            if (this.f22460a.equals(jo0Var.f22460a) && z62.m13387o(this.f22461b, jo0Var.f22461b) && this.f22462c == jo0Var.f22462c && this.f22463d == jo0Var.f22463d && this.f22464e.equals(jo0Var.f22464e) && this.f22465f == jo0Var.f22465f && z62.m13387o(this.f22466g, jo0Var.f22466g) && z62.m13387o(this.f22467h, jo0Var.f22467h)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        mo0 mo0Var = (mo0) mt2Var;
        uo4 uo4Var = this.f22460a;
        xk4 xk4Var = this.f22461b;
        uj2 uj2Var = this.f22462c;
        boolean z = this.f22463d;
        vi3 vi3Var = this.f22464e;
        pk4 pk4Var = this.f22465f;
        l12 l12Var = this.f22466g;
        jl1 jl1Var = this.f22467h;
        boolean z2 = mo0Var.f25075t;
        l12 l12Var2 = mo0Var.f25078w;
        pk4 pk4Var2 = mo0Var.f25077v;
        mo0Var.f25072q = uo4Var;
        mo0Var.f25073r = xk4Var;
        mo0Var.f25074s = uj2Var;
        mo0Var.f25075t = z;
        mo0Var.f25076u = vi3Var;
        mo0Var.f25077v = pk4Var;
        mo0Var.f25078w = l12Var;
        mo0Var.f25079x = jl1Var;
        if (z != z2 || z != z2 || !z62.m13387o(l12Var, l12Var2) || !ql4.m9900d(xk4Var.f34342b)) {
            y70.m13004E(mo0Var);
        }
        if (pk4Var != pk4Var2) {
            ko0 ko0Var = new ko0((byte) 0);
            ko0Var.f23270b = mo0Var;
            VarHandle.storeStoreFence();
            pk4Var.f27698f = ko0Var;
        }
    }

    public final int hashCode() {
        return this.f22467h.hashCode() + ((this.f22466g.hashCode() + ((this.f22465f.hashCode() + ((this.f22464e.hashCode() + zi4.m13611k(zi4.m13611k(zi4.m13611k((this.f22462c.hashCode() + ((this.f22461b.hashCode() + (this.f22460a.hashCode() * 31)) * 31)) * 31, 31, false), 31, this.f22463d), 31, false)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f22460a + ", value=" + this.f22461b + ", state=" + this.f22462c + ", readOnly=false, enabled=" + this.f22463d + ", isPassword=false, offsetMapping=" + this.f22464e + ", manager=" + this.f22465f + ", imeOptions=" + this.f22466g + ", focusRequester=" + this.f22467h + ")";
    }
}
