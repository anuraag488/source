package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nk4 implements yj4 {

    /* JADX INFO: renamed from: a */
    public boolean f25915a;

    /* JADX INFO: renamed from: b */
    public ql4 f25916b;

    /* JADX INFO: renamed from: c */
    public ds3 f25917c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ pk4 f25918d;

    @Override // p000.yj4
    /* JADX INFO: renamed from: c */
    public final void mo8000c(long j, ds3 ds3Var) {
        long j2;
        kl4 kl4VarM11577d;
        kl4 kl4VarM11577d2;
        pk4 pk4Var = this.f25918d;
        if (pk4Var.m9547i() && ((uu1) pk4Var.f27709q.getValue()) == null) {
            pk4Var.m9555q(uu1.f32177c);
            pk4Var.f27711s = -1;
            this.f25915a = true;
            this.f25917c = ds3Var;
            pk4Var.m9551m();
            uj2 uj2Var = pk4Var.f27696d;
            if (uj2Var == null || (kl4VarM11577d2 = uj2Var.m11577d()) == null || !kl4VarM11577d2.m7545c(j)) {
                j2 = j;
                uj2 uj2Var2 = pk4Var.f27696d;
                if (uj2Var2 != null && (kl4VarM11577d = uj2Var2.m11577d()) != null) {
                    int iM7544b = kl4VarM11577d.m7544b(j2, true);
                    pk4Var.f27694b.m11899b(iM7544b);
                    xk4 xk4VarM9539b = pk4.m9539b(pk4Var.m9550l().f34341a, sc6.m10657b(iM7544b, iM7544b));
                    pk4Var.m9543e(false);
                    fv1 fv1Var = pk4Var.f27702j;
                    if (fv1Var != null) {
                        fv1Var.mo5818a(0);
                    }
                    pk4Var.f27695c.invoke(xk4VarM9539b);
                    pk4Var.f27714v = ql4.m9897a(xk4VarM9539b.f34342b);
                }
                this.f25915a = false;
            } else {
                if (pk4Var.m9550l().f34341a.f24092b.length() == 0) {
                    return;
                }
                pk4Var.m9543e(false);
                xk4 xk4VarM12702a = xk4.m12702a(pk4Var.m9550l(), null, ql4.f28556b, 5);
                ds3 ds3Var2 = this.f25917c;
                gv1 gv1Var = new gv1();
                gv1Var.f20146a = (byte) 0;
                VarHandle.storeStoreFence();
                long jM9560v = pk4Var.m9560v(xk4VarM12702a, j, true, false, ds3Var2, true, gv1Var);
                j2 = j;
                pk4Var.f27707o = ql4.m9897a(jM9560v);
                this.f25916b = ql4.m9897a(jM9560v);
            }
            pk4Var.m9556r(wu1.f33741a);
            pk4Var.f27706n = j2;
            pk4Var.m9554p(b33.m3423a(j2));
            pk4Var.f27708p = 0L;
        }
    }

    @Override // p000.yj4
    /* JADX INFO: renamed from: d */
    public final void mo8001d(long j) {
        kl4 kl4VarM11577d;
        long jM9560v;
        pk4 pk4Var = this.f25918d;
        if (!pk4Var.m9547i() || pk4Var.m9550l().f34341a.f24092b.length() == 0) {
            return;
        }
        pk4Var.f27708p = b33.m3430h(pk4Var.f27708p, j);
        uj2 uj2Var = pk4Var.f27696d;
        if (uj2Var != null && (kl4VarM11577d = uj2Var.m11577d()) != null) {
            pk4Var.m9554p(b33.m3423a(b33.m3430h(pk4Var.f27706n, pk4Var.f27708p)));
            if (pk4Var.f27707o != null || kl4VarM11577d.m7545c(pk4Var.m9545g().f15059a)) {
                ql4 ql4Var = pk4Var.f27707o;
                int iM7544b = ql4Var != null ? (int) (ql4Var.f28558a >> 32) : kl4VarM11577d.m7544b(pk4Var.f27706n, false);
                int iM7544b2 = kl4VarM11577d.m7544b(pk4Var.m9545g().f15059a, false);
                if (pk4Var.f27707o == null && iM7544b == iM7544b2) {
                    return;
                }
                xk4 xk4VarM9550l = pk4Var.m9550l();
                long j2 = pk4Var.m9545g().f15059a;
                ds3 ds3Var = this.f25917c;
                gv1 gv1Var = new gv1();
                gv1Var.f20146a = (byte) 9;
                VarHandle.storeStoreFence();
                jM9560v = pk4Var.m9560v(xk4VarM9550l, j2, false, false, ds3Var, true, gv1Var);
            } else {
                vi3 vi3Var = pk4Var.f27694b;
                int iM7544b3 = kl4VarM11577d.m7544b(pk4Var.f27706n, true);
                vi3Var.m11899b(iM7544b3);
                vi3 vi3Var2 = pk4Var.f27694b;
                int iM7544b4 = kl4VarM11577d.m7544b(pk4Var.m9545g().f15059a, true);
                vi3Var2.m11899b(iM7544b4);
                ds3 ds3Var2 = iM7544b3 == iM7544b4 ? wv1.f33773p : wv1.f33774q;
                xk4 xk4VarM9550l2 = pk4Var.m9550l();
                long j3 = pk4Var.m9545g().f15059a;
                gv1 gv1Var2 = new gv1();
                gv1Var2.f20146a = (byte) 9;
                VarHandle.storeStoreFence();
                jM9560v = pk4Var.m9560v(xk4VarM9550l2, j3, false, false, ds3Var2, true, gv1Var2);
            }
            this.f25916b = ql4.m9897a(jM9560v);
            if (!ql4.m9898b(jM9560v, pk4Var.f27707o)) {
                this.f25915a = false;
            }
        }
        pk4Var.m9559u(false);
    }

    /* JADX INFO: renamed from: e */
    public final void m8793e() {
        pk4 pk4Var = this.f25918d;
        pk4Var.m9555q(null);
        pk4Var.m9554p(null);
        this.f25917c = wv1.f33773p;
        pk4Var.m9559u(true);
        ql4 ql4Var = this.f25916b;
        boolean zM9900d = ql4.m9900d(ql4Var != null ? ql4Var.f28558a : pk4Var.m9550l().f34342b);
        pk4Var.m9556r(zM9900d ? wu1.f33743c : wu1.f33742b);
        uj2 uj2Var = pk4Var.f27696d;
        if (uj2Var != null) {
            uj2Var.f31924m.setValue(Boolean.valueOf(!zM9900d && y70.m13009J(pk4Var, true)));
        }
        uj2 uj2Var2 = pk4Var.f27696d;
        if (uj2Var2 != null) {
            uj2Var2.f31925n.setValue(Boolean.valueOf(!zM9900d && y70.m13009J(pk4Var, false)));
        }
        uj2 uj2Var3 = pk4Var.f27696d;
        if (uj2Var3 != null) {
            uj2Var3.f31926o.setValue(Boolean.valueOf(zM9900d && y70.m13009J(pk4Var, true)));
        }
        if (this.f25915a) {
            pk4Var.m9552n(pk4Var.f27707o);
        }
        pk4Var.f27707o = null;
    }

    @Override // p000.yj4
    public final void onCancel() {
        m8793e();
    }

    @Override // p000.yj4
    public final void onStop() {
        m8793e();
    }

    @Override // p000.yj4
    /* JADX INFO: renamed from: a */
    public final void mo7998a() {
    }

    @Override // p000.yj4
    /* JADX INFO: renamed from: b */
    public final void mo7999b() {
    }
}
