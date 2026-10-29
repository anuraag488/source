package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ll2 extends AbstractC0966o0 {

    /* JADX INFO: renamed from: a */
    public final jc2 f24123a;

    /* JADX INFO: renamed from: b */
    public final jc2 f24124b;

    /* JADX INFO: renamed from: c */
    public final kl2 f24125c;

    public ll2(jc2 jc2Var, jc2 jc2Var2) {
        this.f24123a = jc2Var;
        this.f24124b = jc2Var2;
        g24 g24VarMo15d = jc2Var.mo15d();
        g24 g24VarMo15d2 = jc2Var2.mo15d();
        kl2 kl2Var = new kl2();
        kl2Var.f23212a = g24VarMo15d;
        kl2Var.f23213b = g24VarMo15d2;
        VarHandle.storeStoreFence();
        this.f24125c = kl2Var;
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        ((Map) obj).size();
        kl2 kl2Var = this.f24125c;
        si0 si0VarMo5918a = g81Var.mo5918a(kl2Var);
        Iterator itMo8022g = mo8022g(obj);
        int i = 0;
        while (itMo8022g.hasNext()) {
            Map.Entry entry = (Map.Entry) itMo8022g.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            si0VarMo5918a.mo6734s(kl2Var, i, this.f24123a, key);
            i += 2;
            si0VarMo5918a.mo6734s(kl2Var, i2, this.f24124b, value);
        }
        si0VarMo5918a.mo6728f();
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return this.f24125c;
    }

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: e */
    public final Object mo8020e() {
        return new LinkedHashMap();
    }

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: f */
    public final int mo8021f(Object obj) {
        return ((LinkedHashMap) obj).size() * 2;
    }

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: g */
    public final Iterator mo8022g(Object obj) {
        return ((Map) obj).entrySet().iterator();
    }

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: h */
    public final int mo3843h(Object obj) {
        throw null;
    }

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: j */
    public final void mo3844j(ri0 ri0Var, int i, Object obj) {
        Map map = (Map) obj;
        jc2 jc2Var = this.f24123a;
        kl2 kl2Var = this.f24125c;
        Object objMo5402y = ri0Var.mo5402y(kl2Var, i, jc2Var, null);
        int iMo6325j = ri0Var.mo6325j(kl2Var);
        if (iMo6325j != i + 1) {
            C1077qn.m9988n(zi4.m13618r(i, iMo6325j, "Value must follow key in a map, index for key: ", ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objMo5402y);
        jc2 jc2Var2 = this.f24124b;
        map.put(objMo5402y, (!zContainsKey || (jc2Var2.mo15d().mo4431c() instanceof tf3)) ? ri0Var.mo5402y(kl2Var, iMo6325j, jc2Var2, null) : ri0Var.mo5402y(kl2Var, iMo6325j, jc2Var2, eq2.m5273L(objMo5402y, map)));
    }

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: k */
    public final Object mo8023k(Object obj) {
        return (LinkedHashMap) obj;
    }
}
