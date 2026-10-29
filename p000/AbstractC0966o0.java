package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: o0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0966o0 implements jc2 {
    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public Object mo13b(iv0 iv0Var) {
        return m8912i(iv0Var);
    }

    /* JADX INFO: renamed from: e */
    public Object mo8020e() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: f */
    public int mo8021f(Object obj) {
        return ((ArrayList) obj).size();
    }

    /* JADX INFO: renamed from: g */
    public Iterator mo8022g(Object obj) {
        return ((Collection) obj).iterator();
    }

    /* JADX INFO: renamed from: h */
    public int mo3843h(Object obj) {
        return ((Collection) obj).size();
    }

    /* JADX INFO: renamed from: i */
    public final Object m8912i(iv0 iv0Var) {
        ri0 ri0VarMo5382a = iv0Var.mo5382a(mo15d());
        mo15d();
        Object objMo8020e = mo8020e();
        int iMo8021f = mo8021f(objMo8020e);
        while (true) {
            int iMo6325j = ri0VarMo5382a.mo6325j(mo15d());
            if (iMo6325j == -1) {
                ri0VarMo5382a.mo5398u(mo15d());
                return mo8023k(objMo8020e);
            }
            mo3844j(ri0VarMo5382a, iMo6325j + iMo8021f, objMo8020e);
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo3844j(ri0 ri0Var, int i, Object obj);

    /* JADX INFO: renamed from: k */
    public Object mo8023k(Object obj) {
        return (ArrayList) obj;
    }
}
