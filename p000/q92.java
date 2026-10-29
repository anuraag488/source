package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q92 implements jc2 {

    /* JADX INFO: renamed from: a */
    public static final q92 f28321a = new q92();

    /* JADX INFO: renamed from: b */
    public static final p92 f28322b = p92.f27465b;

    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        zt5.m13778i(iv0Var);
        return new n92((List) new C0534co(ea2.f17925a).m8912i(iv0Var));
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        zt5.m13779j(g81Var);
        ea2 ea2Var = ea2.f17925a;
        C0498bo c0498bo = new C0498bo(ea2.f17926b);
        List list = ((n92) obj).f25566a;
        int size = list.size();
        si0 si0VarMo5918a = g81Var.mo5918a(c0498bo);
        Iterator it = list.iterator();
        for (int i = 0; i < size; i++) {
            si0VarMo5918a.mo6734s(c0498bo, i, ea2Var, it.next());
        }
        si0VarMo5918a.mo6728f();
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return f28322b;
    }
}
