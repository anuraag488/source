package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cu0 extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public int f16479t;

    /* JADX INFO: renamed from: u */
    public byte f16480u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ ru0 f16481v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu0(ru0 ru0Var, wm0 wm0Var) {
        super(1, wm0Var);
        this.f16481v = ru0Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        return new cu0(this.f16481v, (wm0) obj).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r10 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r10 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        if (r1.m10463v(r9) == r0) goto L31;
     */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iIntValue;
        Throwable th;
        int i;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f16480u;
        wm0 wm0Var = null;
        ru0 ru0Var = this.f16481v;
        if (b == 0) {
            k43.m7376J(obj);
            if (ru0Var.f29635k.m4507a()) {
                c74 c74VarM10430c = ru0Var.m10430c();
                this.f16480u = (byte) 1;
                obj = c74VarM10430c.m3865a();
            } else {
                this.f16480u = (byte) 2;
                obj = null;
                ro0 ro0Var = ru0Var.f29627c.f31989a;
                C0594e0 c0594e0 = new C0594e0((Object) ru0Var, obj, wm0Var, (byte) 24);
                this.f16480u = (byte) 3;
                obj = lb5.m7921b0(ro0Var, c0594e0, this);
            }
            return ap0Var;
        }
        if (b == 1) {
            k43.m7376J(obj);
            iIntValue = ((Number) obj).intValue();
            C1122rv c1122rv = ru0Var.f29633i;
            this.f16479t = iIntValue;
            this.f16480u = (byte) 4;
        } else if (b == 2) {
            k43.m7376J(obj);
            ro0 ro0Var2 = ru0Var.f29627c.f31989a;
            C0594e0 c0594e1 = new C0594e0((Object) ru0Var, obj, wm0Var, (byte) 24);
            this.f16480u = (byte) 3;
            obj = lb5.m7921b0(ro0Var2, c0594e1, this);
        } else {
            if (b != 3) {
                if (b != 4) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.f16479t;
                try {
                    k43.m7376J(obj);
                    return ju4.f22634a;
                } catch (Throwable th2) {
                    th = th2;
                    ru0Var.f29632h.m10918c(new tj3(th, i));
                    throw th;
                }
            }
            k43.m7376J(obj);
            iIntValue = ((Number) obj).intValue();
            try {
                C1122rv c1122rv2 = ru0Var.f29633i;
                this.f16479t = iIntValue;
                this.f16480u = (byte) 4;
            } catch (Throwable th3) {
                int i2 = iIntValue;
                th = th3;
                i = i2;
                ru0Var.f29632h.m10918c(new tj3(th, i));
                throw th;
            }
        }
    }
}
