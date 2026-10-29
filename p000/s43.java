package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s43 extends v53 {

    /* JADX INFO: renamed from: c */
    public static final s43 f29899c = new s43(0, 2, 1);

    @Override // p000.v53
    /* JADX INFO: renamed from: a */
    public final void mo90a(xa0 xa0Var, InterfaceC0618en interfaceC0618en, p84 p84Var, om3 om3Var, w53 w53Var) {
        int i;
        t52 t52Var = (t52) xa0Var.m12602f(0);
        int iM9415c = p84Var.m9415c((cr1) xa0Var.m12602f(1));
        if (p84Var.f27452t >= iM9415c) {
            qi0.m9889a("Check failed");
        }
        k43.m7399x(p84Var, interfaceC0618en, iM9415c);
        int i2 = p84Var.f27452t;
        int iM9395F = p84Var.f27454v;
        while (iM9395F >= 0 && !p84Var.m9435x(iM9395F)) {
            iM9395F = p84Var.m9395F(p84Var.f27434b, iM9395F);
        }
        int iM9431t = iM9395F + 1;
        int iM9402M = 0;
        while (iM9431t < i2) {
            if (p84Var.m9432u(i2, iM9431t)) {
                if (p84Var.m9435x(iM9431t)) {
                    iM9402M = 0;
                }
                iM9431t++;
            } else {
                iM9402M += p84Var.m9435x(iM9431t) ? 1 : p84Var.m9394E(iM9431t);
                iM9431t += p84Var.m9431t(iM9431t);
            }
        }
        while (true) {
            i = p84Var.f27452t;
            if (i >= iM9415c) {
                break;
            }
            if (p84Var.m9432u(iM9415c, i)) {
                int i3 = p84Var.f27452t;
                if (i3 < p84Var.f27453u && (p84Var.f27434b[(p84Var.m9428q(i3) * 5) + 1] & 1073741824) != 0) {
                    interfaceC0618en.mo4827d(p84Var.m9393D(p84Var.f27452t));
                    iM9402M = 0;
                }
                p84Var.m9406Q();
            } else {
                iM9402M += p84Var.m9402M();
            }
        }
        if (i != iM9415c) {
            qi0.m9889a("Check failed");
        }
        t52Var.f30789a = iM9402M;
    }
}
