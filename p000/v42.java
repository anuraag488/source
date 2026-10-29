package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v42 implements ai3, og2 {

    /* JADX INFO: renamed from: a */
    public Object f32392a;

    /* JADX INFO: renamed from: a */
    public static v42 m11746a(Object obj) {
        if (obj == null) {
            xy4.m12782k("instance cannot be null");
            return null;
        }
        v42 v42Var = new v42();
        v42Var.f32392a = obj;
        VarHandle.storeStoreFence();
        return v42Var;
    }

    @Override // p000.ai3
    public final Object get() {
        return this.f32392a;
    }
}
