package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a62 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ yp1 f130A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ xz4 f131B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ boolean f132C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ C0950nl f133D;

    /* JADX INFO: renamed from: t */
    public Throwable f134t;

    /* JADX INFO: renamed from: u */
    public byte f135u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f136v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ dz0 f137w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ yp1 f138x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ mq1 f139y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ wp1 f140z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a62(dz0 dz0Var, yp1 yp1Var, mq1 mq1Var, wp1 wp1Var, yp1 yp1Var2, xz4 xz4Var, boolean z, C0950nl c0950nl, wm0 wm0Var) {
        super(2, wm0Var);
        this.f137w = dz0Var;
        this.f138x = yp1Var;
        this.f139y = mq1Var;
        this.f140z = wp1Var;
        this.f130A = yp1Var2;
        this.f131B = xz4Var;
        this.f132C = z;
        this.f133D = c0950nl;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        a62 a62Var = new a62(this.f137w, this.f138x, this.f139y, this.f140z, this.f130A, this.f131B, this.f132C, this.f133D, wm0Var);
        a62Var.f136v = obj;
        return a62Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((a62) create((wm0) obj2, (u93) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
    
        if (r10.invoke(r21) == r9) goto L34;
     */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        wm0 wm0Var;
        u93 u93Var = (u93) this.f136v;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f135u;
        yp1 yp1Var = this.f138x;
        byte b2 = 2;
        wm0 wm0Var2 = null;
        try {
            try {
                if (b == 0) {
                    k43.m7376J(obj);
                    dz0 dz0Var = this.f137w;
                    this.f136v = u93Var;
                    this.f135u = (byte) 1;
                    if (dz0Var.m4804c(this) == ap0Var) {
                    }
                    return ap0Var;
                }
                if (b == 1) {
                    k43.m7376J(obj);
                } else if (b == 2) {
                    k43.m7376J(obj);
                    wm0Var = null;
                    this.f136v = wm0Var;
                    this.f135u = (byte) 3;
                } else {
                    if (b != 3) {
                        if (b != 4) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th = this.f134t;
                        k43.m7376J(obj);
                        throw th;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
                mq1[] mq1VarArr = {new C0671g0(this.f139y, this.f140z, this.f130A, wm0Var2, (byte) 27), new fu0((byte) 1, null, this.f131B, u93Var, this.f133D, this.f132C), new C0784j3(u93Var, wm0Var, b2)};
                this.f136v = null;
                this.f135u = (byte) 2;
                if (fp0.m5770a(mq1VarArr, this) != ap0Var) {
                    this.f136v = wm0Var;
                    this.f135u = (byte) 3;
                }
            } catch (Throwable th2) {
                th = th2;
                this.f136v = wm0Var;
                this.f134t = th;
                this.f135u = (byte) 4;
                if (yp1Var.invoke(this) != ap0Var) {
                    throw th;
                }
            }
            wm0Var = null;
        } catch (Throwable th3) {
            th = th3;
            wm0Var = null;
        }
        return ap0Var;
    }
}
