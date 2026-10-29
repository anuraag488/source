package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q53 extends v53 {

    /* JADX INFO: renamed from: c */
    public static final q53 f28227c = new q53(1, 0, 2);

    @Override // p000.v53
    /* JADX INFO: renamed from: a */
    public final void mo90a(xa0 xa0Var, InterfaceC0618en interfaceC0618en, p84 p84Var, om3 om3Var, w53 w53Var) {
        int iM12600e = xa0Var.m12600e(0);
        int i = p84Var.f27454v;
        int iM9404O = p84Var.m9404O(p84Var.f27434b, p84Var.m9428q(i));
        int iM9418f = p84Var.m9418f(p84Var.f27434b, p84Var.m9428q(i + 1));
        for (int iMax = Math.max(iM9404O, iM9418f - iM12600e); iMax < iM9418f; iMax++) {
            Object obj = p84Var.f27435c[p84Var.m9419g(iMax)];
            if (obj instanceof mr1) {
                om3Var.m9188e((mr1) obj);
            } else if (obj instanceof yk3) {
                ((yk3) obj).m13154c();
            }
        }
        if (iM12600e <= 0) {
            qi0.m9889a("Check failed");
        }
        int i2 = p84Var.f27454v;
        int iM9404O2 = p84Var.m9404O(p84Var.f27434b, p84Var.m9428q(i2));
        int iM9418f2 = p84Var.m9418f(p84Var.f27434b, p84Var.m9428q(i2 + 1)) - iM12600e;
        if (iM9418f2 < iM9404O2) {
            qi0.m9889a("Check failed");
        }
        p84Var.m9400K(iM9418f2, iM12600e, i2);
        int i3 = p84Var.f27441i;
        if (i3 >= iM9404O2) {
            p84Var.f27441i = i3 - iM12600e;
        }
    }
}
