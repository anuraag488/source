package p000;

import android.graphics.BlendModeColorFilter;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: ig */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0760ig implements yp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ long f21354a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ wp1 f21355b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f21356c;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        long j = this.f21354a;
        wp1 wp1Var = this.f21355b;
        boolean z = this.f21356c;
        z50 z50Var = (z50) obj;
        t02 t02VarM6593r = i20.m6593r(z50Var, Float.intBitsToFloat((int) (z50Var.f35750a.mo8940d() >> 32)) / 2.0f);
        BlendModeColorFilter blendModeColorFilter = new BlendModeColorFilter(zy5.m13858V(j), d24.m4295J(5));
        o00 o00Var = new o00();
        o00Var.f26229a = blendModeColorFilter;
        o00Var.f26230b = j;
        o00Var.f26231c = 5;
        VarHandle.storeStoreFence();
        C0453ag c0453ag = new C0453ag((byte) 0);
        c0453ag.f14444c = wp1Var;
        c0453ag.f14443b = z;
        c0453ag.f14445d = t02VarM6593r;
        c0453ag.f14446e = o00Var;
        VarHandle.storeStoreFence();
        return z50Var.m13338a(c0453ag);
    }
}
