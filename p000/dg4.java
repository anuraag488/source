package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dg4 implements pg2, Serializable {

    /* JADX INFO: renamed from: a */
    public wp1 f17041a;

    /* JADX INFO: renamed from: b */
    public volatile Object f17042b = o85.f26458r;

    /* JADX INFO: renamed from: c */
    public final Object f17043c = this;

    public dg4(wp1 wp1Var) {
        this.f17041a = wp1Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4507a() {
        return this.f17042b != o85.f26458r;
    }

    @Override // p000.pg2
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f17042b;
        o85 o85Var = o85.f26458r;
        if (obj != o85Var) {
            return obj;
        }
        synchronized (this.f17043c) {
            objInvoke = this.f17042b;
            if (objInvoke == o85Var) {
                objInvoke = this.f17041a.invoke();
                this.f17042b = objInvoke;
                this.f17041a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return m4507a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
