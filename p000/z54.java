package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z54 extends bp3 implements mq1 {

    /* JADX INFO: renamed from: u */
    public float f35761u;

    /* JADX INFO: renamed from: v */
    public int f35762v;

    /* JADX INFO: renamed from: w */
    public byte f35763w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f35764x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ d64 f35765y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ lv1 f35766z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z54(d64 d64Var, lv1 lv1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f35765y = d64Var;
        this.f35766z = lv1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        z54 z54Var = new z54(this.f35765y, this.f35766z, wm0Var);
        z54Var.f35764x = obj;
        return z54Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((z54) create((wm0) obj2, (uf4) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (p000.fi4.m5717a(r0, false, r11, r10) == r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r11 == r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0050 -> B:17:0x0053). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float fM13399h;
        int i;
        uf4 uf4Var = (uf4) this.f35764x;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f35763w;
        d64 d64Var = this.f35765y;
        if (b != 0) {
            if (b == 1) {
                k43.m7376J(obj);
            } else {
                if (b != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.f35762v;
                fM13399h = this.f35761u;
                k43.m7376J(obj);
            }
            if (AbstractC1356y5.m12923q((lc3) hb0.m6299K0(((ec3) obj).f18000a))) {
                return ju4.f22634a;
            }
            if (i == 0 && !d64Var.f16820d.m8672j() && ((z73) d64Var.f16820d.f25612i).m13399h() != fM13399h) {
                lv1 lv1Var = this.f35766z;
                if (lv1Var != null) {
                    lv1Var.m8115a(new dv1(d55.m4371p(0.7f, 1, 0), nv1.m8856a()));
                }
                i = 1;
            }
            fc3 fc3Var = fc3.f18905c;
            this.f35764x = uf4Var;
            this.f35761u = fM13399h;
            this.f35762v = i;
            this.f35763w = (byte) 2;
            obj = uf4Var.m11538a(fc3Var, this);
        } else {
            k43.m7376J(obj);
            fc3 fc3Var2 = fc3.f18903a;
            this.f35764x = uf4Var;
            this.f35763w = (byte) 1;
        }
        fM13399h = ((z73) d64Var.f16820d.f25612i).m13399h();
        i = 0;
        fc3 fc3Var3 = fc3.f18905c;
        this.f35764x = uf4Var;
        this.f35761u = fM13399h;
        this.f35762v = i;
        this.f35763w = (byte) 2;
        obj = uf4Var.m11538a(fc3Var3, this);
    }
}
