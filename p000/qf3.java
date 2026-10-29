package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class qf3 extends db0 {

    /* JADX INFO: renamed from: b */
    public final pf3 f28439b;

    public qf3(jc2 jc2Var) {
        super(jc2Var);
        g24 g24VarMo15d = jc2Var.mo15d();
        pf3 pf3Var = new pf3(g24VarMo15d);
        pf3Var.f27579b = g24VarMo15d.mo3641b() + "Array";
        VarHandle.storeStoreFence();
        this.f28439b = pf3Var;
    }

    @Override // p000.AbstractC0966o0, p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        return m8912i(iv0Var);
    }

    @Override // p000.db0, p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        int iMo3843h = mo3843h(obj);
        si0 si0VarMo5918a = g81Var.mo5918a(this.f28439b);
        mo3846n(si0VarMo5918a, obj, iMo3843h);
        si0VarMo5918a.mo6728f();
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return this.f28439b;
    }

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: e */
    public final Object mo8020e() {
        return mo3845m();
    }

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: f */
    public final int mo8021f(Object obj) {
        return ((of3) obj).mo4732d();
    }

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: g */
    public final Iterator mo8022g(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: k */
    public final Object mo8023k(Object obj) {
        return ((of3) obj).mo4730a();
    }

    @Override // p000.db0
    /* JADX INFO: renamed from: l */
    public final void mo4416l(int i, Object obj, Object obj2) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    /* JADX INFO: renamed from: m */
    public of3 mo3845m() {
        w00 w00Var = new w00();
        w00Var.f33002a = new boolean[10];
        w00Var.f33003b = 0;
        return w00Var;
    }

    /* JADX INFO: renamed from: n */
    public void mo3846n(si0 si0Var, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            si0Var.mo6729i(this.f28439b, i2, zArr[i2]);
        }
    }
}
