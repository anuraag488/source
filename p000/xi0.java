package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xi0 implements w53, po0 {

    /* JADX INFO: renamed from: b */
    public static final q50 f34298b = new q50(2);

    /* JADX INFO: renamed from: a */
    public ir1 f34299a;

    /* JADX INFO: renamed from: c */
    public final void m12697c(Object obj, Throwable th) {
        C0675g4 c0675g4 = new C0675g4((byte) 20);
        c0675g4.f19600b = this;
        c0675g4.f19601c = obj;
        VarHandle.storeStoreFence();
        y42.m12837K0(th, c0675g4);
    }

    @Override // p000.w53
    /* JADX INFO: renamed from: d */
    public final List mo12110d(Integer num) {
        return this.f34299a.m6862H();
    }

    @Override // p000.ro0
    public final Object fold(mq1 mq1Var, Object obj) {
        return mq1Var.invoke(obj, this);
    }

    @Override // p000.ro0
    public final /* bridge */ po0 get(qo0 qo0Var) {
        return AbstractC1356y5.m12929w(this, qo0Var);
    }

    @Override // p000.po0
    public final qo0 getKey() {
        return f34298b;
    }

    @Override // p000.w53
    /* JADX INFO: renamed from: i */
    public final boolean mo12111i() {
        return this.f34299a.f21666C;
    }

    @Override // p000.ro0
    public final /* bridge */ ro0 minusKey(qo0 qo0Var) {
        return AbstractC1356y5.m12896E(this, qo0Var);
    }

    @Override // p000.ro0
    public final ro0 plus(ro0 ro0Var) {
        return qs5.m10089N(this, ro0Var);
    }
}
