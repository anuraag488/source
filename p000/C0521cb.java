package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: cb */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0521cb extends of4 implements nq1 {

    /* JADX INFO: renamed from: t */
    public boolean f15906t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ C0903mb f15907u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C1031pe f15908v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C0719hb f15909w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0521cb(C1031pe c1031pe, C0719hb c0719hb, wm0 wm0Var) {
        super(3, wm0Var);
        this.f15908v = c1031pe;
        this.f15909w = c0719hb;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C0521cb c0521cb = new C0521cb(this.f15908v, this.f15909w, (wm0) obj3);
        c0521cb.f15907u = (C0903mb) obj;
        return c0521cb.invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f15906t;
        if (!z) {
            k43.m7376J(obj);
            C0903mb c0903mb = this.f15907u;
            C0558d0 c0558d0 = new C0558d0((byte) 3);
            c0558d0.f16655b = this.f15909w;
            c0558d0.f16656c = c0903mb;
            VarHandle.storeStoreFence();
            this.f15906t = true;
            if (this.f15908v.invoke(c0558d0, this) == ap0Var) {
                return ap0Var;
            }
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
        }
        return ju4.f22634a;
    }
}
