package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class eu0 extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public Throwable f18483t;

    /* JADX INFO: renamed from: u */
    public byte f18484u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ ru0 f18485v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ gu0 f18486w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f18487x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu0(ru0 ru0Var, gu0 gu0Var, boolean z, wm0 wm0Var) {
        super(1, wm0Var);
        this.f18485v = ru0Var;
        this.f18486w = gu0Var;
        this.f18487x = z;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        gu0 gu0Var = this.f18486w;
        boolean z = this.f18487x;
        return new eu0(this.f18485v, gu0Var, z, (wm0) obj).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        wb4 tj3Var;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f18484u;
        gu0 gu0Var = this.f18486w;
        try {
            if (b == 0) {
                k43.m7376J(obj);
                ru0 ru0Var = this.f18485v;
                this.f18484u = (byte) 1;
                obj = ru0Var.m10435h(true, gu0Var, this);
                if (obj == ap0Var) {
                    return ap0Var;
                }
            } else {
                if (b != 1) {
                    if (b != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = this.f18483t;
                    k43.m7376J(obj);
                    tj3Var = new tj3(th, ((Number) obj).intValue());
                    return new l73(tj3Var, Boolean.TRUE);
                }
                k43.m7376J(obj);
            }
            tj3Var = (wb4) obj;
        } catch (Throwable th2) {
            Boolean boolValueOf = Boolean.valueOf(this.f18487x);
            this.f18483t = th2;
            this.f18484u = (byte) 2;
            Object objInvoke = gu0Var.invoke(boolValueOf, this);
            if (objInvoke != ap0Var) {
                obj = objInvoke;
                th = th2;
            }
            return ap0Var;
        }
        return new l73(tj3Var, Boolean.TRUE);
    }
}
