package p000;

/* JADX INFO: renamed from: qw */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1086qw extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f28837t;

    /* JADX INFO: renamed from: u */
    public boolean f28838u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ InterfaceC0961nw f28839v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ yp1 f28840w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1086qw(wm0 wm0Var, InterfaceC0961nw interfaceC0961nw, yp1 yp1Var, byte b) {
        super(2, wm0Var);
        this.f28837t = b;
        this.f28839v = interfaceC0961nw;
        this.f28840w = yp1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        switch (this.f28837t) {
            case 0:
                return new C1086qw(wm0Var, this.f28839v, this.f28840w, (byte) 0);
            default:
                return new C1086qw(wm0Var, this.f28839v, this.f28840w, (byte) 1);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28837t;
        ju4 ju4Var = ju4.f22634a;
        zo0 zo0Var = (zo0) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((C1086qw) create(wm0Var, zo0Var)).invokeSuspend(ju4Var);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        Object objM10807c;
        Object objM10807c2;
        byte b = this.f28837t;
        yp1 yp1Var = this.f28840w;
        InterfaceC0961nw interfaceC0961nw = this.f28839v;
        Object obj2 = ju4.f22634a;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f28838u;
                try {
                    if (!z) {
                        k43.m7376J(obj);
                        this.f28838u = true;
                        if (interfaceC0961nw.mo8865c(this) == ap0Var) {
                            return ap0Var;
                        }
                    } else {
                        if (!z) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                    }
                    objM10807c = obj2;
                    break;
                } catch (Throwable th) {
                    sc6.m10643O(th);
                    objM10807c = sj3.m10807c(th);
                }
                if (objM10807c instanceof yc1) {
                    ((yc1) objM10807c).f35112a.printStackTrace();
                    yp1Var.invoke("Failed to backup your data!");
                }
                return obj2;
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f28838u;
                try {
                    if (!z2) {
                        k43.m7376J(obj);
                        this.f28838u = true;
                        if (interfaceC0961nw.mo8866e(this) == ap0Var2) {
                            return ap0Var2;
                        }
                    } else {
                        if (!z2) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                    }
                    objM10807c2 = obj2;
                    break;
                } catch (Throwable th2) {
                    sc6.m10643O(th2);
                    objM10807c2 = sj3.m10807c(th2);
                }
                if (objM10807c2 instanceof yc1) {
                    ((yc1) objM10807c2).f35112a.printStackTrace();
                    yp1Var.invoke("Failed to restore your data!");
                }
                return obj2;
        }
    }
}
