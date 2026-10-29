package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sx1 extends mt2 implements oc3 {

    /* JADX INFO: renamed from: o */
    public nv2 f30628o;

    /* JADX INFO: renamed from: p */
    public mx1 f30629p;

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        m10945Q0();
    }

    @Override // p000.oc3
    /* JADX INFO: renamed from: N */
    public final void mo6964N(ec3 ec3Var, fc3 fc3Var, long j) {
        if (fc3Var == fc3.f18904b) {
            int i = ec3Var.f18005f;
            wm0 wm0Var = null;
            if (i == 4) {
                lb5.m7910S(m8391C0(), null, null, new rx1(this, wm0Var, (byte) 0), 3);
            } else if (i == 5) {
                lb5.m7910S(m8391C0(), null, null, new rx1(this, wm0Var, (byte) 1), 3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: O0 */
    public final Object m10943O0(ym0 ym0Var) {
        px1 px1Var;
        mx1 mx1Var;
        if (ym0Var instanceof px1) {
            px1Var = (px1) ym0Var;
            int i = px1Var.f28067w;
            if ((i & Integer.MIN_VALUE) != 0) {
                px1Var.f28067w = i - Integer.MIN_VALUE;
            } else {
                px1Var = new px1(this, ym0Var);
            }
        } else {
            px1Var = new px1(this, ym0Var);
        }
        Object obj = px1Var.f28065u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = px1Var.f28067w;
        if (i2 == 0) {
            k43.m7376J(obj);
            if (this.f30629p == null) {
                mx1 mx1Var2 = new mx1();
                nv2 nv2Var = this.f30628o;
                px1Var.f28064t = mx1Var2;
                px1Var.f28067w = 1;
                if (nv2Var.m8860a(mx1Var2, px1Var) == ap0Var) {
                    return ap0Var;
                }
                mx1Var = mx1Var2;
            }
            return ju4.f22634a;
        }
        if (i2 != 1) {
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mx1Var = px1Var.f28064t;
        k43.m7376J(obj);
        this.f30629p = mx1Var;
        return ju4.f22634a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: P0 */
    public final Object m10944P0(ym0 ym0Var) {
        qx1 qx1Var;
        if (ym0Var instanceof qx1) {
            qx1Var = (qx1) ym0Var;
            int i = qx1Var.f28866v;
            if ((i & Integer.MIN_VALUE) != 0) {
                qx1Var.f28866v = i - Integer.MIN_VALUE;
            } else {
                qx1Var = new qx1(this, ym0Var);
            }
        } else {
            qx1Var = new qx1(this, ym0Var);
        }
        Object obj = qx1Var.f28864t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = qx1Var.f28866v;
        if (i2 == 0) {
            k43.m7376J(obj);
            mx1 mx1Var = this.f30629p;
            if (mx1Var != null) {
                nx1 nx1Var = new nx1(mx1Var);
                nv2 nv2Var = this.f30628o;
                qx1Var.f28866v = 1;
                if (nv2Var.m8860a(nx1Var, qx1Var) == ap0Var) {
                    return ap0Var;
                }
            }
            return ju4.f22634a;
        }
        if (i2 != 1) {
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k43.m7376J(obj);
        this.f30629p = null;
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m10945Q0() {
        mx1 mx1Var = this.f30629p;
        if (mx1Var != null) {
            this.f30628o.m8861b(new nx1(mx1Var));
            this.f30629p = null;
        }
    }

    @Override // p000.oc3
    /* JADX INFO: renamed from: j0 */
    public final void mo8143j0() {
        m10945Q0();
    }
}
