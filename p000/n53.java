package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n53 extends v53 {

    /* JADX INFO: renamed from: c */
    public static final n53 f25470c = new n53(0, 1, 1);

    @Override // p000.v53
    /* JADX INFO: renamed from: a */
    public final void mo90a(xa0 xa0Var, InterfaceC0618en interfaceC0618en, p84 p84Var, om3 om3Var, w53 w53Var) {
        yk3 yk3Var = (yk3) xa0Var.m12602f(0);
        lw2 lw2Var = om3Var.f26888i;
        o93 o93Var = lw2Var != null ? (o93) lw2Var.m8132g(yk3Var) : null;
        if (o93Var != null) {
            ArrayList arrayList = om3Var.f26889j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                om3Var.f26889j = arrayList;
            }
            arrayList.add(om3Var.f26884e);
            om3Var.f26884e = o93Var.f26493b;
        }
    }
}
