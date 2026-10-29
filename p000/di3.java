package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class di3 implements yf3 {

    /* JADX INFO: renamed from: a */
    public static final di3 f17082a = new di3();

    /* JADX INFO: renamed from: b */
    public static final rf3 f17083b = rf3.m10326a(new xd2((byte) 20), rj2.class, ci3.class);

    @Override // p000.yf3
    /* JADX INFO: renamed from: a */
    public final Class mo4514a() {
        return ci3.class;
    }

    @Override // p000.yf3
    /* JADX INFO: renamed from: b */
    public final Object mo4515b(jp0 jp0Var, ut2 ut2Var, C1163sz c1163sz) {
        if (!ut2Var.f32156a.isEmpty()) {
            wv2.f33785b.m12425a().getClass();
        }
        jp0Var.m7217C();
        v51 v51Var = new v51();
        VarHandle.storeStoreFence();
        return v51Var;
    }

    @Override // p000.yf3
    /* JADX INFO: renamed from: c */
    public final Class mo4516c() {
        return ci3.class;
    }
}
