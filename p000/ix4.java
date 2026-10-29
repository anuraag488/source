package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ix4 extends mt2 implements s31 {

    /* JADX INFO: renamed from: o */
    public yo4 f21866o;

    /* JADX INFO: renamed from: p */
    public p91 f21867p;

    /* JADX INFO: renamed from: q */
    public mc1 f21868q;

    /* JADX INFO: renamed from: r */
    public b54 f21869r;

    @Override // p000.s31
    /* JADX INFO: renamed from: S */
    public final void mo3550S(yf2 yf2Var) {
        yf2Var.m13113a();
        yo4 yo4Var = this.f21866o;
        hx4 hx4Var = new hx4(this, (byte) 0);
        b54 b54Var = this.f21869r;
        xo4 xo4VarM13208a = yo4Var.m13208a(hx4Var, b54Var.m3456a() ? pb0.m9462a(b54Var.f15093e) : null, null, new hx4(this, (byte) 1));
        b54 b54Var2 = this.f21869r;
        long j = ((pb0) xo4VarM13208a.getValue()).f27503a;
        C1372yl c1372yl = b54Var2.f15091c;
        if (b54Var2.m3457b() && ((Boolean) ((d83) c1372yl.f35310g).getValue()).booleanValue()) {
            j = ((pb0) ((d83) c1372yl.f35311h).getValue()).f27503a;
        }
        long j2 = j;
        if (b54Var2.m3457b()) {
            b54Var2.f15093e = j2;
        }
        if (pb0.m9465d(j2) == 0.0f) {
            return;
        }
        cp4 cp4Var = this.f21867p.f27464a;
        cp4 cp4Var2 = this.f21868q.f24813a;
        u31.m11225x(yf2Var, j2, 0L, 0L, null, 126);
    }
}
