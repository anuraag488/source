package p000;

import java.lang.invoke.VarHandle;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w12 extends ru4 {

    /* JADX INFO: renamed from: e */
    public ru4 f33020e;

    /* JADX INFO: renamed from: f */
    public Object f33021f;

    /* JADX INFO: renamed from: g */
    public ru4 f33022g;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33022g.hasNext() || this.f33020e.hasNext();
    }

    @Override // p000.ru4, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!this.f33022g.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f33020e.next();
            this.f33021f = entry.getKey();
            this.f33022g = ((o12) entry.getValue()).mo6038l();
        }
        Object obj = this.f33021f;
        Objects.requireNonNull(obj);
        Object next = this.f33022g.next();
        p12 p12Var = new p12();
        p12Var.f27286a = obj;
        p12Var.f27287b = next;
        VarHandle.storeStoreFence();
        return p12Var;
    }
}
