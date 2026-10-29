package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h84 extends of4 implements nq1 {

    /* JADX INFO: renamed from: t */
    public ff3 f20426t;

    /* JADX INFO: renamed from: u */
    public Throwable f20427u;

    /* JADX INFO: renamed from: v */
    public byte f20428v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ df3 f20429w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ long f20430x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ nv2 f20431y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ k84 f20432z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h84(nv2 nv2Var, k84 k84Var, wm0 wm0Var) {
        super(3, wm0Var);
        this.f20431y = nv2Var;
        this.f20432z = k84Var;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((b33) obj2).f15059a;
        h84 h84Var = new h84(this.f20431y, this.f20432z, (wm0) obj3);
        h84Var.f20429w = (df3) obj;
        h84Var.f20430x = j;
        return h84Var.invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws Throwable {
        ff3 ff3Var;
        float fM132h;
        ef3 ef3Var;
        Throwable th;
        df3 df3Var = this.f20429w;
        long j = this.f20430x;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f20428v;
        nv2 nv2Var = this.f20431y;
        if (b != 0) {
            if (b == 1) {
                ff3Var = this.f20426t;
                try {
                    k43.m7376J(obj);
                } catch (Throwable th2) {
                    th = th2;
                    if (ff3Var != null) {
                        throw th;
                    }
                    ef3Var = new ef3(ff3Var);
                    this.f20429w = null;
                    this.f20426t = null;
                    this.f20427u = th;
                    this.f20430x = j;
                    this.f20428v = (byte) 3;
                    if (nv2Var.m8860a(ef3Var, this) != ap0Var) {
                        th = th;
                        throw th;
                    }
                    return ap0Var;
                }
            } else {
                if (b != 2) {
                    if (b != 3) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = this.f20427u;
                    k43.m7376J(obj);
                    throw th;
                }
                k43.m7376J(obj);
            }
            return ju4.f22634a;
        }
        k43.m7376J(obj);
        try {
            ff3 ff3Var2 = new ff3(j);
            try {
                nv2Var.m8861b(ff3Var2);
                k84 k84Var = this.f20432z;
                if (k84Var.f22992g == d63.f16814a) {
                    fM132h = Float.intBitsToFloat((int) (4294967295L & j));
                } else {
                    fM132h = k84Var.f22993h ? k84Var.f22990e.m132h() - Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32));
                }
                k84Var.f22999n.m13400i(fM132h - k84Var.f22998m.m13399h());
                this.f20429w = null;
                this.f20426t = ff3Var2;
                this.f20430x = j;
                this.f20428v = (byte) 1;
                Object objM4501h = df3Var.m4501h(this);
                if (objM4501h != ap0Var) {
                    ff3Var = ff3Var2;
                    obj = objM4501h;
                }
            } catch (Throwable th3) {
                ff3Var = ff3Var2;
                th = th3;
                if (ff3Var != null) {
                    throw th;
                }
                ef3Var = new ef3(ff3Var);
                this.f20429w = null;
                this.f20426t = null;
                this.f20427u = th;
                this.f20430x = j;
                this.f20428v = (byte) 3;
                if (nv2Var.m8860a(ef3Var, this) != ap0Var) {
                    th = th;
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            ff3Var = null;
        }
        return ap0Var;
        nv2Var.m8861b(((Boolean) obj).booleanValue() ? new gf3(ff3Var) : new ef3(ff3Var));
        return ju4.f22634a;
    }
}
