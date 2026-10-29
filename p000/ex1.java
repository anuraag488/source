package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ex1 {

    /* JADX INFO: renamed from: a */
    public int f18554a = -1;

    /* JADX INFO: renamed from: b */
    public float f18555b;

    /* JADX INFO: renamed from: c */
    public Object f18556c;

    public ex1(hl4 hl4Var) {
        this.f18556c = hl4Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX INFO: renamed from: a */
    public float m5418a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        hl4 hl4Var = (hl4) this.f18556c;
        int i2 = 1;
        if (z) {
            int iM5355e0 = ev0.m5355e0(hl4Var.f20679f, i, z);
            int lineStart = hl4Var.f20679f.getLineStart(iM5355e0);
            int iM6433f = hl4Var.m6433f(iM5355e0);
            if (i == lineStart || i == iM6433f) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.f18554a == i4) {
            return this.f18555b;
        }
        float fM6437j = z3 ? hl4Var.m6437j(i, z) : hl4Var.m6438k(i, z);
        if (z2) {
            this.f18554a = i4;
            this.f18555b = fM6437j;
        }
        return fM6437j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m5419b(float f, ym0 ym0Var) {
        nm3 nm3Var;
        if (ym0Var instanceof nm3) {
            nm3Var = (nm3) ym0Var;
            int i = nm3Var.f25948v;
            if ((i & Integer.MIN_VALUE) != 0) {
                nm3Var.f25948v = i - Integer.MIN_VALUE;
            } else {
                nm3Var = new nm3(this, ym0Var);
            }
        } else {
            nm3Var = new nm3(this, ym0Var);
        }
        Object objInvoke = nm3Var.f25946t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = nm3Var.f25948v;
        if (i2 == 0) {
            k43.m7376J(objInvoke);
            qm4 qm4Var = (qm4) this.f18556c;
            Float f2 = new Float(f);
            nm3Var.f25948v = 1;
            objInvoke = qm4Var.invoke(f2, nm3Var);
            if (objInvoke == ap0Var) {
                return ap0Var;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(objInvoke);
        }
        this.f18555b += ((Number) objInvoke).floatValue();
        return ju4.f22634a;
    }
}
