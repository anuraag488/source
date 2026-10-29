package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yu4 implements pg2, Serializable {

    /* JADX INFO: renamed from: a */
    public wp1 f35542a;

    /* JADX INFO: renamed from: b */
    public Object f35543b;

    @Override // p000.pg2
    public final Object getValue() {
        Object obj = this.f35543b;
        if (obj != o85.f26458r) {
            return obj;
        }
        Object objInvoke = this.f35542a.invoke();
        this.f35543b = objInvoke;
        this.f35542a = null;
        return objInvoke;
    }

    public final String toString() {
        return this.f35543b != o85.f26458r ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
