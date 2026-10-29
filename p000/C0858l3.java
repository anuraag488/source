package p000;

/* JADX INFO: renamed from: l3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0858l3 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f23752t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f23753u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f23754v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f23755w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0858l3(pp1 pp1Var, wp1 wp1Var, xb4 xb4Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f23752t = (byte) 1;
        this.f23753u = pp1Var;
        this.f23754v = wp1Var;
        this.f23755w = xb4Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        switch (this.f23752t) {
            case 0:
                C0858l3 c0858l3 = new C0858l3(this.f23754v, this.f23755w, wm0Var, (byte) 0);
                c0858l3.f23753u = obj;
                return c0858l3;
            case 1:
                return new C0858l3((pp1) this.f23753u, (wp1) this.f23754v, (xb4) this.f23755w, wm0Var);
            default:
                C0858l3 c0858l4 = new C0858l3(this.f23754v, this.f23755w, wm0Var, (byte) 2);
                c0858l4.f23753u = obj;
                return c0858l4;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f23752t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                return ((C0858l3) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
            case 1:
                ((C0858l3) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
                return ju4Var;
            default:
                return ((C0858l3) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f23752t;
        wm0 wm0Var = null;
        Object obj2 = this.f23755w;
        Object obj3 = this.f23754v;
        switch (b) {
            case 0:
                zo0 zo0Var = (zo0) this.f23753u;
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                byte b2 = 0;
                lb5.m7910S(zo0Var, null, null, new C0784j3((yp1) obj3, wm0Var, b2), 3);
                return lb5.m7910S(zo0Var, null, null, new C0821k3((yp1) obj2, wm0Var, b2), 3);
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                ((pp1) this.f23753u).f27882d = i41.m6652k(((i41) ((wp1) obj3).invoke()).f21121a, ((i41) ((xb4) obj2).getValue()).f21121a);
                return ju4.f22634a;
            default:
                ap0 ap0Var3 = ap0.f14763a;
                k43.m7376J(obj);
                zo0 zo0Var2 = (zo0) this.f23753u;
                cp0 cp0Var = cp0.f16328d;
                pc3 pc3Var = (pc3) obj3;
                yj4 yj4Var = (yj4) obj2;
                lb5.m7910S(zo0Var2, null, cp0Var, new ho0(pc3Var, yj4Var, wm0Var, (byte) 1), 1);
                return lb5.m7910S(zo0Var2, null, cp0Var, new ho0(pc3Var, yj4Var, wm0Var, (byte) 2), 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0858l3(Object obj, Object obj2, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f23752t = b;
        this.f23754v = obj;
        this.f23755w = obj2;
    }
}
