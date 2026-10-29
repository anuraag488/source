package p000;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class du3 implements pg2, Serializable {

    /* JADX INFO: renamed from: c */
    public static final AtomicReferenceFieldUpdater f17411c = AtomicReferenceFieldUpdater.newUpdater(du3.class, Object.class, "b");

    /* JADX INFO: renamed from: a */
    public volatile wp1 f17412a;

    /* JADX INFO: renamed from: b */
    public volatile Object f17413b;

    @Override // p000.pg2
    public final Object getValue() {
        Object obj = this.f17413b;
        o85 o85Var = o85.f26458r;
        if (obj != o85Var) {
            return obj;
        }
        wp1 wp1Var = this.f17412a;
        if (wp1Var != null) {
            Object objInvoke = wp1Var.invoke();
            if (f17411c.compareAndSet(this, o85Var, objInvoke)) {
                this.f17412a = null;
                return objInvoke;
            }
        }
        return this.f17413b;
    }

    public final String toString() {
        return this.f17413b != o85.f26458r ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
