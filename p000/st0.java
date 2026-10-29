package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class st0 extends of4 implements nq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f30552t = 1;

    /* JADX INFO: renamed from: u */
    public boolean f30553u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f30554v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st0(ru0 ru0Var, wm0 wm0Var) {
        super(3, wm0Var);
        this.f30554v = ru0Var;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.f30552t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return new st0((ru0) this.f30554v, (wm0) obj3).invokeSuspend(ju4Var);
            default:
                ((Boolean) obj2).getClass();
                st0 st0Var = new st0(3, (wm0) obj3);
                st0Var.f30554v = (bf1) obj;
                return st0Var.invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws IOException {
        switch (this.f30552t) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f30553u;
                if (!z) {
                    k43.m7376J(obj);
                    ru0 ru0Var = (ru0) this.f30554v;
                    this.f30553u = true;
                    if (ru0Var.m10429b(this) == ap0Var) {
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
            default:
                bf1 bf1Var = (bf1) this.f30554v;
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f30553u;
                if (!z2) {
                    k43.m7376J(obj);
                    this.f30554v = null;
                    this.f30553u = true;
                    if (!bf1Var.f15235c.get()) {
                        Object objM4691T = dt0.m4691T(bf1Var.f15233a, new yt0(bf1Var, null), this);
                        return objM4691T == ap0Var2 ? ap0Var2 : objM4691T;
                    }
                    C1077qn.m9989o("This scope has already been closed.");
                } else {
                    if (z2) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    public /* synthetic */ st0(int i, wm0 wm0Var) {
        super(i, wm0Var);
    }
}
