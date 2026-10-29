package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i80 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f21162t = 0;

    /* JADX INFO: renamed from: u */
    public boolean f21163u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f21164v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ l80 f21165w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ti1 f21166x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i80(l80 l80Var, ti1 ti1Var, Object obj, wm0 wm0Var) {
        super(2, wm0Var);
        this.f21165w = l80Var;
        this.f21166x = ti1Var;
        this.f21164v = obj;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f21162t;
        ti1 ti1Var = this.f21166x;
        l80 l80Var = this.f21165w;
        switch (b) {
            case 0:
                return new i80(l80Var, ti1Var, this.f21164v, wm0Var);
            default:
                i80 i80Var = new i80(l80Var, ti1Var, wm0Var);
                i80Var.f21164v = obj;
                return i80Var;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21162t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((i80) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f21162t;
        ju4 ju4Var = ju4.f22634a;
        ti1 ti1Var = this.f21166x;
        l80 l80Var = this.f21165w;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f21163u;
                if (z) {
                    if (z) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                nq1 nq1Var = l80Var.f23841e;
                Object obj2 = this.f21164v;
                this.f21163u = true;
                return nq1Var.invoke(ti1Var, obj2, this) == ap0Var ? ap0Var : ju4Var;
            default:
                zo0 zo0Var = (zo0) this.f21164v;
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f21163u;
                if (z2) {
                    if (z2) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                ql3 ql3Var = new ql3();
                si1 si1Var = l80Var.f19653d;
                k80 k80Var = new k80((byte) 0);
                k80Var.f22976b = ql3Var;
                k80Var.f22977c = zo0Var;
                k80Var.f22978d = l80Var;
                k80Var.f22979e = ti1Var;
                VarHandle.storeStoreFence();
                this.f21164v = null;
                this.f21163u = true;
                return si1Var.collect(k80Var, this) == ap0Var2 ? ap0Var2 : ju4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i80(l80 l80Var, ti1 ti1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f21165w = l80Var;
        this.f21166x = ti1Var;
    }
}
