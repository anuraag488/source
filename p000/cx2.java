package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cx2 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ dx2 f16569A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ mq1 f16570B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ Object f16571C;

    /* JADX INFO: renamed from: t */
    public gx2 f16572t;

    /* JADX INFO: renamed from: u */
    public Object f16573u;

    /* JADX INFO: renamed from: v */
    public Object f16574v;

    /* JADX INFO: renamed from: w */
    public dx2 f16575w;

    /* JADX INFO: renamed from: x */
    public byte f16576x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f16577y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ xw2 f16578z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx2(xw2 xw2Var, dx2 dx2Var, mq1 mq1Var, Object obj, wm0 wm0Var) {
        super(2, wm0Var);
        this.f16578z = xw2Var;
        this.f16569A = dx2Var;
        this.f16570B = mq1Var;
        this.f16571C = obj;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        cx2 cx2Var = new cx2(this.f16578z, this.f16569A, this.f16570B, this.f16571C, wm0Var);
        cx2Var.f16577y = obj;
        return cx2Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((cx2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [byte, gx2] */
    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ax2 ax2Var;
        dx2 dx2Var;
        gx2 gx2Var;
        mq1 mq1Var;
        Object obj2;
        dx2 dx2Var2;
        Throwable th;
        ax2 ax2Var2;
        gx2 gx2Var2;
        ap0 ap0Var = ap0.f14763a;
        ?? r1 = this.f16576x;
        try {
            try {
                if (r1 == 0) {
                    k43.m7376J(obj);
                    ax2Var = new ax2(this.f16578z, (t82) ((zo0) this.f16577y).mo6367f().get(o85.f26448h));
                    dx2Var = this.f16569A;
                    dx2Var.m4789a(ax2Var);
                    gx2Var = dx2Var.f17478b;
                    this.f16577y = ax2Var;
                    this.f16572t = gx2Var;
                    mq1Var = this.f16570B;
                    this.f16573u = mq1Var;
                    Object obj3 = this.f16571C;
                    this.f16574v = obj3;
                    this.f16575w = dx2Var;
                    this.f16576x = (byte) 1;
                    if (gx2Var.m6191e(this) != ap0Var) {
                        obj2 = obj3;
                    }
                    return ap0Var;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dx2Var2 = (dx2) this.f16573u;
                    gx2Var2 = this.f16572t;
                    ax2Var2 = (ax2) this.f16577y;
                    try {
                        k43.m7376J(obj);
                        dx2Var2.f17477a.compareAndSet(ax2Var2, null);
                        gx2Var2.m6193g(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        dx2Var2.f17477a.compareAndSet(ax2Var2, null);
                        throw th;
                    }
                }
                dx2 dx2Var3 = this.f16575w;
                obj2 = this.f16574v;
                mq1 mq1Var2 = (mq1) this.f16573u;
                gx2 gx2Var3 = this.f16572t;
                ax2 ax2Var3 = (ax2) this.f16577y;
                k43.m7376J(obj);
                mq1Var = mq1Var2;
                gx2Var = gx2Var3;
                dx2Var = dx2Var3;
                ax2Var = ax2Var3;
                this.f16577y = ax2Var;
                this.f16572t = gx2Var;
                this.f16573u = dx2Var;
                this.f16574v = null;
                this.f16575w = null;
                this.f16576x = (byte) 2;
                Object objInvoke = mq1Var.invoke(obj2, this);
                if (objInvoke != ap0Var) {
                    dx2Var2 = dx2Var;
                    obj = objInvoke;
                    ax2Var2 = ax2Var;
                    gx2Var2 = gx2Var;
                    dx2Var2.f17477a.compareAndSet(ax2Var2, null);
                    gx2Var2.m6193g(null);
                    return obj;
                }
                return ap0Var;
            } catch (Throwable th3) {
                dx2Var2 = dx2Var;
                th = th3;
                ax2Var2 = ax2Var;
                dx2Var2.f17477a.compareAndSet(ax2Var2, null);
                throw th;
            }
        } catch (Throwable th4) {
            r1.m6193g(null);
            throw th4;
        }
    }
}
