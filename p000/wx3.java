package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wx3 implements jy3 {

    /* JADX INFO: renamed from: k */
    public static final yg3 f33827k = ev3.m5407a(new gv3(14), new fv3(26));

    /* JADX INFO: renamed from: a */
    public final a83 f33828a;

    /* JADX INFO: renamed from: b */
    public final a83 f33829b = new a83(0);

    /* JADX INFO: renamed from: c */
    public final a83 f33830c = new a83(0);

    /* JADX INFO: renamed from: d */
    public final d83 f33831d = k43.m7398w(Boolean.FALSE);

    /* JADX INFO: renamed from: e */
    public final nv2 f33832e = sj3.m10810f();

    /* JADX INFO: renamed from: f */
    public final a83 f33833f = new a83(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: g */
    public float f33834g;

    /* JADX INFO: renamed from: h */
    public final sw0 f33835h;

    /* JADX INFO: renamed from: i */
    public final wy0 f33836i;

    /* JADX INFO: renamed from: j */
    public final wy0 f33837j;

    public wx3(int i) {
        this.f33828a = new a83(i);
        b71 b71Var = new b71((byte) 28);
        b71Var.f15141b = this;
        VarHandle.storeStoreFence();
        this.f33835h = qq2.m10019c(b71Var);
        vx3 vx3Var = new vx3((byte) 0);
        vx3Var.f32910b = this;
        VarHandle.storeStoreFence();
        this.f33836i = s94.m10566b(vx3Var);
        vx3 vx3Var2 = new vx3((byte) 1);
        vx3Var2.f32910b = this;
        VarHandle.storeStoreFence();
        this.f33837j = s94.m10566b(vx3Var2);
    }

    @Override // p000.jy3
    /* JADX INFO: renamed from: a */
    public final boolean mo6018a() {
        return ((Boolean) this.f33837j.getValue()).booleanValue();
    }

    @Override // p000.jy3
    /* JADX INFO: renamed from: b */
    public final boolean mo6019b() {
        return this.f33835h.mo6019b();
    }

    @Override // p000.jy3
    /* JADX INFO: renamed from: c */
    public final boolean mo6020c() {
        return ((Boolean) this.f33836i.getValue()).booleanValue();
    }

    @Override // p000.jy3
    /* JADX INFO: renamed from: d */
    public final Object mo6021d(xw2 xw2Var, mq1 mq1Var, ym0 ym0Var) {
        Object objMo6021d = this.f33835h.mo6021d(xw2Var, mq1Var, ym0Var);
        return objMo6021d == ap0.f14763a ? objMo6021d : ju4.f22634a;
    }

    @Override // p000.jy3
    /* JADX INFO: renamed from: e */
    public final float mo6022e(float f) {
        return this.f33835h.mo6022e(f);
    }
}
