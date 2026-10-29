package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: fb */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0644fb extends of4 implements nq1 {

    /* JADX INFO: renamed from: t */
    public boolean f18882t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f18883u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C0719hb f18884v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ nl3 f18885w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f18886x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0644fb(C0719hb c0719hb, nl3 nl3Var, float f, wm0 wm0Var) {
        super(3, wm0Var);
        this.f18884v = c0719hb;
        this.f18885w = nl3Var;
        this.f18886x = f;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        nl3 nl3Var = this.f18885w;
        float f = this.f18886x;
        C0644fb c0644fb = new C0644fb(this.f18884v, nl3Var, f, (wm0) obj3);
        c0644fb.f18883u = (C0903mb) obj;
        return c0644fb.invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        nl3 nl3Var;
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f18882t;
        if (!z) {
            k43.m7376J(obj);
            C0903mb c0903mb = (C0903mb) this.f18883u;
            C0605eb c0605eb = new C0605eb((byte) 0);
            C0719hb c0719hb = this.f18884v;
            c0605eb.f17940b = c0719hb;
            c0605eb.f17941c = c0903mb;
            VarHandle.storeStoreFence();
            xh1 xh1Var = c0719hb.f20464L;
            if (xh1Var == null) {
                z62.m13366Y("resolvedFlingBehavior");
                throw null;
            }
            nl3 nl3Var2 = this.f18885w;
            this.f18883u = nl3Var2;
            this.f18882t = true;
            obj = xh1Var.mo3327a(c0605eb, this.f18886x, this);
            if (obj == ap0Var) {
                return ap0Var;
            }
            nl3Var = nl3Var2;
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nl3Var = (nl3) this.f18883u;
            k43.m7376J(obj);
        }
        nl3Var.f25933a = ((Number) obj).floatValue();
        return ju4.f22634a;
    }
}
