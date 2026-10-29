package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ji */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0799ji extends of4 implements yp1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ yp1 f22289A;

    /* JADX INFO: renamed from: t */
    public C0457ak f22290t;

    /* JADX INFO: renamed from: u */
    public ml3 f22291u;

    /* JADX INFO: renamed from: v */
    public boolean f22292v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C0910mi f22293w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f22294x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ hi4 f22295y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f22296z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0799ji(C0910mi c0910mi, Object obj, hi4 hi4Var, long j, yp1 yp1Var, wm0 wm0Var) {
        super(1, wm0Var);
        this.f22293w = c0910mi;
        this.f22294x = obj;
        this.f22295y = hi4Var;
        this.f22296z = j;
        this.f22289A = yp1Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        long j = this.f22296z;
        yp1 yp1Var = this.f22289A;
        return new C0799ji(this.f22293w, this.f22294x, this.f22295y, j, yp1Var, (wm0) obj).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        C0457ak c0457ak;
        ml3 ml3Var;
        hi4 hi4Var = this.f22295y;
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f22292v;
        C0910mi c0910mi = this.f22293w;
        try {
            if (!z) {
                k43.m7376J(obj);
                c0910mi.f24929c.f14573c = (AbstractC0654fk) c0910mi.f24927a.f30508a.invoke(this.f22294x);
                c0910mi.f24931e.setValue(hi4Var.f20605c);
                c0910mi.f24930d.setValue(Boolean.TRUE);
                C0457ak c0457ak2 = c0910mi.f24929c;
                C0457ak c0457ak3 = new C0457ak(c0457ak2.f14571a, c0457ak2.f14572b.getValue(), sj3.m10824t(c0457ak2.f14573c), c0457ak2.f14574d, Long.MIN_VALUE, c0457ak2.f14576f);
                ml3 ml3Var2 = new ml3();
                long j = this.f22296z;
                yp1 yp1Var = this.f22289A;
                C0762ii c0762ii = new C0762ii((byte) 0);
                c0762ii.f21430b = c0910mi;
                c0762ii.f21431c = c0457ak3;
                c0762ii.f21432d = yp1Var;
                c0762ii.f21433e = ml3Var2;
                VarHandle.storeStoreFence();
                this.f22290t = c0457ak3;
                this.f22291u = ml3Var2;
                this.f22292v = true;
                if (qs5.m10103h(c0457ak3, hi4Var, j, c0762ii, this) == ap0Var) {
                    return ap0Var;
                }
                c0457ak = c0457ak3;
                ml3Var = ml3Var2;
            } else {
                if (!z) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ml3Var = this.f22291u;
                c0457ak = this.f22290t;
                k43.m7376J(obj);
            }
            EnumC1258vj enumC1258vj = ml3Var.f25002a ? EnumC1258vj.f32656a : EnumC1258vj.f32657b;
            c0910mi.m8327c();
            C1333xj c1333xj = new C1333xj();
            c1333xj.f34310a = c0457ak;
            c1333xj.f34311b = enumC1258vj;
            VarHandle.storeStoreFence();
            return c1333xj;
        } catch (CancellationException e) {
            c0910mi.m8327c();
            throw e;
        }
    }
}
