package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class em0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public boolean f18250t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f18251u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ fm0 f18252v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ iv4 f18253w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ k30 f18254x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f18255y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em0(fm0 fm0Var, iv4 iv4Var, k30 k30Var, long j, wm0 wm0Var) {
        super(2, wm0Var);
        this.f18252v = fm0Var;
        this.f18253w = iv4Var;
        this.f18254x = k30Var;
        this.f18255y = j;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        em0 em0Var = new em0(this.f18252v, this.f18253w, this.f18254x, this.f18255y, wm0Var);
        em0Var.f18251u = obj;
        return em0Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((em0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        fm0 fm0Var = this.f18252v;
        b30 b30Var = fm0Var.f19113t;
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f18250t;
        try {
            try {
                if (!z) {
                    k43.m7376J(obj);
                    t82 t82VarM13042w = y70.m13042w(((zo0) this.f18251u).mo6367f());
                    fm0Var.f19116w = true;
                    vy3 vy3Var = fm0Var.f19109p;
                    xw2 xw2Var = xw2.f34665a;
                    dm0 dm0Var = new dm0(this.f18253w, fm0Var, this.f18254x, this.f18255y, t82VarM13042w, null);
                    this.f18250t = true;
                    if (vy3Var.m12034g(xw2Var, dm0Var, this) == ap0Var) {
                        return ap0Var;
                    }
                } else {
                    if (!z) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                b30Var.m3422c();
                fm0Var.f19116w = false;
                b30Var.m3421b(null);
                fm0Var.f19114u = false;
                return ju4.f22634a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            fm0Var.f19116w = false;
            b30Var.m3421b(null);
            fm0Var.f19114u = false;
            throw th;
        }
    }
}
