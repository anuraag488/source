package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ew2 extends bp3 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ fw2 f18537A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ xf1 f18538B;

    /* JADX INFO: renamed from: u */
    public xf1 f18539u;

    /* JADX INFO: renamed from: v */
    public fw2 f18540v;

    /* JADX INFO: renamed from: w */
    public long[] f18541w;

    /* JADX INFO: renamed from: x */
    public int f18542x;

    /* JADX INFO: renamed from: y */
    public boolean f18543y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f18544z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew2(fw2 fw2Var, xf1 xf1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f18537A = fw2Var;
        this.f18538B = xf1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        ew2 ew2Var = new ew2(this.f18537A, this.f18538B, wm0Var);
        ew2Var.f18544z = obj;
        return ew2Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((ew2) create((wm0) obj2, (b24) obj)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        b24 b24Var;
        fw2 fw2Var;
        long[] jArr;
        int i;
        xf1 xf1Var;
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f18543y;
        if (!z) {
            k43.m7376J(obj);
            b24Var = (b24) this.f18544z;
            fw2Var = this.f18537A;
            dw2 dw2Var = fw2Var.f19355b;
            jArr = dw2Var.f17457c;
            i = dw2Var.f17459e;
            xf1Var = this.f18538B;
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f18542x;
            jArr = this.f18541w;
            fw2Var = this.f18540v;
            xf1Var = this.f18539u;
            b24Var = (b24) this.f18544z;
            k43.m7376J(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return ju4.f22634a;
        }
        int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
        xf1Var.f34223c = i;
        Object obj2 = fw2Var.f19355b.f17456b[i];
        this.f18544z = b24Var;
        this.f18539u = xf1Var;
        this.f18540v = fw2Var;
        this.f18541w = jArr;
        this.f18542x = i2;
        this.f18543y = true;
        b24Var.m3411c(obj2, this);
        return ap0Var;
    }
}
