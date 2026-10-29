package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class we0 extends AbstractC1203u1 {

    /* JADX INFO: renamed from: a */
    public Object f33265a;

    /* JADX INFO: renamed from: b */
    public int f33266b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ ye0 f33267c;

    /* JADX INFO: renamed from: a */
    public final void m12241a() {
        Object obj = this.f33265a;
        ye0 ye0Var = this.f33267c;
        int i = this.f33266b;
        if (i != -1 && i < ye0Var.size()) {
            if (qs5.m10116u(obj, ye0Var.m13106j()[this.f33266b])) {
                return;
            }
        }
        Object obj2 = ye0.f35149j;
        this.f33266b = ye0Var.m13101d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f33265a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        ye0 ye0Var = this.f33267c;
        Map mapM13099b = ye0Var.m13099b();
        if (mapM13099b != null) {
            return mapM13099b.get(this.f33265a);
        }
        m12241a();
        int i = this.f33266b;
        if (i == -1) {
            return null;
        }
        return ye0Var.m13107k()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f33265a;
        ye0 ye0Var = this.f33267c;
        Map mapM13099b = ye0Var.m13099b();
        if (mapM13099b != null) {
            return mapM13099b.put(obj2, obj);
        }
        m12241a();
        int i = this.f33266b;
        if (i == -1) {
            ye0Var.put(obj2, obj);
            return null;
        }
        Object obj3 = ye0Var.m13107k()[i];
        ye0Var.m13107k()[this.f33266b] = obj;
        return obj3;
    }
}
