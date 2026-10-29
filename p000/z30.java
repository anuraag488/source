package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z30 implements yy4 {

    /* JADX INFO: renamed from: a */
    public Object f35732a;

    /* JADX INFO: renamed from: b */
    public b70 f35733b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ f40 f35734c;

    @Override // p000.yy4
    /* JADX INFO: renamed from: a */
    public final void mo3483a(a04 a04Var, int i) {
        b70 b70Var = this.f35733b;
        if (b70Var != null) {
            b70Var.mo3483a(a04Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m13297b(ym0 ym0Var) {
        Boolean bool;
        f40 f40Var = this.f35734c;
        Object obj = this.f35732a;
        boolean z = true;
        z = true;
        if (obj == h40.f20375p || obj == h40.f20371l) {
            p80 p80Var = (p80) f40.f18729i.get(f40Var);
            while (!f40Var.m5502y()) {
                long andIncrement = f40.f18725e.getAndIncrement(f40Var);
                long j = h40.f20361b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (p80Var.f22d != j2) {
                    p80 p80VarM5490k = f40Var.m5490k(j2, p80Var);
                    if (p80VarM5490k == null) {
                        continue;
                    } else {
                        p80Var = p80VarM5490k;
                    }
                }
                f40 f40Var2 = f40Var;
                Object objM5479K = f40Var2.m5479K(p80Var, i, andIncrement, null);
                C0641f8 c0641f8 = h40.f20372m;
                up4 up4Var = null;
                if (objM5479K == c0641f8) {
                    C1077qn.m9989o("unreachable");
                    return null;
                }
                C0641f8 c0641f9 = h40.f20374o;
                if (objM5479K == c0641f9) {
                    if (andIncrement < f40Var2.m5499u()) {
                        p80Var.m9128a();
                    }
                    f40Var = f40Var2;
                } else {
                    if (objM5479K == h40.f20373n) {
                        b70 b70VarM3824u = c20.m3824u(C0006a5.m86x(ym0Var));
                        try {
                            this.f35733b = b70VarM3824u;
                            Object objM5479K2 = f40Var2.m5479K(p80Var, i, andIncrement, this);
                            yp1 yp1Var = f40Var2.f18740b;
                            if (objM5479K2 == c0641f8) {
                                mo3483a(p80Var, i);
                            } else if (objM5479K2 == c0641f9) {
                                if (andIncrement < f40Var2.m5499u()) {
                                    p80Var.m9128a();
                                }
                                p80 p80Var2 = (p80) f40.f18729i.get(f40Var2);
                                while (true) {
                                    if (f40Var2.m5502y()) {
                                        b70 b70Var = this.f35733b;
                                        this.f35733b = null;
                                        this.f35732a = h40.f20371l;
                                        Throwable thM5494p = f40Var2.m5494p();
                                        if (thM5494p == null) {
                                            b70Var.resumeWith(Boolean.FALSE);
                                        } else {
                                            b70Var.resumeWith(k43.m7389n(thM5494p));
                                        }
                                    } else {
                                        long andIncrement2 = f40.f18725e.getAndIncrement(f40Var2);
                                        long j3 = h40.f20361b;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (p80Var2.f22d != j4) {
                                            p80 p80VarM5490k2 = f40Var2.m5490k(j4, p80Var2);
                                            if (p80VarM5490k2 != null) {
                                                p80Var2 = p80VarM5490k2;
                                            }
                                        }
                                        Object objM5479K3 = f40Var2.m5479K(p80Var2, i2, andIncrement2, this);
                                        if (objM5479K3 == h40.f20372m) {
                                            mo3483a(p80Var2, i2);
                                        } else {
                                            if (objM5479K3 != h40.f20374o) {
                                                if (objM5479K3 == h40.f20373n) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                p80Var2.m9128a();
                                                this.f35732a = objM5479K3;
                                                this.f35733b = null;
                                                bool = Boolean.TRUE;
                                                if (yp1Var == null) {
                                                    break;
                                                }
                                                up4Var = new up4(z ? (byte) 1 : (byte) 0);
                                                up4Var.f32065b = yp1Var;
                                                up4Var.f32066c = objM5479K3;
                                                VarHandle.storeStoreFence();
                                                break;
                                            }
                                            if (andIncrement2 < f40Var2.m5499u()) {
                                                p80Var2.m9128a();
                                            }
                                        }
                                    }
                                }
                                b70VarM3824u.mo113h(bool, up4Var);
                            } else {
                                p80Var.m9128a();
                                this.f35732a = objM5479K2;
                                this.f35733b = null;
                                bool = Boolean.TRUE;
                                if (yp1Var != null) {
                                    up4Var = new up4(z ? (byte) 1 : (byte) 0);
                                    up4Var.f32065b = yp1Var;
                                    up4Var.f32066c = objM5479K2;
                                    VarHandle.storeStoreFence();
                                    break;
                                }
                                b70VarM3824u.mo113h(bool, up4Var);
                            }
                            Object objM3495r = b70VarM3824u.m3495r();
                            ap0 ap0Var = ap0.f14763a;
                            return objM3495r;
                        } catch (Throwable th) {
                            b70VarM3824u.m3479B();
                            throw th;
                        }
                    }
                    p80Var.m9128a();
                    this.f35732a = objM5479K;
                }
            }
            this.f35732a = h40.f20371l;
            Throwable thM5494p2 = f40Var.m5494p();
            if (thM5494p2 != null) {
                int i3 = lb4.f23914a;
                throw thM5494p2;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: c */
    public final Object m13298c() {
        Object obj = this.f35732a;
        C0641f8 c0641f8 = h40.f20375p;
        if (obj == c0641f8) {
            C1077qn.m9989o("`hasNext()` has not been invoked");
            return null;
        }
        this.f35732a = c0641f8;
        if (obj != h40.f20371l) {
            return obj;
        }
        Throwable thM5496r = this.f35734c.m5496r();
        int i = lb4.f23914a;
        throw thM5496r;
    }
}
