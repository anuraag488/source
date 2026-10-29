package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uy3 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public long f32255t;

    /* JADX INFO: renamed from: u */
    public byte f32256u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ long f32257v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ vy3 f32258w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy3(vy3 vy3Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f32258w = vy3Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        uy3 uy3Var = new uy3(this.f32258w, wm0Var);
        uy3Var.f32257v = ((jx4) obj).f22730a;
        return uy3Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((uy3) create((wm0) obj2, jx4.m7330a(((jx4) obj).f22730a))).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f32256u;
        vy3 vy3Var = this.f32258w;
        if (b == 0) {
            k43.m7376J(obj);
            j = this.f32257v;
            g03 g03Var = vy3Var.f32963f;
            this.f32257v = j;
            this.f32256u = (byte) 1;
            obj = g03Var.m5871b(j, this);
            if (obj != ap0Var) {
            }
            return ap0Var;
        }
        if (b == 1) {
            j = this.f32257v;
            k43.m7376J(obj);
        } else {
            if (b == 2) {
                j2 = this.f32255t;
                j = this.f32257v;
                k43.m7376J(obj);
                j3 = ((jx4) obj).f22730a;
                g03 g03Var2 = vy3Var.f32963f;
                long jM7334e = jx4.m7334e(j2, j3);
                this.f32257v = j;
                this.f32255t = j3;
                this.f32256u = (byte) 3;
                obj = g03Var2.m5870a(jM7334e, j3, this);
                if (obj != ap0Var) {
                    j4 = j;
                    j5 = j3;
                }
                return ap0Var;
            }
            if (b != 3) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j5 = this.f32255t;
            j4 = this.f32257v;
            k43.m7376J(obj);
        }
        return jx4.m7330a(jx4.m7334e(j4, jx4.m7334e(j5, ((jx4) obj).f22730a)));
        long jM7334e2 = jx4.m7334e(j, ((jx4) obj).f22730a);
        this.f32257v = j;
        this.f32255t = jM7334e2;
        this.f32256u = (byte) 2;
        obj = vy3Var.m12028a(jM7334e2, this);
        if (obj != ap0Var) {
            j2 = jM7334e2;
            j3 = ((jx4) obj).f22730a;
            g03 g03Var3 = vy3Var.f32963f;
            long jM7334e3 = jx4.m7334e(j2, j3);
            this.f32257v = j;
            this.f32255t = j3;
            this.f32256u = (byte) 3;
            obj = g03Var3.m5870a(jM7334e3, j3, this);
            if (obj != ap0Var) {
                j4 = j;
                j5 = j3;
                return jx4.m7330a(jx4.m7334e(j4, jx4.m7334e(j5, ((jx4) obj).f22730a)));
            }
        }
        return ap0Var;
    }
}
