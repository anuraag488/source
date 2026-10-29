package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class db0 extends AbstractC0966o0 {

    /* JADX INFO: renamed from: a */
    public final jc2 f16892a;

    public db0(jc2 jc2Var) {
        this.f16892a = jc2Var;
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public void mo14c(g81 g81Var, Object obj) {
        int iMo3843h = mo3843h(obj);
        si0 si0VarMo5918a = g81Var.mo5918a(mo15d());
        Iterator itMo8022g = mo8022g(obj);
        for (int i = 0; i < iMo3843h; i++) {
            si0VarMo5918a.mo6734s(mo15d(), i, this.f16892a, itMo8022g.next());
        }
        si0VarMo5918a.mo6728f();
    }

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: j */
    public void mo3844j(ri0 ri0Var, int i, Object obj) {
        mo4416l(i, obj, ri0Var.mo5402y(mo15d(), i, this.f16892a, null));
    }

    /* JADX INFO: renamed from: l */
    public void mo4416l(int i, Object obj, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }
}
