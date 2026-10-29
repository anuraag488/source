package p000;

/* JADX INFO: renamed from: ki */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0836ki extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0910mi f23134t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f23135u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0836ki(C0910mi c0910mi, Object obj, wm0 wm0Var) {
        super(1, wm0Var);
        this.f23134t = c0910mi;
        this.f23135u = obj;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        C0836ki c0836ki = new C0836ki(this.f23134t, this.f23135u, (wm0) obj);
        ju4 ju4Var = ju4.f22634a;
        c0836ki.invokeSuspend(ju4Var);
        return ju4Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ap0 ap0Var = ap0.f14763a;
        k43.m7376J(obj);
        C0910mi c0910mi = this.f23134t;
        c0910mi.m8327c();
        Object objM8326b = c0910mi.m8326b(this.f23135u);
        c0910mi.f24929c.f14572b.setValue(objM8326b);
        c0910mi.f24931e.setValue(objM8326b);
        return ju4.f22634a;
    }
}
