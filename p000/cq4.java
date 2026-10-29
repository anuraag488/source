package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cq4 extends aq4 {

    /* JADX INFO: renamed from: d */
    public ma3 f16376d;

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f14780c;
        this.f14780c = i + 2;
        ma3 ma3Var = this.f16376d;
        Object[] objArr = this.f14778a;
        Object obj = objArr[i];
        Object obj2 = objArr[i + 1];
        uv2 uv2Var = new uv2(obj, obj2);
        uv2Var.f32205d = ma3Var;
        uv2Var.f32206e = obj2;
        VarHandle.storeStoreFence();
        return uv2Var;
    }
}
