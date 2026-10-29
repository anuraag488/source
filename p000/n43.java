package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n43 extends v53 {

    /* JADX INFO: renamed from: c */
    public static final n43 f25443c = new n43(0, 2, 1);

    @Override // p000.v53
    /* JADX INFO: renamed from: a */
    public final void mo90a(xa0 xa0Var, InterfaceC0618en interfaceC0618en, p84 p84Var, om3 om3Var, w53 w53Var) {
        cr1 cr1Var = (cr1) xa0Var.m12602f(0);
        Object objM12602f = xa0Var.m12602f(1);
        if (objM12602f instanceof mr1) {
            mr1 mr1Var = (mr1) objM12602f;
            om3Var.f26884e.m11663b(mr1Var);
            om3Var.f26883d.m8409a(mr1Var);
        }
        if (p84Var.f27446n != 0) {
            qi0.m9889a("Can only append a slot if not current inserting");
        }
        int i = p84Var.f27441i;
        int i2 = p84Var.f27442j;
        int iM9415c = p84Var.m9415c(cr1Var);
        int iM9418f = p84Var.m9418f(p84Var.f27434b, p84Var.m9428q(iM9415c + 1));
        p84Var.f27441i = iM9418f;
        p84Var.f27442j = iM9418f;
        p84Var.m9434w(1, iM9415c);
        if (i >= iM9418f) {
            i++;
            i2++;
        }
        p84Var.f27435c[iM9418f] = objM12602f;
        p84Var.f27441i = i;
        p84Var.f27442j = i2;
    }
}
