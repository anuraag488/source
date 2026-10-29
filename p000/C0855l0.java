package p000;

/* JADX INFO: renamed from: l0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0855l0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f23656t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ AbstractC0892m0 f23657u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0855l0(AbstractC0892m0 abstractC0892m0, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f23656t = b;
        this.f23657u = abstractC0892m0;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f23656t;
        AbstractC0892m0 abstractC0892m0 = this.f23657u;
        switch (b) {
            case 0:
                return new C0855l0(abstractC0892m0, wm0Var, (byte) 0);
            default:
                return new C0855l0(abstractC0892m0, wm0Var, (byte) 1);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f23656t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                ((C0855l0) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
                break;
            default:
                ((C0855l0) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
                break;
        }
        return ju4Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f23656t;
        ju4 ju4Var = ju4.f22634a;
        wm0 wm0Var = null;
        AbstractC0892m0 abstractC0892m0 = this.f23657u;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                k43.m7376J(obj);
                if (abstractC0892m0.f24493D == null) {
                    mx1 mx1Var = new mx1();
                    nv2 nv2Var = abstractC0892m0.f24500q;
                    if (nv2Var != null) {
                        lb5.m7910S(abstractC0892m0.m8391C0(), null, null, new C0594e0((Object) nv2Var, (Object) mx1Var, wm0Var, (byte) 0), 3);
                    }
                    abstractC0892m0.f24493D = mx1Var;
                }
                break;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                k43.m7376J(obj);
                mx1 mx1Var2 = abstractC0892m0.f24493D;
                if (mx1Var2 != null) {
                    nx1 nx1Var = new nx1(mx1Var2);
                    nv2 nv2Var2 = abstractC0892m0.f24500q;
                    if (nv2Var2 != null) {
                        lb5.m7910S(abstractC0892m0.m8391C0(), null, null, new C0594e0((Object) nv2Var2, (Object) nx1Var, wm0Var, (byte) 1), 3);
                    }
                    abstractC0892m0.f24493D = null;
                }
                break;
        }
        return ju4Var;
    }
}
