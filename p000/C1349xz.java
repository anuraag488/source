package p000;

/* JADX INFO: renamed from: xz */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1349xz {

    /* JADX INFO: renamed from: a */
    public d83 f34727a;

    /* JADX INFO: renamed from: b */
    public a83 f34728b;

    /* JADX INFO: renamed from: c */
    public a83 f34729c;

    /* JADX INFO: renamed from: d */
    public d83 f34730d;

    /* JADX INFO: renamed from: e */
    public d83 f34731e;

    /* JADX INFO: renamed from: f */
    public a83 f34732f;

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public final Object m12796a(mq1 mq1Var, ym0 ym0Var) {
        C1274vz c1274vz;
        a83 a83Var = this.f34732f;
        if (ym0Var instanceof C1274vz) {
            c1274vz = (C1274vz) ym0Var;
            int i = c1274vz.f32977v;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1274vz.f32977v = i - Integer.MIN_VALUE;
            } else {
                c1274vz = new C1274vz(this, ym0Var);
            }
        } else {
            c1274vz = new C1274vz(this, ym0Var);
        }
        Object objM13685q = c1274vz.f32975t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = c1274vz.f32977v;
        wm0 wm0Var = null;
        try {
            if (i2 == 0) {
                k43.m7376J(objM13685q);
                a83Var.m133i(a83Var.m132h() + 1);
                C1312wz c1312wz = new C1312wz((Object) mq1Var, (Object) this, wm0Var, (byte) 0);
                c1274vz.f32977v = 1;
                objM13685q = zp0.m13685q(c1312wz, c1274vz);
                if (objM13685q == ap0Var) {
                    return ap0Var;
                }
            } else {
                if (i2 != 1) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(objM13685q);
            }
            a83Var.m133i(a83Var.m132h() - 1);
            return objM13685q;
        } catch (Throwable th) {
            a83Var.m133i(a83Var.m132h() - 1);
            throw th;
        }
    }
}
