package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t40 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public byte f30746t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0910mi f30747u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ float f30748v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f30749w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ u40 f30750x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ c62 f30751y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t40(C0910mi c0910mi, float f, boolean z, u40 u40Var, c62 c62Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f30747u = c0910mi;
        this.f30748v = f;
        this.f30749w = z;
        this.f30750x = u40Var;
        this.f30751y = c62Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        return new t40(this.f30747u, this.f30748v, this.f30749w, this.f30750x, this.f30751y, wm0Var);
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((t40) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r9.m8330f(r8, r1) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (p000.f71.m5611a(r9, r5, r2, r8.f30751y, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        return r0;
     */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f30746t;
        c62 rk1Var = null;
        if (b == 0) {
            k43.m7376J(obj);
            C0910mi c0910mi = this.f30747u;
            float f = ((p11) c0910mi.f24931e.getValue()).f27285a;
            float f2 = this.f30748v;
            if (!p11.m9352c(f, f2)) {
                if (this.f30749w) {
                    float f3 = ((p11) c0910mi.f24931e.getValue()).f27285a;
                    if (p11.m9352c(f3, 0.0f)) {
                        rk1Var = new ff3(0L);
                    } else if (p11.m9352c(f3, 1.0f)) {
                        rk1Var = new mx1();
                    } else if (p11.m9352c(f3, 0.0f)) {
                        rk1Var = new rk1();
                    }
                    this.f30746t = (byte) 2;
                } else {
                    p11 p11VarM9350a = p11.m9350a(f2);
                    this.f30746t = (byte) 1;
                }
            }
        } else {
            if (b != 1 && b != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
        }
        return ju4.f22634a;
    }
}
