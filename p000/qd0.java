package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qd0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f28391t;

    /* JADX INFO: renamed from: u */
    public boolean f28392u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ rd0 f28393v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qd0(rd0 rd0Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f28391t = b;
        this.f28393v = rd0Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f28391t;
        rd0 rd0Var = this.f28393v;
        switch (b) {
            case 0:
                return new qd0(rd0Var, wm0Var, (byte) 0);
            case 1:
                return new qd0(rd0Var, wm0Var, (byte) 1);
            default:
                return new qd0(rd0Var, wm0Var, (byte) 2);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28391t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((qd0) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f28391t;
        ju4 ju4Var = ju4.f22634a;
        rd0 rd0Var = this.f28393v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f28392u;
                if (!z) {
                    k43.m7376J(obj);
                    long jMo5858c = ((fy4) sj3.m10825u(rd0Var, ij0.f21485t)).mo5858c();
                    this.f28392u = true;
                    if (d24.m4317r(jMo5858c, this) == ap0Var) {
                        return ap0Var;
                    }
                } else {
                    if (!z) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                wp1 wp1Var = rd0Var.f29165K;
                if (wp1Var != null) {
                    wp1Var.invoke();
                }
                if (rd0Var.f29166L) {
                    ((fv1) sj3.m10825u(rd0Var, ij0.f21477l)).mo5818a(0);
                }
                rd0Var.f29173S = true;
                t82 t82Var = rd0Var.f29171Q;
                if (t82Var != null) {
                    t82Var.mo4993a(null);
                }
                rd0Var.f29171Q = null;
                rd0Var.f29170P = null;
                return ju4Var;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f28392u;
                if (!z2) {
                    k43.m7376J(obj);
                    long jMo5858c2 = ((fy4) sj3.m10825u(rd0Var, ij0.f21485t)).mo5858c();
                    this.f28392u = true;
                    if (d24.m4317r(jMo5858c2, this) == ap0Var2) {
                        return ap0Var2;
                    }
                } else {
                    if (!z2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                wp1 wp1Var2 = rd0Var.f29165K;
                if (wp1Var2 != null) {
                    wp1Var2.invoke();
                }
                if (rd0Var.f29166L) {
                    ((fv1) sj3.m10825u(rd0Var, ij0.f21477l)).mo5818a(0);
                }
                rd0Var.f29180Z = true;
                t82 t82Var2 = rd0Var.f29178X;
                if (t82Var2 != null) {
                    t82Var2.mo4993a(null);
                }
                rd0Var.f29178X = null;
                rd0Var.f29177W = null;
                return ju4Var;
            default:
                ap0 ap0Var3 = ap0.f14763a;
                boolean z3 = this.f28392u;
                if (!z3) {
                    k43.m7376J(obj);
                    long jMo5858c3 = ((fy4) sj3.m10825u(rd0Var, ij0.f21485t)).mo5858c();
                    this.f28392u = true;
                    if (d24.m4317r(jMo5858c3, this) == ap0Var3) {
                        return ap0Var3;
                    }
                } else {
                    if (!z3) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                wp1 wp1Var3 = rd0Var.f29165K;
                if (wp1Var3 == null) {
                    return ju4Var;
                }
                wp1Var3.invoke();
                return ju4Var;
        }
    }
}
