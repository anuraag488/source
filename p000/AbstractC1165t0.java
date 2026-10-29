package p000;

/* JADX INFO: renamed from: t0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1165t0 extends e92 implements wm0, zo0 {

    /* JADX INFO: renamed from: d */
    public final ro0 f30702d;

    public AbstractC1165t0(ro0 ro0Var, boolean z) {
        super(z);
        m4986R((t82) ro0Var.get(o85.f26448h));
        this.f30702d = ro0Var.plus(this);
    }

    @Override // p000.e92
    /* JADX INFO: renamed from: A */
    public final String mo4970A() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // p000.e92
    /* JADX INFO: renamed from: Q */
    public final void mo4985Q(gf0 gf0Var) {
        n40.m8509s(this.f30702d, gf0Var);
    }

    @Override // p000.e92
    /* JADX INFO: renamed from: W */
    public String mo3053W() {
        return super.mo3053W();
    }

    @Override // p000.e92
    /* JADX INFO: renamed from: Z */
    public final void mo4992Z(Object obj) {
        if (!(obj instanceof ff0)) {
            mo8298i0(obj);
        } else {
            ff0 ff0Var = (ff0) obj;
            mo8297h0(ff0Var.f18941a, AbstractC1078qo.f28633a.getIntVolatile(ff0Var, ff0.f18940b) == 1);
        }
    }

    @Override // p000.zo0
    /* JADX INFO: renamed from: f */
    public final ro0 mo6367f() {
        return this.f30702d;
    }

    @Override // p000.wm0
    public final ro0 getContext() {
        return this.f30702d;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m10957j0(cp0 cp0Var, AbstractC1165t0 abstractC1165t0, mq1 mq1Var) {
        Object objInvoke;
        int iOrdinal = cp0Var.ordinal();
        ju4 ju4Var = ju4.f22634a;
        if (iOrdinal == 0) {
            try {
                g01.m5867a(C0006a5.m86x(C0006a5.m74l(abstractC1165t0, this, mq1Var)), ju4Var);
                return;
            } catch (Throwable th) {
                th = th;
                if (th instanceof e01) {
                    th = ((e01) th).f17555a;
                }
                resumeWith(k43.m7389n(th));
                throw th;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                C0006a5.m86x(C0006a5.m74l(abstractC1165t0, this, mq1Var)).resumeWith(ju4Var);
                return;
            }
            if (iOrdinal != 3) {
                C0670g.m5864c();
                return;
            }
            try {
                ro0 ro0Var = this.f30702d;
                Object objM4555b = dm4.m4555b(ro0Var, null);
                try {
                    if (mq1Var instanceof AbstractC0888lx) {
                        as4.m3259r(2, mq1Var);
                        objInvoke = mq1Var.invoke(abstractC1165t0, this);
                    } else {
                        objInvoke = C0006a5.m62R(mq1Var, abstractC1165t0, this);
                    }
                    dm4.m4554a(ro0Var, objM4555b);
                    if (objInvoke != ap0.f14763a) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    dm4.m4554a(ro0Var, objM4555b);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof e01) {
                    th = ((e01) th).f17555a;
                }
                resumeWith(k43.m7389n(th));
            }
        }
    }

    @Override // p000.wm0
    public final void resumeWith(Object obj) {
        Throwable thM4638b = dp3.m4638b(obj);
        if (thM4638b != null) {
            obj = new ff0(thM4638b, false);
        }
        Object objM4990V = m4990V(obj);
        if (objM4990V == f92.f18856b) {
            return;
        }
        mo5004r(objM4990V);
    }

    /* JADX INFO: renamed from: i0 */
    public void mo8298i0(Object obj) {
    }

    /* JADX INFO: renamed from: h0 */
    public void mo8297h0(Throwable th, boolean z) {
    }
}
