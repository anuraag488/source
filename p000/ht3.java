package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ht3 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f20847t;

    /* JADX INFO: renamed from: u */
    public boolean f20848u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ cf0 f20849v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ht3(cf0 cf0Var, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f20847t = b;
        this.f20849v = cf0Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f20847t;
        cf0 cf0Var = this.f20849v;
        switch (b) {
            case 0:
                return new ht3(cf0Var, wm0Var, (byte) 0);
            default:
                return new ht3(cf0Var, wm0Var, (byte) 1);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20847t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((ht3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return new ht3(this.f20849v, (wm0) obj2, (byte) 1).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f20847t;
        cf0 cf0Var = this.f20849v;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f20848u;
                if (!z) {
                    k43.m7376J(obj);
                    this.f20848u = true;
                    Object objM5007w = cf0Var.m5007w(this);
                    return objM5007w == ap0Var ? ap0Var : objM5007w;
                }
                if (z) {
                    k43.m7376J(obj);
                    return obj;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f20848u;
                if (!z2) {
                    k43.m7376J(obj);
                    this.f20848u = true;
                    if (cf0Var.mo3997v(this) == ap0Var2) {
                        return ap0Var2;
                    }
                } else {
                    if (!z2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
        }
    }
}
