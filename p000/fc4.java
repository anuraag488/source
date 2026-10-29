package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fc4 implements Map.Entry, ec2 {

    /* JADX INFO: renamed from: a */
    public Object f18907a;

    /* JADX INFO: renamed from: b */
    public Object f18908b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ gc4 f18909c;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f18907a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f18908b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        gc4 gc4Var = this.f18909c;
        y94 y94Var = (y94) gc4Var.f23687c;
        if (y94Var.m13054e().f34084d != gc4Var.f23686b) {
            C1077qn.m9983c();
            return null;
        }
        Object obj2 = this.f18908b;
        y94Var.put(this.f18907a, obj);
        this.f18908b = obj;
        return obj2;
    }
}
