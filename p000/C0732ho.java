package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ho */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0732ho implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a */
    public int f20738a;

    /* JADX INFO: renamed from: b */
    public int f20739b;

    /* JADX INFO: renamed from: c */
    public boolean f20740c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ C0805jo f20741d;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        C0805jo c0805jo = this.f20741d;
        if (!this.f20740c) {
            C1077qn.m9989o("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (z62.m13387o(entry.getKey(), c0805jo.m12500e(this.f20739b)) && z62.m13387o(entry.getValue(), c0805jo.m12503i(this.f20739b))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f20740c) {
            return this.f20741d.m12500e(this.f20739b);
        }
        C1077qn.m9989o("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f20740c) {
            return this.f20741d.m12503i(this.f20739b);
        }
        C1077qn.m9989o("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20739b < this.f20738a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C0805jo c0805jo = this.f20741d;
        if (!this.f20740c) {
            C1077qn.m9989o("This container does not support retaining Map.Entry objects");
            return 0;
        }
        Object objM12500e = c0805jo.m12500e(this.f20739b);
        Object objM12503i = c0805jo.m12503i(this.f20739b);
        return (objM12500e == null ? 0 : objM12500e.hashCode()) ^ (objM12503i != null ? objM12503i.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            xy4.m12795x();
            return null;
        }
        this.f20739b++;
        this.f20740c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f20740c) {
            xy4.m12787p();
            return;
        }
        this.f20741d.m12501f(this.f20739b);
        this.f20739b--;
        this.f20738a--;
        this.f20740c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f20740c) {
            return this.f20741d.m12502h(this.f20739b, obj);
        }
        C1077qn.m9989o("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
