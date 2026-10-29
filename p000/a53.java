package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a53 extends v53 {

    /* JADX INFO: renamed from: d */
    public static final a53 f111d;

    /* JADX INFO: renamed from: e */
    public static final a53 f112e;

    /* JADX INFO: renamed from: f */
    public static final a53 f113f;

    /* JADX INFO: renamed from: g */
    public static final a53 f114g;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ byte f115c;

    static {
        int i = 1;
        f111d = new a53(i, 2, (byte) 0);
        int i2 = 1;
        f112e = new a53(i2, i2, (byte) 1);
        f113f = new a53(i, 2, (byte) 2);
        int i3 = 1;
        f114g = new a53(i3, i3, (byte) 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a53(int i, int i2, byte b) {
        super(i, i2);
        this.f115c = b;
    }

    @Override // p000.v53
    /* JADX INFO: renamed from: a */
    public final void mo90a(xa0 xa0Var, InterfaceC0618en interfaceC0618en, p84 p84Var, om3 om3Var, w53 w53Var) {
        switch (this.f115c) {
            case 0:
                Object objInvoke = ((wp1) xa0Var.m12602f(0)).invoke();
                cr1 cr1Var = (cr1) xa0Var.m12602f(1);
                int iM12600e = xa0Var.m12600e(0);
                cr1Var.getClass();
                p84Var.m9412W(p84Var.m9415c(cr1Var), objInvoke);
                interfaceC0618en.mo4830j(iM12600e, objInvoke);
                interfaceC0618en.mo4827d(objInvoke);
                break;
            case 1:
                cr1 cr1Var2 = (cr1) xa0Var.m12602f(0);
                int iM12600e2 = xa0Var.m12600e(0);
                interfaceC0618en.mo4835u();
                cr1Var2.getClass();
                interfaceC0618en.mo4826b(iM12600e2, p84Var.m9393D(p84Var.m9415c(cr1Var2)));
                break;
            case 2:
                Object objM12602f = xa0Var.m12602f(0);
                cr1 cr1Var3 = (cr1) xa0Var.m12602f(1);
                int iM12600e3 = xa0Var.m12600e(0);
                if (objM12602f instanceof mr1) {
                    mr1 mr1Var = (mr1) objM12602f;
                    om3Var.f26884e.m11663b(mr1Var);
                    om3Var.f26883d.m8409a(mr1Var);
                }
                Object objM9401L = p84Var.m9401L(p84Var.m9415c(cr1Var3), iM12600e3, objM12602f);
                if (objM9401L instanceof mr1) {
                    om3Var.m9188e((mr1) objM9401L);
                } else if (objM9401L instanceof yk3) {
                    ((yk3) objM9401L).m13154c();
                }
                break;
            default:
                Object objM12602f2 = xa0Var.m12602f(0);
                int iM12600e4 = xa0Var.m12600e(0);
                if (objM12602f2 instanceof mr1) {
                    mr1 mr1Var2 = (mr1) objM12602f2;
                    om3Var.f26884e.m11663b(mr1Var2);
                    om3Var.f26883d.m8409a(mr1Var2);
                }
                Object objM9401L2 = p84Var.m9401L(p84Var.f27452t, iM12600e4, objM12602f2);
                if (objM9401L2 instanceof mr1) {
                    om3Var.m9188e((mr1) objM9401L2);
                } else if (objM9401L2 instanceof yk3) {
                    ((yk3) objM9401L2).m13154c();
                }
                break;
        }
    }

    @Override // p000.v53
    /* JADX INFO: renamed from: b */
    public cr1 mo91b(xa0 xa0Var) {
        switch (this.f115c) {
            case 0:
                return (cr1) xa0Var.m12602f(1);
            case 1:
                return (cr1) xa0Var.m12602f(0);
            default:
                return super.mo91b(xa0Var);
        }
    }
}
