package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p43 extends v53 {

    /* JADX INFO: renamed from: c */
    public static final p43 f27376c = new p43(0, 2, 1);

    @Override // p000.v53
    /* JADX INFO: renamed from: a */
    public final void mo90a(xa0 xa0Var, InterfaceC0618en interfaceC0618en, p84 p84Var, om3 om3Var, w53 w53Var) {
        int i = ((t52) xa0Var.m12602f(0)).f30789a;
        List list = (List) xa0Var.m12602f(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            interfaceC0618en.mo4826b(i3, obj);
            interfaceC0618en.mo4830j(i3, obj);
        }
    }
}
