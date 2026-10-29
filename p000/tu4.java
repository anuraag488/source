package p000;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tu4 extends xu4 {

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Method f31459b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f31460c;

    @Override // p000.xu4
    /* JADX INFO: renamed from: a */
    public final Object mo11164a(Class cls) {
        String strM13302t = z32.m13302t(cls);
        if (strM13302t == null) {
            return this.f31459b.invoke(this.f31460c, cls);
        }
        C1077qn.m9985k("UnsafeAllocator is used for non-instantiable type: ".concat(strM13302t));
        return null;
    }
}
