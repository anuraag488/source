package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sy3 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ long f30653A;

    /* JADX INFO: renamed from: t */
    public vy3 f30654t;

    /* JADX INFO: renamed from: u */
    public pl3 f30655u;

    /* JADX INFO: renamed from: v */
    public long f30656v;

    /* JADX INFO: renamed from: w */
    public boolean f30657w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f30658x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ vy3 f30659y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ pl3 f30660z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy3(vy3 vy3Var, pl3 pl3Var, long j, wm0 wm0Var) {
        super(2, wm0Var);
        this.f30659y = vy3Var;
        this.f30660z = pl3Var;
        this.f30653A = j;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        sy3 sy3Var = new sy3(this.f30659y, this.f30660z, this.f30653A, wm0Var);
        sy3Var.f30658x = obj;
        return sy3Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((sy3) create((wm0) obj2, (ty3) obj)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        vy3 vy3Var;
        pl3 pl3Var;
        vy3 vy3Var2;
        long j;
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f30657w;
        byte b = 1;
        if (!z) {
            k43.m7376J(obj);
            ty3 ty3Var = (ty3) this.f30658x;
            C0605eb c0605eb = new C0605eb(b);
            vy3Var = this.f30659y;
            c0605eb.f17940b = vy3Var;
            c0605eb.f17941c = ty3Var;
            VarHandle.storeStoreFence();
            xh1 xh1Var = vy3Var.f32960c;
            pl3Var = this.f30660z;
            long j2 = pl3Var.f27736a;
            d63 d63Var = vy3Var.f32961d;
            d63 d63Var2 = d63.f16815b;
            long j3 = this.f30653A;
            float fM12032e = vy3Var.m12032e(d63Var == d63Var2 ? jx4.m7332c(j3) : jx4.m7333d(j3));
            this.f30658x = vy3Var;
            this.f30654t = vy3Var;
            this.f30655u = pl3Var;
            this.f30656v = j2;
            this.f30657w = true;
            obj = xh1Var.mo3327a(c0605eb, fM12032e, this);
            if (obj == ap0Var) {
                return ap0Var;
            }
            vy3Var2 = vy3Var;
            j = j2;
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.f30656v;
            pl3Var = this.f30655u;
            vy3Var = this.f30654t;
            vy3Var2 = (vy3) this.f30658x;
            k43.m7376J(obj);
        }
        float fM12032e2 = vy3Var2.m12032e(((Number) obj).floatValue());
        pl3Var.f27736a = vy3Var.f32961d == d63.f16815b ? jx4.m7331b(j, fM12032e2, 0.0f, 2) : jx4.m7331b(j, 0.0f, fM12032e2, 1);
        return ju4.f22634a;
    }
}
